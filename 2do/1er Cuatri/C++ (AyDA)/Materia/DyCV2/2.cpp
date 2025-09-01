#include <iostream>
using namespace std;

int buscarIndice(int a[], int izq, int der) {
    
    int m = ((izq + der) / 2);

    if ((der - izq) == 0)
    {
        if( a[m] == m)
            return m;
        else
            return -1;
    } 

    if (a[m] == m)
        return m;
    else if (a[m] < m )
        return buscarIndice(a, m + 1, der);
    else
        return buscarIndice(a, izq, m - 1);
}

int main() {
    int a[] {-5, -4, -3, 0, 1, 3, 4, 5, 6, 8, 9, 11};
            //0,  1,  2, 3, 4, 5, 6, 7, 8, 9, 10, 11

    int tam = sizeof(a) / sizeof(a[0]);

    cout << "Tamano: " << tam << endl << buscarIndice(a, 0, tam - 1);
    return 0;
}