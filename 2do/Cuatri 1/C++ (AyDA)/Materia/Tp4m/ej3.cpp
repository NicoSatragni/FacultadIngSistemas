#include <iostream>

using namespace std;

/*
Se tiene un arreglo T de n enteros distintos, ordenado en forma creciente. Dado un rango definido
por dos valores enteros x e y, con la condición de que x ≤ y, se requiere implementar un algoritmo
en C++ que determine cuántos elementos del arreglo T se encuentran comprendidos entre x e y,
inclusive. La complejidad temporal de su algoritmo debe pertenecer a O(log n).
*/


int elementosRango(int arr[], int izq, int der, int  x, int y){
    if (izq > der)
        return 0;

    if (arr[izq] > y)
        return 0;

    if (arr[der] < x)
        return 0;


    if(arr[izq] >= x && arr[der] <= y)
        return der - izq + 1;

    int medio =  izq + (der - izq) / 2;
    return (elementosRango(arr, izq, medio, x, y) + elementosRango(arr, medio + 1, der, x, y));
}
    
    

int main() {
    int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int x = 6;
    int y = 11;
    //int valor = elementosRango(arr, 0, sizeof(arr) / sizeof(arr[0]) - 1, x, y);
    cout << sizeof(arr) / sizeof(arr[0]) << " cant Elementos: " << elementosRango(arr, 0, sizeof(arr) / sizeof(arr[0]) - 1, x, y) << endl;
    
    return 0;
}