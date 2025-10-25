#include <map>
#include <set>
#include <stdexcept>
#include <sstream>
#include <iostream>
#include <limits>

using namespace std;

template <class V, class C> class GrafoRotulado {
    private:
        bool noDirigido;
        map<V, map<V, C>> adyacentes;
    
    public:
        GrafoRotulado() : noDirigido(true) {} //No dirigido por defecto
        virtual ~GrafoRotulado() = default;
    
        GrafoRotulado(bool noDirigido) : noDirigido(noDirigido) {} // Dirigido o no dirigido

        void addVertice(const V &vertice) {
            if(adyacentes.find(vertice) == adyacentes.end())
                adyacentes[vertice] = std::map<V,C>();
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
            for (auto const& par : adyacentes)
                vertices.insert(par.first);
            return vertices;
        }

        void addArco(const V &deVertice, const V &aVertice, const C& c) {
            addVertice(deVertice);
            addVertice(aVertice);

            adyacentes[deVertice][aVertice] = c;

            if(noDirigido)
                adyacentes[aVertice][deVertice] = c;
        }

        const C& getPeso(const V& deVertice, const V& aVertice) const {
            auto it = adyacentes.find(deVertice);
            if(it == adyacentes.end())
                return numeric_limits<C>::max();
            auto it2 = it->second.find(aVertice);
            if(it2 == it->second.end())
                return numeric_limits<C>::max();
            return it2->second;
        }

        void delArco(const V &deVertice, const V &aVertice) {
            auto it = adyacentes.find(deVertice);
            if( it != adyacentes.end())
                it->second.erase(aVertice);

            if(noDirigido) {
                it = adyacentes.find(aVertice);
                if (it != adyacentes.end())
                    it->second.erase(deVertice);
            }
        }

        bool hayArco(const V &deVertice, const V &aVertice) const {
            auto it = adyacentes.find(deVertice);
            return (it != adyacentes.end()) && (it->second.find(aVertice) != it->second.end());
        }

        set<V> getAdyacentes(const V &vertice) const {
            set<V> ady;
            auto it = adyacentes.find(vertice);
            if(it != adyacentes.end())
                for(const auto &par : it->second)
                    ady.insert(par.first);
            return ady;
        }

        int nVertices() const {
            return (int) adyacentes.size();
        }

        friend ostream& operator<<(ostream& os, const GrafoRotulado<V,C>& g) {
            for (const auto& v : g.getVertices()) {
                for(const auto& a : g.getAdyacentes(v)){
                    os << v << " -> {";
                        os << a << " ";
                    os << "} Costo: " << g.getPeso(v,a) << "\n";
                }
            }
            return os;
        }
};
