#include <iostream>
//#include <string>
using namespace std;


struct Nodo {
    std::string nombre;
    long long telefono;
    Nodo *siguiente;
};

Nodo * nuevo_nodo(std::string nombre, long long telefono) {
    Nodo *nodo = new Nodo();
    nodo -> nombre = nombre;
    nodo -> telefono = telefono;
    nodo -> siguiente = nullptr;
    return nodo;
}

bool agregar_elemento_final(std::string nombre, long long telefono, Nodo *primero){
    Nodo *nodo = nuevo_nodo(nombre, telefono);
    nodo -> siguiente = nullptr;

    Nodo *actual = primero;
    while (actual -> siguiente != nullptr) {
        actual = actual -> siguiente;
    }
    actual -> siguiente = nodo;
    return true;
}

Nodo* agregar_elemento_inicio(string nombre, long long telefono, Nodo *primero ){
    Nodo *nodo = nuevo_nodo(nombre, telefono);
    nodo -> siguiente = primero;
    return nodo;
}

void imprimir_list(Nodo *primero) {
    Nodo *actual = primero;
    while (actual != nullptr) { 
        std::cout << actual -> nombre << " " << actual -> telefono << endl;
        actual = actual -> siguiente;
    }
    
}

int main() {
    Nodo *primero = nuevo_nodo("Juan", 2262364901);
    agregar_elemento_final("Pedro", 223564789, primero);
    agregar_elemento_final("Nico", 2262364021, primero);
    primero = agregar_elemento_inicio("Marcos", 2262366965, primero);
    imprimir_list(primero);
    return 0;
}

