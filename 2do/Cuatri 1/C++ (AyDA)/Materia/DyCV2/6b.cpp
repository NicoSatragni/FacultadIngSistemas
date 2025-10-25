#include <iostream>
using namespace std;

const int tam = 13;

void maxYmin(int x[], int &min, int &max, int izq, int der) {
    if((der - izq) < 2) {
        min = x[izq] < min ? x[izq] : min;
        max = x[izq] > max ? x[izq] : max;
    } else {

        int m = (der + izq) / 2;
        if (x[m] < min)
        min = x[m];
        else if (x[m] > max)
        max = x[m];
        
        maxYmin(x, min, max, m, der);
        maxYmin(x, min, max, izq, m);
    }
}

int main() {
    int x[tam] { 30, 4, 3, 2, 1, 2, -5, 8, 9, 8, 5, 2, 25};
    int min = x[0];
    int max = x[0];
    maxYmin(x, min, max, 0, tam);

    cout << "El minimo es: " << min << ". Y el maximo es: " << max << endl;
    return 0;
}