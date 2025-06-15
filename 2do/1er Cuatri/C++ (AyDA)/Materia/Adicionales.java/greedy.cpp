#include <iostream>
using namespace std;

const int f = 2;
const int c = 5;

int** sensoresMin(int puntos[], int sensores[f][c], int tam) {
    int tempUltimo = -1;
    int posUsada = 0;

    int ** senValidos = new int * [f];
    for (int i = 0; i < f; i++)
    {
        senValidos[i] = new int[c];
    }

     for (int i = 0; i < tam; i++)
    {
        int temp = 0;
            if (tempUltimo == -1 || puntos[i] > senValidos[1][tempUltimo]) 
            {   
                for (int j = 0; j < c; j++)
                {
                    if (sensores[0][j] <= puntos[i] && sensores[1][j] >= sensores[1][temp]) {
                        temp = j;
                    }
                }
                senValidos[0][posUsada] = sensores[0][temp];
                senValidos[1][posUsada] = sensores[1][temp];
                tempUltimo = posUsada;
                posUsada++;
            }
    }
    senValidos[0][posUsada] = -1; // Indicar el final de los sensores válidos
    return senValidos;
}


int main() {
    int tam = 4;
    int puntos[tam] = {2, 3, 4, 6};
    int sens[f][c] = {{0, 2, 4, 5, 0}, {2, 5, 9, 8, 15}};

    int ** sensoresValidos = sensoresMin(puntos, sens, tam);
    
    int i =0;
    while (sensoresValidos[0][i] > -1) {
        cout << '{' << sensoresValidos[0][i] << ", " << sensoresValidos[1][i] << '}' << endl;
        i++;
    }
    return 0;
}