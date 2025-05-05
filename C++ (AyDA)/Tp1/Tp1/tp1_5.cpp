#include <iostream>
using namespace std;

float calculo(int cantMeses, float interesMensual, float capital ){
    for (int i = 0; i < cantMeses; i++)
    {
        capital = capital * (1 + interesMensual/100);
    }
    
    return capital;
}

float interesMensual(float interesAnual){
    cout << "El interes mensual es: " << interesAnual / 12 << endl;
    return interesAnual / 12;
}

float cantMeses(int dias){
    cout << "La cantidad de meses es: " << dias / 30 << endl;
    return dias / 30;
}

int main(){
    float capitalInicial, capitalFinal, interesAnual;
    int dias;
    cout << "Ingrese el capital inicial: "; 
    cin >> capitalInicial;

    cout << "Ingrese el interes anual: ";
    cin >> interesAnual;
    
    cout << "Ingrese los dias de inversion: ";
    cin >> dias;

    capitalFinal = calculo(cantMeses(dias), interesMensual(interesAnual), capitalInicial);

    cout << "El capital final es: " << capitalFinal << endl;
    return 0;
}