#include "/home/yanqui/Documents/FacultadIngSistemas/2do/Cuatri2/AyDA2/TP1/include/grafoRotulado.hpp"
#include <vector>
#include <queue>
#include <limits>
#include <algorithm>
#include <set>
#include <unordered_map>
#include <iostream>
using namespace std;


// Dijkstra --------------------------
template <class V, class C>
vector<V> dijkstra(const GrafoRotulado<V,C>& g, const V& origen, map<V,C>& D, map<V,V>& P) {
    vector<V> S;
    while(S.size() < g.getVertices().size()){
        V w;
        bool hayMin = false;
        C minDist = std::numeric_limits<C>::max();

        for(const auto& v : g.getVertices()) {
            if(find(S.begin(), S.end(), v) == S.end() && D[v] < minDist) {
                hayMin = true;
                minDist = D[v];
                w = v;
            }
        }

        if(!hayMin) break;
        S.push_back(w);

        for(const auto& v : g.getAdyacentes(w)) {
            C peso = g.getPeso(w,v);
            if(peso != std::numeric_limits<C>::max() && D[w] != std::numeric_limits<C>::max() && D[w] + peso < D[v]){
                D[v] = D[w] + peso;
                P[v] = w;
            }
        }
    }
    return S;
}



template<class V, class C>
void buscarCamino(const GrafoRotulado<V,C>& g, const V& origen) {
    map<V,C> D;
    map<V,V> P;
    vector<V> S;

    for(const auto& v : g.getVertices()) {
        D[v] = std::numeric_limits<C>::max();
        P[v] = V();
    }
    D[origen] = 0;
    P[origen] = -1;

    for(const auto& v : dijkstra(g, origen, D, P)) {
        cout << "{" << D[v] << "}" << " |" << v << "|" << " -> ";
    }


}


//FLOYD ------------------------------------------------------------------------------------

template <class V, class C>
void floydWarshall(const GrafoRotulado<V,C>& g , vector<V>& verticesOrdenados,
                   vector<vector<C>>& D, vector<vector<int>>& P) {
    verticesOrdenados.assign(g.getVertices().begin(), g.getVertices().end());
    unordered_map<V,int> pos; pos.reserve(verticesOrdenados.size());
    for (int i=0; i<(int)verticesOrdenados.size(); ++i) pos[verticesOrdenados[i]] = i;

    int n = (int)verticesOrdenados.size();
    const C INF = numeric_limits<C>::max();
    D.assign(n, vector<C>(n, INF));
    P.assign(n, vector<int>(n, -1));
    for (int i=0; i<n; ++i) D[i][i] = (C)0;

    for (int i=0; i<n; ++i) {
        const V& u = verticesOrdenados[i];
        for (const auto& v : g.getAdyacentes(u)) {
            int j = pos[v];
            D[i][j] = g.getPeso(u,v);
        }
    }
    for (int k=0; k<n; ++k) for (int i=0; i<n; ++i) {
        if (D[i][k] == INF) continue;
        for (int j=0; j<n; ++j) {
            if (D[k][j] == INF) continue;
            C via = D[i][k] + D[k][j];
            if (via < D[i][j]) { D[i][j] = via; P[i][j] = k; }
        }
    }
}

// --- Reconstrucción (índices) ---
template<class V>
void Camino(int i, int j, const vector<vector<int>>& P,
    const vector<V>& verticesOrdenados, vector<V>& camino) {
    int k = P[i][j];
    cout << " ENTRA ";
    if (k == -1) {
        if (camino.empty() || camino.back() != verticesOrdenados[i])
            camino.push_back(verticesOrdenados[i]);
        camino.push_back(verticesOrdenados[j]);
        return;
    }
    Camino(i, k, P, verticesOrdenados, camino);
    camino.pop_back();
    Camino(k, j, P, verticesOrdenados, camino);
}

int main() {
    using V = string; using C = int;

    GrafoRotulado<V,C> g(false); // dirigido (false). Para no dirigido: ctor por defecto o true.

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

    buscarCamino(g, V("T11"));

    vector<V> verticesOrdenados;
    vector<vector<C>> D;
    vector<vector<int>> P;     // ★ era vector<vector<C>>
    floydWarshall(g, verticesOrdenados, D, P);

    unordered_map<V,int> pos; pos.reserve(verticesOrdenados.size());
    for (int i=0; i<(int)verticesOrdenados.size(); ++i) pos[verticesOrdenados[i]] = i;

    vector<V> camino;
    Camino(pos["T11"], pos["T7"], P, verticesOrdenados, camino);

    for (auto& v : camino) cout << v << " -> ";
    cout << "(costo=" << D[pos["T11"]][pos["T7"]] << ")\n";

    return 0;
}

int main() {

    using V = string; using C = int;

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

    buscarCamino(g,string("T11"));

    vector<V> verticesOrdenados;
    vector<vector<C>> D;
    vector<vector<C>> P;
    floydWarshall(g,verticesOrdenados, D, P);
    
    unordered_map<V,int> pos;
    pos.reserve(verticesOrdenados.size());

    for(int i=0; i<(int)verticesOrdenados.size(); ++i)
        pos[verticesOrdenados[i]] = i;
    

    vector<V> camino;
    Camino(pos["T11"], pos["T7"], P, verticesOrdenados, camino);

    for(auto& v: camino) {
        cout << v << " -> ";
    }


    return 0;
}