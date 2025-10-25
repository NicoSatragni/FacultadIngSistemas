#include <iostream>
using namespace std;

const int tam = 5;

void intercambio(int &a, int &b) {
    int aux = a;
    a = b;
    b = aux;
}

int particion( int g[], int t[], int izq, int der) {
    int i = izq + 1;
    int j = der;
    int p  = g[izq];
    while (i <= j)
    {
        while (i <= j && g[i] >= p) i ++;
        while (i <= j && g[j] < p) j--;
        if (j > i)
        {
            intercambio(g[i], g[j]);
            intercambio(t[i], t[j]);
        }
    }
    intercambio(g[j], g[izq]);
    intercambio(t[j], t[izq]);
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

int * gananciaMayor(int g[], int t[], int max){
    int * ptr_pm = new int[tam];
    for (int i = 0; i < tam - 1; i++)
    {
        ptr_pm[i] = 0;
    }
    
    for (int i = 0; i < max; i++)
    {
        if (ptr_pm[t[i] - 1] < g[i])
        {
            ptr_pm[t[i] - 1] = g[i];
        } else
        {
            for (int j = i; j > 0; j--)            {
                if (ptr_pm[j - 1] < g[i])
                {
                    ptr_pm[j - 1] = g[i];
                    break;
                }   
            }   
        }
    }
    return ptr_pm;
}

int main() {
    int g[tam] {5, 6, 2, 9, 7}; // 6 9 7
    int t[tam] {1, 2, 1, 2, 3}; // 2 2 3
    int max = 0;

    for (int i = 0; i < tam; i++)
        if(t[i] > max)
            max = t[i];
    
    quicksort(g, t, 0, tam - 1);
    
    for (int i = 0; i < tam; i++)
    {
        cout << g[i] << " ";
    }
    int * pm = gananciaMayor(g,t, max);
    cout << "ganancia mayor: " << endl;
    for (int i = 0; i < tam; i++)
    {
        cout << pm[i] << " ";
    }
    return 0;
}