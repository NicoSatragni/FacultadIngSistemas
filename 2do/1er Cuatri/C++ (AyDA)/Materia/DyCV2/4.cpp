#include <iostream>
using namespace std;

int const tam = 5;

double max(int a, int b) {
    return a > b ? a : b;
}

double min(int a, int b) {
    return a < b ? a : b;
}

double mediana(int x[], int y[], int n) {
    if (n == 1)
        return (x[0] + y[0]) / 2;

    if (n == 2) {
        return (max(x[0], y[0]) + min(x[1], y[1])) / 2;
    }

    int m = n / 2;

    double medx = (n % 2 == 0) ? (x[m - 1] + x[m]) / 2.0 : x[m];
    double medy = (n % 2 == 0) ? (y[m - 1] + y[m]) / 2.0 : y[m];

    if (medx == medy)
        return medx;
    else if (medx < medy)
        return mediana(x + m, y, n - m);
    else
        return mediana(x, y + m, n - m);
}



int main() {

    // int x[] {1, 3, 5, 7, 10};  // 1, 1, 2, 3, |4, 5|, 5, 7, 8, 10
    // int y[] {1, 2, 4, 5, 8};

    int x[] {1, 1, 1, 1, 1};
    int y[] {1, 1, 1, 1, 1}; //1, 2, 3, 5, |8, 9|, 10, 11, 12, 13

cout<< "la mediana es: " << mediana(x, y, tam) << endl;
    return 0;
}