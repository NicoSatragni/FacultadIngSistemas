#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafo.hpp"
#include <iostream>
#include <queue>
#include <map>
#include <limits>
#include <string>
using namespace std;

template<class V>
void BFS(const Grafo<V>& g, const V& Origen, map<V,int>& D, map<V,V>& P) {
    const int INF = numeric_limits<int>::max();

    for (const V& v : g.getVertices()) {
        D[v] = INF;
    }

    D[Origen] = 0;
    P.erase(Origen);

    queue<V> Q;
    Q.push(Origen);

    while (!Q.empty()) {
        V u = Q.front();
        Q.pop();
        
        for(const V& v : g.getAdyacentes(u)) {
            if (D[v] == INF){
                D[v] = D[u] + 1;
                P[v] = u;
                Q.push(v);
            }
        }
    
    }
}

template<class V>
void reconstruirCamino(const V& Origen, const V& Destino, const map<V, V>& P) {
    
}



int main() {

    Grafo<string> g(true);

    g.addArco("r","v");
    g.addArco("r","s");
    g.addArco("s","w");
    g.addArco("w","x");
    g.addArco("w","t");
    g.addArco("x","y");
    g.addArco("x","u");
    g.addArco("x","t");
    g.addArco("t","u");
    g.addArco("t","x");
    g.addArco("y","u");
    g.addArco("u","x");
    g.addArco("u","y");
    g.addArco("u","t");
    
    map<string,int> D;
    map<string,string> P;

    BFS(g, (string) "r", D, P);

    cout << "Distancias: " << endl;
    for (const auto& v : D)
        cout << "{" << v.first << ", " << v.second << "}" << endl;
    cout << "predecesores: " << endl;
    for(const auto& v: P)
        cout << "{" << v.first << ", " << v.second << "}" << endl;
    
    
    return 0;
}