#include <iostream>
using namespace std;




int* detectarPuntosIter(int a[], int n) {
    int min = a[0];
    int max = a[0];

    for (int i = 1; i <= n; i++)
    {
        if (a[i] > max )
        {
            max = a[i];
        }
        if (a[i] < min)
        {
            min = a[i];
        }
    }

    int * ptr_block = new int[2]; 
    ptr_block[0] = min;
    ptr_block[1] = max;
    
    return ptr_block;
}

int* detectarPuntosDyC(int a[], int n) {
    
    
}


int main() {
    int a[]{18, 5, 4, 2, 6, 7, 5, 8, 9, 3, 5, 4, 15, 0};
    int * valores = detectarPuntosIter(a, sizeof(a) / sizeof(a[0]) -1);
    cout << "El minimo es: " << valores[0] << endl << "El maximo es: " << valores[1] << endl;
    return 0;
}