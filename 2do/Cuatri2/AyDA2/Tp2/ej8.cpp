#include <iostream>

using namespace std;

const int n = 4;
const int mov = 8;

template<class C>
void imprimir(C camino[][n]) {
    for(int i=0; i < n; i++) {
        for(int j=0; j < n; j++)
            cout << camino[i][j] << " ";
        cout << "\n" << endl;
    }
    cout << "\n";
}


bool valido(bool tablero[][n], int a, int b) {
    return (0<=a && a < n && 0<=b && b < n && !tablero[a][b]);
}

bool back(bool tablero[][n], pair<int,int> actual, int movX[], int movY[], int pisadas, int camino[n][n]) {
    cout << "PISADAS: " << pisadas << endl;
    camino[actual.first][actual.second] = pisadas;
    imprimir(camino);
    tablero[actual.first][actual.second] = true;
    pisadas++;

    if(pisadas == ((n*n)+1) ){
        return true;
    }


    for(int i=0; i < mov; i++) {
        if(valido(tablero, actual.first + movY[i], actual.second + movX[i])) { //poda 
            actual.first += movY[i];
            actual.second += movX[i];
            //tablero[actual.first][actual.second] = true;
            // pisadas++;
            
            if(back(tablero, actual, movX, movY, pisadas, camino)){
                return true;
            }
            else {
                cout << "NO VALIDO\n";
                tablero[actual.first][actual.second] = false;
                actual.first -= movY[i];
                actual.second -= movX[i];
            }
        }
    }
    // imprimir(camino);
    camino[actual.first][actual.second] = 0;
    tablero[actual.first][actual.second] = false;
    pisadas--;
    return false;
}



bool encontrarPosicionesCaballo(bool tablero[n][n]) {
    
    pair<int,int> actual;
    int movX[]{-1, 1, 2, 2, -1, 1, -2, -2};
    int movY[]{-2, -2, -1, 1, 2, 2, -1, 1};
    int pisadas = 1;
    int camino[n][n];

    for(int i=0; i < n; i++)
        for(int j=0; j < n; j++)
            camino[i][j] = -1;

            imprimir(camino);
    for(int i=0; i < n; i++)
        for(int j=0; j < n; j++)
            tablero[i][j] = false;

    for(int i=0; i < n; i++)
        for(int j=0; j < n; j++) {
            // tablero[i][j] = true;
            actual.first = i;
            actual.second = j;

            if(back(tablero, actual, movX, movY, pisadas, camino))
                return true;
            tablero[i][j] = false;
        }
    return false;
}

int main() {

    // int movX[]{-1, 1, 2, 2, -1, 1, -2, -2};
    // int movY[]{-2, -2, -1, 1, 2, 2, -1, 1};

    bool tablero[n][n];
    // tablero[2][2] = 'O';
    // for(int i=0; i<8; i++)
    //     tablero[2 + movY[i]][2 + movX[i]] = 'X';

    // for(int i=0; i < n; i++) {
    //     for(int j=0; j < n; j++)
    //         cout << tablero[i][j];
    //     cout << "\n";
    // }
    if(encontrarPosicionesCaballo(tablero)) {
        cout << "Se encontro\n";
    }
    
    else
        cout << "NO se encontro\n";
    imprimir(tablero);

    return 0;
}
