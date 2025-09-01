#include <iostream>
using namespace std;

const int tam = 11;

int bx(int a[],int x) {
    int izq = 0;
    int der = tam - 1;
    if (a[der] < x)
        return der;
    
    int m = (der + izq) / 2;

    while ((der - izq)/ 2 >= 1)
    {
        m = (der + izq) / 2;

        if (a[m] == x)
            return m;
        else if (a[m] > x)
            der = m;
        else
            izq = m;
    }
    if (a[izq] >= x)
        return izq;
    else
        return izq + 1;
}

int by(int a[], int y, int izq, int der) {
    if ((der - izq) < 1)
    {
        if (a[der] <= y)
            return der;
        else
            return der - 1;
    }

    int m = (der + izq) / 2;
    
    if (a[m] == y)
        return m;
    else if (a[m] < y)
        return by(a, y, m + 1, der);
    else
        return by(a, y, izq, m - 1);
}

int main() {
    int T[tam] {1, 2, 4, 5, 6, 7, 8, 10, 10, 10, 11};
    int x = 3;
    int y = 12;
    int cantidad = by(T, y, 0, tam - 1) - bx(T, x);
    if (cantidad <= 0)
        cantidad = 0;
    else
        cantidad ++;
    cout << "Hay: " << cantidad << " elementos entre x e y"; 

    return 0;
}