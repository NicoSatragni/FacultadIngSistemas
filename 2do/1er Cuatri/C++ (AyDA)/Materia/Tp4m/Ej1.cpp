#include <iostream>

using namespace std;

void intercambio(int& i , int& j){
    int aux = i;
    i = j;
    j = aux;
}

int particion(int arr[], int inicio, int fin){

    int p = arr[inicio];
    int i = inicio + 1;
    int j = fin;

    while (i <= j){
    
        while (i <= j && arr[i] <= p){
            i ++;
        }
        while (i <= j && arr[j] > p){
            j --;
        }
        if(i < j){
            intercambio(arr[i], arr[j]);
        }
    }
    intercambio(arr[inicio], arr[j]);
    return j;    
}

void quickSort(int arr[], int i, int j){
    
    if (i < j){
        int p = particion(arr, i ,j);
        quickSort(arr, p + 1, j);
        quickSort(arr, i, p - 1);
    }    
}

int main() {
    int arr[] = {5, 8, 2, 3, 9, 1, 0, 6};

    quickSort(arr, 0, (sizeof(arr) / sizeof(arr[0]))-1);
    cout << "Array ordenado: ";
    for (int i = 0; i < 8; i++)
    {
        cout << arr[i] << " ";
    }
    

    return 0;
}


