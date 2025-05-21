#include <iostream>
using namespace std;


// Nodo * crearNodo(int valor) {
//     Nodo* nuevoNodo = new Nodo();
//     nuevoNodo -> valor = valor;
//     nuevoNodo -> siguiente = nullptr;
//     return nuevoNodo;
// }




int busquedaBinariaRec(int * arr, int i, int n) {

    if (arr[i] == i )
    {
     return arr[i];   
    }
    else if (i == n) {
        return -1;
    }
    else if (arr[i] < i){
        return busquedaBinariaRec(arr, (n - i) / 2, n);
    }
    else {
        return busquedaBinariaRec(arr, i, (n-i) / 2);
    }
} 

int busquedaBinaria(int * arr, int i, int n) {
    return busquedaBinariaRec(arr, i, n);
}

int main() {
    int n = 8;
    int *ptr_block = new int[n];

    // Carga manual (más controlada)
    int valores[] = {-4, 1,2,3,4,5,6,7,8,9};
    for (int i = 0; i < n; ++i) {
        ptr_block[i] = valores[i];
    }

    Prueba de impresión
    for (int i = 0; i < n; ++i) {
        std::cout << ptr_block[i] << " ";
    }

    
    if (busquedaBinaria(ptr_block, 0, n) != -1)
    {
        std::cout << endl << "Se encontro la posicion: " << busquedaBinaria(ptr_block, 0, n) << endl;
    }
    else
    {
        std::cout << "No se encontro la posicion" << endl;
    }
    
    delete[] ptr_block; // ✅ Liberar memoria dinámica
    return 0;
}



