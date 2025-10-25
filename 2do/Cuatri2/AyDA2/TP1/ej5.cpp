#include <map>
#include <iostream>
#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafo.hpp"
#include <algorithm>
#include <vector>
using namespace std;

enum Arco {BLANCO, GRIS, NEGRO};



template<class V>
bool DFS(const Grafo<V>& g, const V& origen, map<V,Arco>& marca) {
    marca[origen] = GRIS;
    for(const auto& v : g.getAdyacentes(origen)) {
        if(marca[v] == BLANCO) {
            if(DFS(g, v, marca))
                return true;
        } else if (marca[v] == GRIS)
            return true;
    }
    marca[origen] = NEGRO;
    return false;
}


template<class V>
bool BuscaCiclo(const Grafo<V>& g) {

    map<V, Arco> marca;

    for(const auto& v : g.getVertices())
        marca[v] =  BLANCO;
    
    for(const auto& v : g.getVertices())
        if(marca[v] == BLANCO) {
            if(DFS(g, v, marca))
                return true;
        }
    return false;        
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

    if(BuscaCiclo(g))
        cout << "TIENE CICLO";
    else
        cout << "NO tiene ciclo";
    
    return 0;
}