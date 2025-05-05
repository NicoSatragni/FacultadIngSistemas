/*Escribir una función que permita determinar si un número entero dado es primo o no. Escribir un
programa que verifique si cada uno de los números almacenados en un arreglo son números primos*/

#include <iostream>
using namespace std;

bool esPrimo(int num){
    if(num != 2 && num % 2 == 0){
        return false;
    }else if (num != 3 && num % 3 == 0){
        return false;
    }
    else
    {
        return true;
    }
}


int main(){
    
    int maxArray; 
    cout << "Ingrese la cantidad de elementos del arreglo: ";
    cin >> maxArray;

    
    int arr[maxArray] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13};

    for (int i = 0; i < maxArray; i ++){
        if (esPrimo(arr[i]) == false){
            cout << "El numero " << arr[i] << " NO es primo." << endl;
        }
        else{
            
            cout << "El numero " << arr[i] << " SI es primo." << endl;

        }
    }


    return 0;
}