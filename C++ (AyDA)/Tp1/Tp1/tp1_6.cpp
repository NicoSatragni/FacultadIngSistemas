#include <iostream>

using namespace std;

string reemplazar(char aReemplazar, char reemplazo, string texto){
    for (auto &&i : texto)
    {
        if (i == aReemplazar){
            i = reemplazo;
        }
    }
    
    return texto;
}

int main(){
    char aReemplazar, reemplazo;
    string texto = "marcos ceba un mate como la gente, por favor!!";
    
    cout << "Ingrese un texto: ";
    getline(cin, texto);

    cout << "Ingrese un caracter a reemplazar: ";
    cin >> aReemplazar;

    cout << "Ingrese un caracter para reemplazar: ";
    cin >> reemplazo;

    if (texto == "" || aReemplazar == ' ' || reemplazo == ' ')
    {
        cout << "Ingresaste un dato invalido. Solo debe ser una letra.";
        return 1;
    }
    else
    {
        texto = reemplazar(aReemplazar, reemplazo, texto);
        cout << "El texto reemplazado es: " << texto << endl;
    }
    return 0;
}