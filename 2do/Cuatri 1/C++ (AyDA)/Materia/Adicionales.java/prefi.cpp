#include <iostream>
using namespace std;

int * segmentos(int in[], int fin[], int tam) {
    int * tomados = new int[tam + 1];
    int cnt = 0;
    int ulti = -1;
    int ultf = -1;

    int p = -1;

    for (int i = 0; i < tam; i++)
    {    
        if (in[i] >= ulti && in[i] <= ultf)
        {
            ulti = in[i];
            if (ultf < 0 ||fin[i] < ultf)
                ultf = fin[i];
            p = ulti;
        } else {
            if (p >= 0)
                tomados[cnt++] = p;
            ulti = in[i];
            ultf = fin[i];
            p = -1;
        }
    }
    tomados[cnt] = -1;
    return tomados;
}


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

    int in[]  {4, 1, 2, 2, 5};
    int fin[] {8, 3, 6, 5, 9};

    int tam =  sizeof(in)/ sizeof(in[0]);
    quicksort(in, fin, 0, tam -1);



    int *t = segmentos(in, fin, tam);

    int i = 0;
    while (t[i] >= 0){
        cout << " " << t[i];
        i++;
    }
    
    return 0;
}