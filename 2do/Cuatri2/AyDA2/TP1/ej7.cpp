/*Dados un grafo G con sus vértices rotulados con colores y dos vértices v1 y v2, escriba un
algoritmo que encuentre un camino entre el vértice v1 al vértice v2 tal que no pase por vértices
rotulados con el color rojo.
*/


#include <map>
#include <vector>
#include <iostream>
#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafoRotulado.hpp"
using namespace std;

enum Color {BLANCO, AMARILLO, AZUL, ROJO};

ostream& operator<<(ostream& os, Color color) {
    switch (color)
    {
    case BLANCO:
        os <<"BLANCO";
        break;
    case AMARILLO:
        os << "AMARILLO";
        break;
    case AZUL:
        os << "AZUL";
        break;
    case ROJO:
        os << "ROJO";
        break;
    default:
        break;
    }
    return os;
}

template<class V, class C>
void buscarCaminos(const GrafoRotulado<V,C>& g, const V& ini, const V& fin, const Color& cEvitar) {
    map<V,bool> visitados;
    for(const auto& v : g.getVertices())
        visitados[v] = false;
    vector<V> camino;

    DFS(g,ini,fin,cEvitar,visitados,camino);
}

template<class V, class C>
void DFS(const GrafoRotulado<V,C>& g, const V& ini, const V& fin, const Color& cEvitar, map<V,bool>& visitados, vector<V>& camino) {


    camino.push_back(ini);
    if(ini == fin){
        cout << "Camino:\n";
        for(int i = 0; i < camino.size()-1; i++) 
            cout << camino[i] << " -> " << camino[i+1] << " \"" << g.getPeso(camino[i], camino[i+1]) << "\"\n";
        cout<<"\n";
        for(const auto& v : camino)
            cout << v << " -> ";
        cout << "\\\n";
        return;
    }

    visitados[ini] = true;
    for(const auto& v : g.getAdyacentes(ini))
        if(!visitados[v] && g.getPeso(ini,v) != cEvitar)
            DFS(g,v,fin,cEvitar,visitados,camino);
    
    camino.pop_back();
}


int main() {

    GrafoRotulado<string,Color> g(false);

    g.addArco("T3","T5", AMARILLO);
    g.addArco("T5","T1", BLANCO);
    g.addArco("T8","T1", AZUL);
    g.addArco("T1","T4", AZUL);
    g.addArco("T1","T7", ROJO);
    g.addArco("T4","T2", ROJO);
    g.addArco("T6","T9", AMARILLO);
    g.addArco("T7","T5", BLANCO);
    g.addArco("T11","T3", AZUL);
    g.addArco("T11","T8", ROJO);

    buscarCaminos(g,string("T11"), string("T4"), ROJO);

    return 0;
}