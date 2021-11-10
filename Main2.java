/**
 *Metodo que usa las clase rectangulo
 *
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/

import java.util.Scanner;
public class Main2{
    /**
     *Metodo principal donde usaremos la clase rectangulo
     *
     *@param args Los argumentos
     **/
    public static void main(String[] args){

	Rectangulo rectangulo = new Rectangulo();



	//Imprimimos cadenas de texto con los valores iniciales
	
	System.out.println("Base = " + rectangulo.getBase());
	System.out.println("Altura = " + rectangulo.getAltura());
	rectangulo.setArea(rectangulo.area());
	rectangulo.setPerimetro(rectangulo.perimetro());
	
	System.out.println(rectangulo.toString());

	
	
	//Usamos Scanner para obtener datos del usuario
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa el valor de la altura");
	double altura1 = sc.nextDouble();
	System.out.println("Ingresa el valor de la base");
	double base1 = sc.nextDouble();

	Rectangulo rectangulo1 = new Rectangulo(base1, altura1);

	//Imprimimos cadenas de texto con los valores asignados por el usuario
	rectangulo1.setBase(base1);
	rectangulo1.setAltura(altura1);
	System.out.println("Base = " + rectangulo1.getBase());
	System.out.println("Altura = " + rectangulo1.getAltura());
	
	rectangulo1.setArea(rectangulo1.area());
	rectangulo1.setPerimetro(rectangulo1.perimetro());
	System.out.println("Area = " + rectangulo1.getArea());
	System.out.println("Perimetro = " + rectangulo1.getPerimetro());
	System.out.println(rectangulo1.toString());

	    
    }
}
