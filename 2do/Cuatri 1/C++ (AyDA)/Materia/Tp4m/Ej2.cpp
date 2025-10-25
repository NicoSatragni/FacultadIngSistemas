#include <iostream>

using namespace std;

void merge(int a[], int i, int m, int f){

    int n1 = m - i + 1;
    int n2 = f - m;
    int izq[m - i];
    int der[f - m];

    for (int j = 0; j < n1; j++){
        izq[j] = a[i + j];
    }

    for (int j = 0; j < n2; j++){
        der[j] = a[m + 1 + j];
    }

    int ic = i, mc = m;
    for (int k = 0; k < f; k++) {

        if (izq[ic] <= der[mc]) {
            a[k] = izq[ic];
            ic++;
        } else{
            a[k] = der[mc];
            mc++;
        }
    }
    



    

}


void mergeSort(int a[], int i, int f){
    if(i < f){
        unsigned int m = (i + f) / 2;

        mergeSort(a, i, m);
        mergeSort(a, m + 1, f);
        merge(a, i, m, f);

    }
}


int main() {
    
    int A[] = {5, 8, 2, 4, 9, 7, 6, 1, 0, 3};

    mergeSort(A, 0, (sizeof(A) / sizeof(A[0])) - 1);

    cout << "Array ordenado: ";
    for (int i = 0; i < 10; i ++){
        cout << A[i] << " ";
    }

    return 0;
}