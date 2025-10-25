#include <iostream>
#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafo.hpp"
#include <vector>
#include <algorithm>
using namespace std;

template <class V>
void DFS(const Grafo<V>& g, map<V,int>& D, map<V,int>& F, const V& Origen, map<V, bool>& vis, int& tiempo, vector<V>& orden) {
    vis[Origen] = true;
    D[Origen] = ++tiempo;

    for (const V& v : g.getAdyacentes(Origen))
        if(!vis[v])
            DFS(g,D,F,v,vis,tiempo,orden);

    F[Origen] = ++tiempo;
    orden.push_back(Origen);
}

template<class V>
vector <V> ordenTopologico(const Grafo<V> g, map<V,int>& D, map<V,int>& F) {
    map<V,bool> visitados;
    vector<V> orden;
    int tiempo = 0;

    for (auto& v: g.getVertices()) {
        visitados[v] = false;
        D[v] = F[v] = 0;
    }

    for(auto& v: g.getVertices()) 
        if(!visitados[v])
            DFS(g, D, F, v, visitados, tiempo, orden);

    reverse(orden.begin(), orden.end());
    return orden;
}


int main() {

    Grafo<string> g(false);

    g.addArco("T3","T5");
    g.addArco("T5","T1");
    g.addArco("T8","T1");
    g.addArco("T1","T4");
    g.addArco("T1","T7");
    g.addArco("T4","T2");
    g.addArco("T6","T9");

    map<string,int> tD, tF;

    auto orden = ordenTopologico(g,tD, tF);

    cout << "Orden: " << endl;
    for(auto& v : orden)
        cout << v << endl;

    return 0;
}