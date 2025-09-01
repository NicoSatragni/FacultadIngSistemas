#include <iostream>
using namespace std;

const int tam = 13;


int* mayor(int * a, int * b) {
    return ((a[1] - a[0]) > (b[1] - b[0])) ? a : b;
}


int * contarSecuencias(int x[], int izq, int der) {
    int sumFN = 0, sumFP = 0, sumI, indFI, indFD;

    int i = izq;
    while (i < der)
    {
        if (x[i] < 0){
            int sumN = 0;
            int j = i;
            while (x[j] < 0 && j < der) {
                sumN += x[j];  
                j ++;
            }
            sumN *= -1;
            cout << "sumFN: "<< sumFN << endl;
            if (sumN > sumFN && sumN > sumFP){
                indFI = i;
                indFD = j - 1;
                sumFN = sumN;
            }
            i = j;
        } else {
            int sumP = 0;
            int j = i + 1;
            while (x[j] > 0 && j < der) {
                sumP += x[j];
                j ++;
            }
            sumFP = (sumP > sumFP) ? sumP : sumFP;
            cout << "sumFN: " << sumFN << endl;
            if (sumP > sumFP && sumP > sumFN){
                indFI = i;
                indFD = j - 1;
                sumFP = sumP;
            }
            i = j;
        }
    }
    int * ptr_rst = new int[2] {indFI, indFD};
    return ptr_rst; 
}

int * buscarSecuencia(int x[], int izq, int der) {
    int m = (der + izq) / 2;
    bool t = true;
    int i = 0;
    while ((m < der && m > izq) && t && i < (der - izq + 1)) {
        if (x[m] > 0 && x[m + 1] < 0)
        {
            return mayor(buscarSecuencia(x, m + 1, der), buscarSecuencia(x, izq, m));
            t = false;
        }
        i ++;
    }
    return contarSecuencias(x, izq, der); 
}


int main() {

    int x[tam] {0, 1, -3, 6, -1, -4, -2, -5, -6, 7, -10, 19, -1}; 

    int * ptr_rslt = buscarSecuencia(x, 0, tam - 1);
    
    cout << "La secuencia mayor es desde: " << ptr_rslt[0] << " hasta: " << ptr_rslt[1];
    return 0;
}