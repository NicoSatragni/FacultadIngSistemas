#include <iostream>
using namespace std;
const int tam = 5;

void intercambio(int &a, int &b) {
    int aux = a;
    a = b;
    b = aux;
}

void quicksort(int a[], int b[], int izq, int der) {
    if(izq < der) {
        int i = izq + 1;
        int j = der;
        double pivot = a[izq];
        while (i <= j) {
            while (i <= j && (a[i]) <= pivot)
                i++;
            while (i<= j && (a[j] > pivot))
                j--;
            if (i < j){
                intercambio(a[i], a[j]);
                intercambio(b[i], b[j]);
            }
        }
        intercambio(a[izq], a[j]);
        intercambio(b[izq], b[j]);
        quicksort(a, b, j + 1, der);
        quicksort(a, b, izq, j - 1);
    }
}


int procesarPiezas(int t[]) {
    int sum = 0;
    int acu = 0;
    for (int i = 0; i < tam; i++){
        acu += t[i];
        sum += acu;
    }
    return sum;
}

int main () {

    int cod[tam] {1, 2, 3, 4, 5};
    int t[tam]   {1, 4, 5, 2, 7};
    quicksort(t, cod, 0, tam - 1);
    cout << "La suma maxima es de: " << procesarPaquetes(t) << ". Y el orden correcto es: ";
    for (int i = 0; i < tam; i++)
        cout << cod[i] << " ";
    
    return 0;
}