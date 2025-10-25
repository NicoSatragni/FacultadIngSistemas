#include <iostream> //cout,cin
#include <vector> //vectores
#include <string> // string

using namespace std;

enum TipoArco {ARBOL, BACK, FORWARD, CROSS};

struct Clasificacion {
    int u;
    int v;
    TipoArco tipo;

    string toString() const {
        string t;
        switch (tipo) {
            case ARBOL:    t = "Árbol";     break;
            case BACK:    t = "Retroceso"; break;
            case FORWARD: t = "Avance";    break;
            case CROSS:   t = "Cruce";     break;
        }
        return to_string(u) + " -> " + to_string(v) + " : " + t;
    }
};

struct Grafo {
    int n;
    vector<vector<int>> ListAdy;
    bool dirigido;

    Grafo(int n, bool esDirigido): n(n), ListAdy(n), dirigido(esDirigido) {};


    void agregarArco(int viejo, int nuevo) {
        ListAdy[viejo].push_back(nuevo);
        if (!dirigido)
            ListAdy[nuevo].push_back(viejo);    
    }
};

enum Marca {BLANCO, GRIS, NEGRO};

vector<int> d, f, parents;
vector<Marca> marca;
vector<Clasificacion> clasifs;
int tiempo;

void DFS(Grafo const &G, int Origen) {
    tiempo ++;
    d[Origen] = tiempo;
    parents[Origen];
    marca[Origen] = GRIS;
    for (int v : G.ListAdy[Origen])
    {
        if (marca[v] == BLANCO)
        {
            parents[v] = Origen;
            clasifs.push_back({Origen,v, ARBOL});
            DFS(G,v); 
        } else if (marca[v] == GRIS)
            clasifs.push_back({Origen,v,BACK});
        else {
            if (d[Origen] < d[v])
                clasifs.push_back({Origen, v, FORWARD});
            else
                clasifs.push_back({Origen, v, CROSS});
        }
        
    }
    marca[Origen] = NEGRO;
    tiempo++;
    f[Origen] = tiempo;
    cout << clasifs.back().toString() << endl;
    // Clasificacion c = clasifs.back();
    // cout << "(" << c.u << ", " << c.v << ") ";
    // if (c.tipo == 0)
    //     cout << "ARBOL";
    // else if(c.tipo == 1)
    //     cout << "BACK";
    // else if(c.tipo == 2)
    //     cout << "FORWARD";
    // else if(c.tipo == 3)
    //     cout << "CROSS";
    
}

void DFS_Forest(Grafo const &G) {
    d.assign(G.n,0);
    f.assign(G.n,0);
    parents.assign(G.n, -1);
    marca.assign(G.n, BLANCO);
    clasifs.clear();
    tiempo = 0;

    for (int i = 0; i < G.n; i++)
        if (marca[i] == BLANCO)
            DFS(G,i);
}

int main() {
    // Ejemplo: grafo con 6 vértices
    Grafo G(6, true);

    // Agregamos arcos (ejemplo inventado, adaptá a tu grafo del TP)
    G.agregarArco(0,1);
    G.agregarArco(0,2);
    G.agregarArco(1,3);
    G.agregarArco(2,3);
    G.agregarArco(3,4);
    G.agregarArco(4,5);
    G.agregarArco(5,3); // ciclo

    DFS_Forest(G);

    // cout << "Clasificacion de arcos:\n";
    // for (auto const &e : clasifs) {
    //     cout << e.u << " -> " << e.v << " : " << tipo_str(e.tipo) << "\n";
    // }
    return 0;
}
