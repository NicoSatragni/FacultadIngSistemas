#include <map>
#include <vector>
#include <iostream>
#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafo.hpp"
using namespace std;


template<class V>
void DFS(const Grafo<V>& g, const V& dado, const V& actual, const int& l, vector<V>& camino, int& lCamino, int& caminos, map<V,bool>& visitados) {

    lCamino++;
    camino.push_back(actual);
    visitados[actual] = true;

    if(actual == dado) {
        if(lCamino == l) {
            cout << "Camino " << ++caminos << ":";
            for(const auto& v : camino)
                cout << v << " -> ";
            cout << "\\\n";
        }
    } else {
        for(const auto& v : g.getAdyacentes(actual))
            if(!visitados[v])
                DFS(g,dado,v,l,camino,lCamino,caminos,visitados);
    }
    lCamino--;
    camino.pop_back();
    visitados[actual] = false;
}




template<class V>
void buscarCaminos(const Grafo<V>& g, const V& dado, const int& l) {
    vector<V> camino;
    map<V,bool> visitados;
    int lCamino = 0;
    int caminos = 0;

    for(auto& v : g.getVertices())
        visitados[v] = false;

    for(const auto& v : g.getVertices())
        DFS(g,dado,v,l,camino,lCamino,caminos,visitados);
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
    g.addArco("T7","T5");
    g.addArco("T11","T3");
    g.addArco("T11","T8");

    buscarCaminos(g,string("T7"), 4);

    return 0;
}