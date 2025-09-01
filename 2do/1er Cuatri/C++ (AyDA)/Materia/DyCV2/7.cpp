#include <iostream>
using namespace std;

const int tam = 9;

bool hayParCupones(int x[], int y, int izq, int der) {
    int m = (izq + der) / 2;
    if (der - izq > 2)
        if (hayParCupones(x, y, izq, m) || hayParCupones(x, y, m + 1, der))
            return true;

    for (int i = izq; i < m; i++)
        for (int j = m; j < der; j++)
            if ((x[i] + x[j]) == y)
                return true;
    
    return false;
}

int main(){

    int x [tam] {1, 2, 3, 4, 5, 6, 7, 15, 17};
    int y = 13;

    if (hayParCupones(x, y, 0, tam))
        cout << endl << "Si hay!" << endl;
    else 
        cout << endl << "No hay!" << endl;
    return 0;
}