#include <iostream>
using namespace std;

/*Dada la ecuación de segundo grado: ax2 + bx + c, al calcular el discriminante discr = b2 - 4ac, se
pueden presentar tres casos distintos:
Si discr > 0.0, las dos raíces son reales y distintas, y valen:
x1= (-b + (discr)1/2 ) / (2a) y x2 = (-b - (discr)1/2 ) / (2a).
Si discr = 0.0, las dos raíces son reales e iguales, y valen:
x1 = x2 = -b / (2a)
Si discr < 0.0, las dos raíces son complejas conjugadas. Las partes real e imaginaria valpen:
xr = -b / (2a) y xi = (-discr)1/2 / (2a)
Codificar un programa que permita obtener las raíces de una ecuación de segundo grado, sabiendo
que los valores a, b y c deben ser ingresados por el usuario.*/

    
float Discr(int a, int b, int c){
    return ((b*2) - (4*a*c));
}

int main(){

    int a, b, c;
    cout << "Ingrese el valor de a, b, y c: "; 
    cin >> a >> b >> c;
    float discriminante = Discr(a,b,c);

    if (discriminante > 0.0) {

        float x1 = ((-b + discriminante / 2) / (2*a)) ;

        float x2 = ((-b - discriminante / 2) / (2*a));

        cout << "Las raices son reales y distintas y valen: " << endl << "x1 = " << x1 << "x2 = " << x2 << endl; 
    }
    else if (discriminante == 0.0) {

        float x = (-b / (2*a));
        
        cout << "Las raices son reales e iguales y valen: " << endl << "x1 = x2 = " << x << endl; 
    }
    else
    {
        float xr = (-b / (2*a));
        float xi = ((-discriminante) / (2*a));
        cout << "Las raices son complejas conjugadas y valen: " << endl << "La parte real = " << xr << "La parte imaginaria = " << xi << endl;
    }

    return 0;
    
}

