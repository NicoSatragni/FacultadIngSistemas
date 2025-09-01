#include <iostream>
using namespace std;

int const tam = 7;

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

int * tomados(int ti[], int tf[]) {
    int * ptr_t = new int[0];
    int pos = 0;
    ptr_t[0] = 0;

    for (int i = 0; i < tam; i++)
        if (ti[i] >= tf[ptr_t[pos]])
            ptr_t[++pos] = i;
    ptr_t[pos+1] = -1;
    return ptr_t;
}

int main() {

    int ti[tam] {1, 3, 4, 7, 8, 15, 1};
    int tf[tam] {2, 4, 8, 9, 10, 20, 5};   // 1-2 3-4 4-8 7-9 8-10

    quicksort(tf, ti, 0, tam - 1);

    for (int i = 0; i < tam; i++)
    {
        cout << ti[i] << "-" << tf[i] << " "; 
    }
    
    int * tm = tomados(ti, tf);

    int i =0;
    while (tm[i] >= 0){
        cout << tm[i] << " ";
        i++;
    }
    return 0;
}