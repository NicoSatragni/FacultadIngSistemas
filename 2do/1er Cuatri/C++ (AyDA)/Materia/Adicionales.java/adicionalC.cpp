#include <iostream>
using namespace std;

// const int tamS = 4;

// int * sensores(int in[], int f[], int p[], int tamP) {
//     int posTomados = 0;
//     int * tomados = new int[5];
//     int j = 0;

//     for (int i = 0; i < tamP; i++) {
//         if (posTomados == 0 || p[i] > f[tomados[posTomados - 1]]) {
//             int ultTom = in[0];
//             while (j < tamS && in[j] <= p[i]) {
//                 if (f[j] > f[tomados[posTomados]] && f[j] > f[ultTom])
//                 ultTom = j;
//                 j++;
//             }
//             tomados[posTomados] = ultTom;
//             posTomados++;
//         }
//     }
//     tomados[posTomados] = -1;
//     return tomados;
// }


// int main() {

//     int p[] {2, 3, 4, 6};
//     int inicios[] {0, 2, 4, 5};
//     int fines[]   {2, 5, 9, 8};

//     int tamP = sizeof(p) / sizeof(p[0]);

//     int * t = sensores(inicios, fines, p, tamP);

//     int i = 0;
//     cout << endl;
//     while ( t[i] > 0){
//         cout << " {" << inicios[t[i]] << ", " << fines[t[i]] << "}";
//         i++;   
//     }
//     cout << endl;

//     return 0;
// }








//_______________________________________________________________________________________________________________





// void intercambio(int &a, int &b) {
//     int aux = a;
//     a = b;
//     b = aux;
// }

// int particion( int a[], int b[], int izq, int der) {
//     int i = izq + 1;
//     int j = der;
//     int p  = a[izq];
//     while (i <= j)
//     {
//         while (i <= j && a[i] <= p) i ++;
//         while (i <= j && a[j] > p) j--;
//         if (j > i)
//         {
//             intercambio(a[i], a[j]);
//             intercambio(b[i], b[j]);
//         }
//     }
//     intercambio(a[j], a[izq]);
//     intercambio(b[j], b[izq]);
//     return j;
// }

// void quicksort(int g[], int t[], int izq, int der) {
//     if (izq < der)
//     {
//         int p = particion(g, t, izq, der);
//         quicksort(g, t, izq, p -1);
//         quicksort(g, t, p + 1, der);
//     }
// }

// int * sensoresNec(int in[], int f[], int p[], int tamP, int tamS) {
//     int ultTomado = 0;
//     int * tomados = new int[2];
//     int pos = 0;

//     int j = 0;
//     for (int i = 0; i < tamP; i++)
//     {
//         if (ultTomado == 0 || p[i] > f[ultTomado - 1])
//         {
//             int ult = 0;
//             while (j < tamS && in[j] <=p[i]) {
//                 if (f[j] > f[ult])
//                     ult = j;
//                 j++;
//             }
//             ultTomado = ult;
//             tomados[pos++] = ultTomado++;
//         }
//     }
//     tomados[pos] = - 1;
//     return tomados;
// }








// int main() {
//     int inicio[] {1, 5 , 2, 7 , 9 , 10};
//     int fin[]    {2, 15, 5, 20, 11, 11};
//     int p[] {2, 4, 8, 10, 11, 12};

//     // int p[] {2, 3, 4, 6};
//     // int inicio[] {0, 2, 4, 5};
//     // int fin[]   {2, 5, 9, 8};

//     quicksort(inicio, fin, 0, sizeof(inicio) / sizeof(inicio[0]));
//     int * tomados = sensoresNec(inicio, fin, p, sizeof(p) / sizeof(p[0]), sizeof(inicio) / sizeof(inicio[0]));

//     cout << endl;
//     int i = 0;
//     while (tomados[i] >= 0) {
//         cout << " {" << inicio[tomados[i]] << ", " << fin[tomados[i]] << "} ";
//         i++;
//     }
//     cout << endl;
//     return 0;
// }


//_______________________________________________________________________________________________________________


void intercambio(int &a, int &b) {
    int aux = a;
    a = b;
    b = aux;
}

int particion( int a[], int b[], int izq, int der) {
    int i = izq + 1;
    int j = der;
    int p  = a[izq];
    while (i <= j)
    {
        while (i <= j && a[i] <= p) i ++;
        while (i <= j && a[j] > p) j--;
        if (j > i)
        {
            intercambio(a[i], a[j]);
            intercambio(b[i], b[j]);
        }
    }
    intercambio(a[j], a[izq]);
    intercambio(b[j], b[izq]);
    return j;
}

void quicksort(int g[], int t[], int izq, int der) {
    if (izq < der)
    {
        int p = particion(g, t, izq, der);
        quicksort(g, t, izq, p -1);
        quicksort(g, t, p + 1, der);
    }
}


// int * sensores(int in[], int f[], int p[], int n, int m) {

//     int * tomados = new int[n + 1]; //en caso que se tomen todos + 1 paa el final;
//     int cnt = 0;
//     int cobertura = -1;

//     int j = 0;
//     for (int i = 0; i < m; i++)
//     {   
//         if (p[i] <= cobertura)
//             continue;

//         int ult = -1;
//         while (j < n && in[j] <= p[i]) {
//             if (ult < 0 || f[j] > cobertura)
//                 ult = j;
//             j++;
//         }
//         if (ult < 0 || p[i] > f[ult]) {
//             delete[] tomados;
//             return nullptr;
//         }
//         cobertura = f[ult];
//         tomados[cnt++] = ult;
//     }
//     tomados[cnt] = -1;
//     return tomados;
// }



// int * sensores(int in[], int f[], int p[], int cantSensores, int cantPuntos) {
//     int * tomados = new int[cantSensores + 1];
//     int cnt = 0;
//     int cobertura = -1;
//     int j = 0;

//     for (int i = 0; i < cantPuntos; i++)
//     {
//         if (p[i] <= cobertura)
//             continue;

//         int mejor = -1;
//         while(j < cantSensores && in[j] <= p[i]) {
//             if (mejor < 0 || f[j] > f[mejor])
//                 mejor = j;
//             ++j;
//         }
//         if (mejor < 0 || p[i] > f[mejor]) {
//             delete[] tomados;
//             return nullptr;
//         }
//         cobertura = f[mejor];
//         tomados[cnt++] = mejor;
//     }
//     tomados[cnt] = -1;
//     return tomados;
// }


// int * sensores(int in[], int f[], int p[], int cantSensores, int cantPuntos) {
//     int * tomados = new int[cantSensores + 1];
//     int cnt = 0;
//     int cobertura = -1;
//     int j = 0;

//     for (int i = 0; i < cantPuntos; i++)
//     {
//         if (p[i] <= cobertura)
//             continue;
        
//         int mejor = -1;
//         while (j < cantSensores && in[j] <= p[i])
//         {
//             if (mejor < 0 || f[j] > f[mejor])
//                 mejor = j;
//             j++;
//         }
        
        
//         if (mejor < 0 || p[i] > f[mejor])
//         {
//             delete[] tomados;
//             return nullptr;
//         }


//         cobertura = f[mejor];
//         tomados[cnt++] = mejor;
//     }
//     tomados[cnt] = -1;
//     return tomados;

// }


int * sensores(int in[], int f[], int p[], int cantSensores, int cantPuntos) {
    int * tomados = new int[cantSensores + 1];
    int cnt = 0;
    int cobertura = -1;
    int j = 0;

    for (int i = 0; i < cantPuntos; i++)
    {
        if (p[i] <= cobertura)
        continue;

        int mejor = -1;
        while (j < cantSensores && in[j] <= p[i])
        {
            if (mejor < 0 || f[j] > f[mejor])
                mejor = j;
            ++j;
        }

        if (mejor < 0 || p[i] > f[mejor])
        {
            delete[] tomados;
            return nullptr;
        }

        cobertura = f[mejor];
        tomados[cnt++] = mejor;    
    }
    tomados[cnt] = -1;
    return tomados;
}



int main() {

    int in[] {1, 2, 3, 6,  9, 10};
    int f[]  {1, 2, 5, 15, 9, 10};

    int p[] {1, 2, 4, 6, 10, 12};


    int n = sizeof(in) / sizeof(in[0]);
    int m = sizeof(p) / sizeof(p[0]);
    
    quicksort(in, f, 0, n-1);

    int * t = sensores(in, f, p, n, m);

    
    int i = 0;
    if (t != nullptr){

        cout << endl << "Los sensores tomados son: ";
        while (t[i] >= 0)
        {
            cout << " {" << in[t[i]] << ", " << f[t[i]] << "} ";
            i++;
        }
    } else
        cout << "no se pueden cubrir todos los puntos.";
        delete[] t;
    return 0;
}











