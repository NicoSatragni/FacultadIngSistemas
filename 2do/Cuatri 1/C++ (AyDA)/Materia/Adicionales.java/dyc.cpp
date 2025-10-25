#include <iostream>
using namespace std;



int mayoritario(int arr[], int izq, int der) {
    if (tam < 2)
    {
        calcular(arr[0]);
    } else {
        int mitad = tam/2;
        int izq = mayoritario(arr, izq, mitad - 1);
        int der = mayoritario(arr, mitad, der);

        if (izq == der) {
            return izq;
        } else {
            int countIzq = 0, countDer = 0;
            for
        }
    }
    
}



int main() {


    return 0;
}