#include <iostream>
using namespace std;



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
        while (i <= j && arr[i] >= arr[piv])
            i++;
        
        while (i <= j && arr[j] < arr[piv]) 
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

    int plazoMayor(int t[], int tam) {
        int max = 0;
        for (int i = 0; i <= tam; i++) {
            if (max < t[i])
            {
                max = t[i];
            }
        }
        return max;
    }


    int* gananciaMayor(int g[], int t[], int tam, int pM) {
        int* ptr_arr = new int[pM] {};

        for (int i = 0; i < tam; i++)
        {
            if (ptr_arr[t[i]] == 0) {
                ptr_arr[t[i]] = g[i];
            } else {
                int j = t[i];

                while (j > 0)
                {
                    if(ptr_arr[j] == 0){
                        ptr_arr[j] = g[i];
                    }
                    j--;
                }   
            }
        }
        return ptr_arr;
    }


int main() {
    // int* ptr_arr = new int[8];
    // ptr_arr[0] = 1;
    // ptr_arr[1] = 5;
    // ptr_arr[2] = 8;
    // ptr_arr[3] = 2;
    // ptr_arr[4] = 9;
    // ptr_arr[5] = 0;
    // ptr_arr[6] = 7;
    // ptr_arr[7] = 8;

    int g[] = {10, 50, 36, 80, 20, 15, 4, 12, 30, 50};
    int t[] = {1,  3,  2,  2,  3,  1,  4,  5, 5, 4};

    int tam = sizeof(t) / sizeof(t[0]) - 1;
    int pM = plazoMayor(t, tam);

    quicksort(g, t, 0, tam);
    int *ptr_ganancia = gananciaMayor(g,t, tam, pM-1);
    for (int i = 1; i <= pM; i++)
    {
        cout << " " << ptr_ganancia[i];
    }
    cout << "\n" << pM << "\n";
    
    
    cout << "\n";
    for (int i = 0; i < tam; i++)
    {
        cout << g[i] << ", ";
    }
    

    return 0;
}