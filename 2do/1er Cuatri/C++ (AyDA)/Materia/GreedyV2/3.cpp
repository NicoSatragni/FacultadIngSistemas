#include <iostream>
using namespace std;
int const tam = 5;


void intercambio(int &a, int &b) {
    int aux = a;
    a = b;
    b = aux;
}

int particion( int a[], int b[], int izq, int der) {
    int i = izq + 1;
    int j = der;
    int p  = a[izq];
    while (i <= j)
    {
        while (i <= j && a[i] <= p) i ++;
        while (i <= j && a[j] > p) j--;
        if (j > i)
        {
            intercambio(a[i], a[j]);
            intercambio(b[i], b[j]);
        }
    }
    intercambio(a[j], a[izq]);
    intercambio(b[j], b[izq]);
    return j;
}

void quicksort(int g[], int t[], int izq, int der) {
    if (izq < der)
    {
        int p = particion(g, t, izq, der);
        quicksort(g, t, izq, p -1);
        quicksort(g, t, p + 1, der);
    }
}

int main() {

    int procesos[tam] =      {1, 2, 3, 4, 5}; 
    int tiempoProceso[tam] = {2, 3, 1, 4, 1};

    quicksort(tiempoProceso, procesos, 0, tam - 1);

    cout << "Procesos ordenados: " << endl;
    for (int i = 0; i < tam; i++)
        cout << " Proceso " << procesos[i];
    
    return 0;
}