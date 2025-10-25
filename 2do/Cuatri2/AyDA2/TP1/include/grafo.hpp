#include <map>
#include <set>

#include <iostream>
using namespace std;

template <class V> class Grafo {
    private:
        bool noDirigido;
        map<V, set<V>> adyacentes;
    
    public:
        Grafo() : noDirigido(true) {} //No dirigido por defecto
    
        Grafo(bool noDirigido) : noDirigido(noDirigido) {} // Dirigido o no dirigido

        void addVertice(const V &vertice) {
            if(adyacentes.find(vertice) == adyacentes.end())
                adyacentes[vertice] = std::set<V>();
        }

        // void setVertice(const V &v1, const V &v2) {
        //     if(!adyacentes.find(v1) == adyacentes.end())
        //         adyacentes[vertice] = v2;
        // }

        void delVertice(const V &vertice) {
            for (auto& par : adyacentes)
                par.second.erase(vertice);
            
            adyacentes.erase(vertice);
        }

        set<V> getVertices() const{
            set<V> vertices;
            for (const auto& par : adyacentes)
                vertices.insert(par.first);
            return vertices;
        }

        void addArco(const V &deVertice, const V &aVertice) {
            addVertice(deVertice);
            addVertice(aVertice);

            adyacentes[deVertice].insert(aVertice);

            if(noDirigido)
                adyacentes[aVertice].insert(deVertice);
        }

        void delArco(const V &deVertice, const V &aVertice) {
            auto it = adyacentes.find(deVertice);
            if( it != adyacentes.end())
                it->second.erase(aVertice);

            if(noDirigido) {
                auto ite = adyacentes.find(aVertice);
                if (ite != adyacentes.end())
                    ite->second.erase(deVertice);
            }
        }

        bool hayArco(const V &deVertice, const V &aVertice) const {
            auto it = adyacentes.find(deVertice);
            return (it != adyacentes.end()) && (it->second.find(aVertice) != it->second.end());
        }

        set<V> getAdyacentes(const V &vertice) const {
            auto it = adyacentes.find(vertice);
            if(it != adyacentes.end())
                return it->second;
            return std::set<V>();
        }

        int nVertices() const {
            return (int) adyacentes.size();
        }

        friend ostream& operator<<(ostream& os, const Grafo<V>& g) {
            for (const auto& v : g.getVertices()) {
                os << v << " -> {";
                for(const auto& a : g.getAdyacentes(v))
                    os << a << " ";
                os << "}\n";
            }
            return os;
        }
};


// int main() {
//     Grafo<string> g(true);
//     g.addArco("r", "s");
//     g.addArco("r", "v");
//     g.addArco("s", "w");
//     g.addArco("w", "t");

//     cout << g;
// }
