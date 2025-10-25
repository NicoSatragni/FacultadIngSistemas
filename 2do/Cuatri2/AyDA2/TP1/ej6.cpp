#include <map>
#include <vector>
#include <iostream>
#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafoRotulado.hpp"
using namespace std;

template<class V, class C>
void DFS(const GrafoRotulado<V,C>& g, const V& ini, const V& fin, vector<V>& camino, int& caminos, map<V,bool>& visitados) {

    camino.push_back(ini);
    visitados[ini] = true;
    if(ini == fin) {
        cout << "Camino " << caminos++ << ":";
        for(const auto& v : camino){
            cout << v << " -> ";
        }
        cout << "/\n";
        camino.pop_back();
        visitados[ini] = false;
        return;
    }

    for(const auto& v : g.getAdyacentes(ini)) {
        if(!visitados[v])
            DFS(g,v,fin,camino,caminos,visitados);
    }
    camino.pop_back();
    visitados[ini] = false;
}




template<class V,class C>
void buscarCaminos(const GrafoRotulado<V,C>& g, const V& ini, const V& fin) {
    vector<V> camino;
    int caminos = 1;
    map<V,bool> visitados;
    for(auto& v : g.getVertices())
        visitados[v] = false;
    DFS(g, ini, fin, camino, caminos, visitados);
}




int main() {

    GrafoRotulado<string,int> g(false);

    g.addArco("T3","T5", 3);
    g.addArco("T5","T1", 2);
    g.addArco("T8","T1", 1);
    g.addArco("T1","T4", 5);
    g.addArco("T1","T7", 4);
    g.addArco("T4","T2", 2);
    g.addArco("T6","T9", 6);
    g.addArco("T7","T5", 1);
    g.addArco("T11","T3", 2);
    g.addArco("T11","T8", 3);

    buscarCaminos(g,string("T11"), string("T4"));

    return 0;
}