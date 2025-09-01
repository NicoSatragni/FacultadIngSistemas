#include <iostream>
using namespace std;
const int n = 5;

// int bBinariaX(int p[], int x) {
//     int izq = 0, der = n - 1, result = 0;

//     while (izq < der) {
//         int medio = (izq + der) /2;
//         if (p[medio] < x)
//             izq = medio + 1;
//         else
//             der = medio;
//     }
//     return izq;
// }
int bBinariaY(int p[], int y) {
    int izq = 0, der = n - 1;

    while (izq < der) {
        int medio = (izq + der) /2;
        if (p[medio] <= y)
            izq = medio + 1;
        else
            der = medio;
    }
    return izq;
}

int bBinariaXRec(int p[], int x, int izq, int der) {
    int medio = (izq + der) / 2;
    if (izq < der) {
        if (p[medio] < x) 
            return bBinariaXRec(p, x, medio + 1, der);
        else 
            return bBinariaXRec(p, x, izq, medio);
    }
    return izq;
}

int main() {
    int p[n]= {4, 5, 7, 8, 10};
    int x = 6, y = 9;
    cout << "Cantidad de paquetes en rango: " << bBinariaY(p, y) - bBinariaXRec(p, x, 0, n) << endl;
    return 0;
}