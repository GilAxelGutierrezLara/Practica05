/**
 *Programa para calcular el area y volumen de un cilindro
 *@autor Gil Axel Gutierrez Lara
 *@version 1.0
 **/

public class Cilindro{
    /**
     *MEtodo principal que calcula el area y volumen de un cilindro
     *
     *@param args Los argumentos
     **/
    
    public static void main(String[] args){
	//Variables necesarias para calcular el area y volumen de un cilindro  	
	int radio = 10;
     	int altura = 20;
       	double pi = 3.14159;

	//Formula que devuelve el valor del area del cilindro
	double area = (2*pi*radio*altura)+ 2*pi*radio*radio;

	//Formula que devuelve el valor del volumen del cilindro
	double volumen = pi*radio*radio*altura;

	//Imprimimos cadenas de texto con los valores del area y el volumen del cilindro

	System.out.println("El area de un cilindro es: " + area + "cm^2");
	System.out.println("El volumen de un cilindro es: " + volumen + "cm^2");
        }
}
