/*Escribir un programa que permita cargar un arreglo de números enteros a partir de información
provista por el usuario, y luego visualice estos valores pero en el orden inverso al ingresado.
Entrada al programa: dos líneas de texto que indican la cantidad de valores a ingresar y los valores en
sí, separados por un espacio. Por ejemplo:
5
10 2 3 1 7
Salida del programa: los valores, separados por un espacio, en el orden inverso al ingresado.
7 1 3 2 10
*/

#include <iostream>
using namespace std;

int main() {
    int cant;
    cout << " Ingrese la cant de numeros: ";
    cin >> cant;
    int ar[cant];
    cout << " ingrese los numeros separados de un esapcio. ";

    for (int i = 0; i <= cant; i++){
        cin >> ar[i];
    }

    for (int i = cant; i >= 0; i--){
        cout << ar[i] << ' ';
    }
    return 0;
}

