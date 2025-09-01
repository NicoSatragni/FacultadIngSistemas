//Divide y conquista iterativo
#include <iostream>
using namespace std;

const int n = 5;
void intercambio(int arr[], int arr2[], int i, int j) {
    int aux = arr[i];
    arr[i] = arr[j];
    arr[j] = aux;
    aux = arr2[i];
    arr2[i] = arr2[j];
    arr2[j] = aux;
}

int particion (int arr[], int arr2[], int ini, int fin ) {
    int piv = ini;
    int i = ini + 1;
    int j = fin;
    while (i <= j){   
        while (i <= j && arr[i] <= arr[piv])
            i++;
        
        while (i <= j && arr[j] > arr[piv]) 
            j--;
        

        if (i<j){

            intercambio(arr, arr2, i, j);
        }
    }   
        intercambio(arr, arr2, piv, j);
    return j;
}



    void quicksort(int arr[], int arr2 [], int i , int j) {
        if( i < j) {
            int p = particion(arr, arr2, i, j);
            quicksort(arr, arr2, p + 1, j);
            quicksort(arr, arr2, i, p - 1 );
        }
    }



    int maximizarTareas(int ti[], int tf[], int n) {
        quicksort(tf, ti, 0, n - 1);
        int ultimoFin = 0;
        int tomadas = 0;
        for(int i = 0; i < n; i ++) {
            if(ti[i] >= ultimoFin) {
                ultimoFin = tf[i];
                tomadas++;
            }
        }
        return tomadas;
    }


int main() {
    int ti[n] = {8, 3, 3, 5, 3};
    int tf[n] = {13, 5, 2, 6, 10};



    for (auto &&i : tf)
    {
        cout << i << " ";
    }

    cout << maximizarTareas(ti, tf, n) << endl;
    
    return 0;
}