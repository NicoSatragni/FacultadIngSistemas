/*Escribir una función que permita determinar si un número entero dado es primo o no. Escribir un
programa que verifique si cada uno de los números almacenados en un arreglo son números primos*/

#include <iostream>
using namespace std;

bool esPrimo(const int num){
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
    
    int maxArray = 12; 
    // cout << "Ingrese la cantidad de elementos del arreglo: ";
    // cin >> maxArray;

    
    int * ptr_arr = new int[maxArray];
    // Initialize the array with some values to test
    for (int i = 0; i < maxArray; i++) {
        ptr_arr[i] = i + 1; // Fill with numbers 1 to 12
    }
    for (int i = 0; i < maxArray; i ++){
        if (esPrimo(ptr_arr[i]) == false){
            cout << "El numero " << ptr_arr[i] << " NO es primo." << endl;
        }
        else{
            
            cout << "El numero " << ptr_arr[i] << " SI es primo." << endl;

        }
    }


    return 0;
}