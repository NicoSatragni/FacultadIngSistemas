#include <iostream>
using namespace std;

const int tam = 5;
void intercambio(double &a, double &b) {
    double aux = a;
    a = b;
    b = aux;
}

void quicksort(double v[], double p[], int izq, int der) {
    if(izq < der) {
        int i = izq + 1;
        int j = der;
        double pivot = (v[izq] / p[izq]);
        while (i <= j) {
            while (i <= j && (v[i] / p[i]) >= pivot)
            i++;
            while (i<= j && (v[j] / p[j]) < pivot)
            j--;
            if (i < j) {
                intercambio(p[i], p[j]);
                intercambio(v[i], v[j]);
            }
        }
        intercambio(p[izq], p[j]);
        intercambio(v[izq], v[j]);
        quicksort(v,p, j + 1, der);
        quicksort(v, p, izq, j - 1);
    }
}


int main() {

    double val[tam]{4, 6, 8, 15, 2};
    double pes[tam]{1, 6, 2, 2, 3};
    quicksort(val, pes, 0, tam - 1);
for (int i = 0; i < tam; i++)
{
    cout << pes[i] << " ";
}

    cout << "Valores: ";
    
    double p = 6;

    int i = 0;
    double * ptr_partes = new double[tam];
    while ( i < tam && p > 0)
    {
        if(pes[i] > p) {
            ptr_partes[i] = (p / pes[i]);
            p = 0;
        }
        else{
            ptr_partes[i] = pes[i];
            p -= pes[i];
        }
        i ++;
    }
    
    cout << "partes tomadas:  ";
    for (int j = 0; j < tam; j++)
    {
        cout << ptr_partes[j] << " ";
    }
    

    return 0;
}