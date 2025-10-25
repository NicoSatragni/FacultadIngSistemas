#include <iostream>;
using namespace std;

int bMayoria(int enteros[], int MaxArray){

    int n = MaxArray/2;
    int mayoria = 0;

    for (int i = 0; i < MaxArray ; i++)
    {
        int pos = i, cant = 0;

        while (enteros[pos] != NULL){
            if (enteros[pos] == enteros[i]){
                cant++;
            }
            pos++;
        }
        if (cant > n)
        {
            mayoria = cant;
            break;
        }
        
    }
    return mayoria;


}



int main() {
    const int MaxArray = 21;
    int enteros[MaxArray] = {1, 2, 3, 4, 5, 6, 4, 8, 9, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 10};
    int mayoria = bMayoria(enteros, MaxArray);
    if (mayoria>0)
    {
        cout << "El elemento mayoria aparece: " << mayoria << " veces.";
    } else
    { 
        cout << "No existe el elemento mayoria.";
    }
    
    
    
    return 0;
}