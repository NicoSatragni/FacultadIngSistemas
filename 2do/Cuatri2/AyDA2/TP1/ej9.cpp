#include <map>
#include <vector>
#include <iostream>
#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafoRotulado.hpp"
using namespace std;

template<class V, class C>
void DFS(const GrafoRotulado<V,C>& g, const V& inicio, const V& fin, map<V,bool>& visitados, vector<V>& camino, int& caminos) {

    visitados[inicio] = true;
    camino.push_back(inicio);

    if(inicio == fin) {
        cout << "Camino " << ++caminos << ":\n";
        for (auto &v : camino)
            cout << v << " -> ";
        cout << "\\\n";
    } else {
        for(const auto& v : g.getAdyacentes(inicio))
            if(!(visitados[v]) && g.getPeso(inicio, v))
                DFS(g,v,fin,visitados,camino,caminos);
    }
    camino.pop_back();
    visitados[inicio] = false;
}



template<class V, class C>
void buscarCaminos(const GrafoRotulado<V,C>& g, const V& inicio, const V& fin) {
    map<V,bool> visitados;
    vector<V> camino;
    int caminos = 0;
    for(auto& v : g.getVertices())
        visitados[v] = false;
    
        DFS(g,inicio,fin,visitados,camino,caminos);
}


int main() {

    GrafoRotulado<string,bool> g(true);

    g.addArco("Balcarce","Quilmes", true);
    g.addArco("Quilmes","Rauch", false);
    g.addArco("Ayacucho","Rauch", true);
    g.addArco("Rauch","Avellaneda", true);
    g.addArco("Rauch","CABA", true);
    g.addArco("Avellaneda","Lanús", true);
    g.addArco("Mar del Plata","Miramar", true);
    g.addArco("CABA","Quilmes", true);
    g.addArco("Tandil","Balcarce", true);
    g.addArco("Tandil","Ayacucho", true);

    buscarCaminos(g,string("CABA"), string("Tandil"));

    return 0;
}