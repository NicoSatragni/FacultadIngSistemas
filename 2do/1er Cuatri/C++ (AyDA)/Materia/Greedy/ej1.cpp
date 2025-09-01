#include <iostream>
using namespace std;

void intercambio(double& r1 , double& r2, double& v1, double& v2, double& p, double& p2 ){
    double aux = r1;
    r1 = r2;
    r2 = aux;
    aux = v1;
    v1 = v2;
    v2 = aux;
    aux = p;
    p = p2;
    p2 = p;
}

// int particion(double arr[], double pes[], double val[], int inicio, int fin){

//     int p = arr[inicio];
//     int i = inicio + 1;
//     int j = fin;

//     while (i <= j){
    
//         while (i <= j && arr[i] <= p){
//             i ++;
//         }
//         while (i <= j && arr[j] > p){
//             j --;
//         }
//         if(i < j){
//             intercambio(arr[i], arr[j],  val[i], val[j], pes[i], pes[j]);
//         }
//     }
//     intercambio(arr[inicio], arr[j], val[inicio], val[j], pes[inicio], pes[j]);
//     return j;    
// }

// void quickSort(double arr[], double peso[], double valor[], int i, int j){
    
//     if (i < j){
//         int p = particion(arr,peso, valor, i ,j);
//         quickSort(arr, peso, valor, p + 1, j);
//         quickSort(arr,peso, valor, i, p - 1);
//     }    
// }

void intercambio(double& v1, double& v2, double& p1, double& p2) {
    double aux = v1;
    v1 = v2;
    v2 = aux;
    aux = p1;
    p1 = p2;
    p2 = aux;
}

int particion(double val[], double pes[], int inicio, int fin) {
    double pivot = val[inicio] / pes[inicio];
    int i = inicio + 1;
    int j = fin;

    while (i <= j) {
        while (i <= j && (val[i] / pes[i]) >= pivot)
            i++; // Descendente
        while (i <= j && (val[j] / pes[j]) < pivot)
            j--;
        if (i < j) {
            intercambio(val[i], val[j], pes[i], pes[j]);
        }
    }
    intercambio(val[inicio], val[j], pes[inicio], pes[j]);
    return j;
}

void quickSort(double val[], double pes[], int i, int j) {
    if (i < j) {
        int p = particion(val, pes, i, j);
        quickSort(val, pes, i, p - 1);
        quickSort(val, pes, p + 1, j);
    }
}




void objetosMochila(int p, double val[], double pes[], int tam ) {

    double rat[tam];
    int peso;
    for (int i = 0; i < tam; i++)
    {
        rat[i] = val[i] / pes[i];
    };

    quickSort(rat, val, pes, 0, tam-1);


    

    for (int i = 0; i < tam; i++)
    {
        if(peso + pes[i] <= p) {
            peso += pes[i];
        } else {
            peso += pes[i] / (p - peso);
            pes[i] = pes[i] / (p - peso);
            val[i] = val[i] / (p - peso); 
        }
    }
    
    
}

int main() {
    double val[]{4, 6, 8};
    double pes[]{1, 6, 2};
    int pesoMoch = 5;
    int tam = sizeof(val) / sizeof(val[0]);

    
    
    objetosMochila(pesoMoch, val, pes, tam );

    for (int i = 0; i < tam; i++)
    {
        cout << "Valor: " << val[i] << endl << "Peso: " << pes[i] << endl;
    }
    
    return 0;
}
