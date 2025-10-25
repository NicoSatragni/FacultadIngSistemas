#include <map>
#include <vector>
#include <iostream>
#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafo.hpp"
#include <limits>
using namespace std;

const int INF = numeric_limits<int>::max();

template<class V>
void BFS(const Grafo<V>& g, const V& actual, map<V,bool>& vis, vector<vector<V>>& componentes){

    vis[actual] = true;
    componentes.back().push_back(actual);
    for(const auto& v : g.getAdyacentes(actual))
        if(!vis[v])
            BFS(g,v,vis,componentes);
}


template<class V>
vector<vector<V>> buscarComponentes(const Grafo<V>& g) {
    // map<V,int> D;
    // map<V,int> F;
    map<V,bool> vis;
    vector<vector<V>> componentes;

    for(auto& v : g.getVertices()){
        // D[v] = INF;
        // F[v] = INF;
        vis[v] = false;
    }

    for(const auto& v : g.getVertices())
        if(!vis[v]) {
            componentes.emplace_back();
            BFS(g, v, vis, componentes);
        }
    return componentes;
}
template<class V>
int verticePertence(const V& v, const vector<vector<V>>& comp) {
    int pos = 0;
    for(const auto& c :comp) {
        pos++;
        for(const auto& v2 : c)
            if(v == v2)
                return pos;
    }
    return INF;
}


int main() {

    Grafo<string> g(true);

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

    g.addArco("T100","T150");
    g.addArco("T100","T110");
    g.addArco("T150","T120");

    g.addArco("T200","T201");
    g.addArco("T201","T202");

    auto componentes = buscarComponentes(g);

    cout << "cantidad de componentes: " << componentes.size() << "\nComponentes:\n";

    int contador = 0;
    for(const auto& c : componentes) {
        cout << " Componente " << ++contador <<":\n  ";
        for(const auto& v : c)
            cout << "|" << v << "| ";
        cout << "\n";
    }

    int conjunto = verticePertence( string("T150"), componentes);

    cout << "El vertice pertenece al conjunto:" << conjunto << "\n";

    return 0;
}