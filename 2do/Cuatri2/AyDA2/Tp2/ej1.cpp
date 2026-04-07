#include <iostream>
#include </home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafo.hpp>
#include <vector>
#include <map>
using namespace std;

template<class V>
bool Poda(const vector<V>& mejorCamino, const vector<V>& caminoActual , const  map<V,bool>& visitados) {
    int cantVisitados = 0;
    for(const auto& v : visitados)
        if(v.second)
            cantVisitados++;
    return caminoActual.size() + (visitados.size() - cantVisitados) <= mejorCamino.size();
}

template<class V>
void back(const Grafo<V>& g, const V& a, const V& s, vector<V>& mejorCamino, vector<V>& caminoActual, map<V,bool>& visitados){

    visitados[a] = true;
    caminoActual.push_back(a);

    if(a == s) {
        if( mejorCamino.size() < caminoActual.size())
            mejorCamino = caminoActual;
    } else {
        if(!Poda(mejorCamino, caminoActual, visitados))
            for(auto& v : g.getAdyacentes(a))
                if(!visitados[v])
                    back(g,v,s,mejorCamino,caminoActual,visitados);
    }
    caminoActual.pop_back();
    visitados[a] = false;
}

template<class V>
void caminoMasLargo(const Grafo<V>& g, const V& entrada, const V& salida) {
    vector<V> mejorCamino;
    vector<V> caminoActual;
    map<V,bool> visitados;

    for(auto& v : g.getVertices())
        visitados[v] = false;

    back(g, entrada, salida, mejorCamino, caminoActual, visitados);
    cout << "Mejor camino:\n" << endl;
    for(const auto& v : mejorCamino)
        cout << v << " "; 
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

    caminoMasLargo(g, string("T11"), string("T7"));

    return 0;
}