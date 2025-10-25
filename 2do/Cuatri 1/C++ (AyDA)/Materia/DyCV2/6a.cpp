#include <iostream>
using namespace std;

const int tam = 13;

void maxYmin(int x[], int &min, int &max) {
    for (int i = 1; i < tam; i++)
    {
        min = x[i] < min ? x[i] : min;
        max = x[i] > max ? x[i] : max;
    }
    
}

int main() {
    int x[tam] { 5, 4, 3, 2, 1, 2, 5, 8, 9, 8, 5, 2, 2};
    int min = x[0];
    int max = x[0];
    maxYmin(x, min, max);

    cout << "El minimo es: " << min << ". Y el maximo es: " << max << endl;
    return 0;
}