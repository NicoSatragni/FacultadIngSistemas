#include <iostream>
using namespace std;

/*
4) En ciertas aplicaciones, puede ser necesario combinar información proveniente de distintas
fuentes sin alterar su estructura original. Supongamos que se tienen dos vectores X e Y, cada uno
con n enteros ordenados en forma creciente. Se desea calcular la mediana del conjunto total de 2n
elementos sin necesidad de mezclar ni ordenar explícitamente los vectores.
Implemente un algoritmo en C++ que resuelva el problema en un tiempo O(log n).
*/


double medianaParcial(int arr[], int inicio, int fin)
{
    int n = fin - inicio + 1;

    if (n % 2 == 0)
    {
        return (arr[(inicio + (n /2))] + arr[(inicio + (n /2) - 1)]) / 2;
    }
    else
    {
        return arr[inicio + (n/2)];
    }
}

double mediana(int x[], int y[], int inicioX, int finX, int inicioY, int finY)
{
    int n = finX - inicioX + 1;

    if (n == 1) {
        return (x[inicioX] + y[inicioY] / 2.0);
    }

    if (n == 2)
    {
        int maxInicio = max(x[inicioX], y[inicioY]);
        int minFin = min(x[finX], y[finY]);
        return (maxInicio + minFin) / 2.0;
    }
    

    double medX = medianaParcial(x, inicioX, finX);
    double medY = medianaParcial(y, inicioY, finY);

    if (medX == medY)
    {
        return medX;
    }

        // Si medX < medY, descartamos mitad inferior de X y mitad superior de Y
    if (medX < medY) {
        if (n % 2 == 0) {
            return mediana(x, y, inicioX + n / 2 - 1, finX, inicioY, finY - n / 2 + 1);
        } else {
            return mediana(x, y, inicioX + n / 2, finX, inicioY, finY - n / 2);
        }
    } else {
        // Si medX > medY, descartamos mitad superior de X y mitad inferior de Y
        if (n % 2 == 0) {
            return mediana(x, y, inicioX, finX - n / 2 + 1, inicioY + n / 2 - 1, finY);
        } else {
            return mediana(x, y, inicioX, finX - n / 2, inicioY + n / 2, finY);
        }
    }
} 


int main() {
    int x[]{1, 3, 5, 7, 9, 14};
    int y[]{4, 6, 8, 10, 12, 13};

    double media = mediana(x, y, 0, 5, 0, 5);
    cout << "La media es: " << media << endl;
    return 0;
}