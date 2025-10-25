//Divide y conquista iterativo

bool binarySearch(int s[], int n, int x) {

}

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
    int n = 8;
    int x = 13;
    int fi[n] { 2, 3, 4, 6, 8, 10, 12 , 17, 18};
    int
    // 8 2 y 3 = 13
    return 0;
}