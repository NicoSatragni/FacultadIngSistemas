#include <iostream>
using namespace std;


int mayoritario (int x[], int izq, int der) {
    if (izq == der)
        return x[izq];
    
    int m = (der + izq) / 2;
    int mayIzq = mayoritario(x, izq, m);
    int mayDer = mayoritario(x, m + 1, der);
    
    if (mayDer == mayIzq)
        return mayDer;   
    
    int contMayDer = 0;
    int contMayIzq = 0;
    
    for (int i = izq; i < der; i++)
    {
        if(x[i] == mayIzq) contMayIzq++;
        if(x[i] == mayDer) contMayDer++;
    }
    int tam = ((der - izq + 1)/2);

    if (contMayDer >= tam)
        return mayDer;
    if (contMayIzq >= tam)
        return mayIzq;
    return -1;
}

int mayoritarioRec(int x[], int n) {
    if (n <= 1)
        return -1;
        int m = mayoritario(x, 0, n - 1);
    return m;
}

int main() {

    int x[] {1, 3, 4, 3, 2, 0, 1, 4, 2, 1, 8, 1, 1};

    cout << "Mayoritario: " << mayoritarioRec(x, sizeof(x)/sizeof(x[0]) - 1);

    return 0;
}