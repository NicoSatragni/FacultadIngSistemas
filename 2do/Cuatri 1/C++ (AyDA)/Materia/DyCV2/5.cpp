#include <iostream>
using namespace std;

const int tam = 10;

int encontrarPico(int x[]) {
    int n = tam - 1;
    int m = n / 2;

    
    while(true) {

        if (x[m - 1] < x[m] && x[m] > x[m + 1])
        return m;
    else if (x[m - 1] < x[m] && x[m] < x[m + 1]) {
        // int aux = m;
        m = (m + n) / 2;
        // n = aux;
    }
        
    else {
        int aux = m;
        m = (n - m) / 2;
        n = aux;
    }
}
}


int main() {

    int x[] {0, 9, 6, 5, 4, 3, 2, 1, 0 , -1};

    cout << "el pico es: " << encontrarPico(x) << endl;
    return 0;
}