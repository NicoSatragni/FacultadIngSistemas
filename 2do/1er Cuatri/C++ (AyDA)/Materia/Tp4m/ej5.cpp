#include <iostream>
using namespace std;

int encontrarPunto(int a[], int ini, int fin){

    int medio = ini + (fin - ini) / 2;

    if ( a[medio - 1] < a[medio] && a[medio] > a[medio + 1])
    {
        return medio;
    } else if (a[medio - 1] > a[medio] && a[medio] > a[medio + 1])
    {
        return encontrarPunto(a, ini, medio);
    } else
    {
        return encontrarPunto(a, medio, fin);
    }
    

}



int main()
{
    int a[]{1, 2, 3, 4, 5, 6, 7, 8, 1};

    int punto = encontrarPunto(a, 0, 8);
    cout << "El punto es: " << punto << endl;
    return 0;
}