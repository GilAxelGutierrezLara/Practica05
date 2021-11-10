/**
 *Clase Bisiesto programa que muestra si un a�o es bisiesto
 *
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
import java.util.Scanner;
    public class Bisiesto{
	/**
	 *Metodo principal donde usamos condicionales para saber si un a�o es bisiesto
	 *@param args Los argumentos
	 **/
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);//Usamos scanner para obtener un dato del usuario
	System.out.println("Ingresa el a�o del que deseas saber si es bisiesto: ");
	int a�o = sc.nextInt();
	int n = a�o/4;
	// Imprimimos una cadena de texto dependiendo si la condicion es verdadera o no
	if(((a�o % 4 == 0) && (a�o % 100 != 0)) || (a�o % 400 == 0)){
	    System.out.println("El a�o " + a�o + " es bisiesto");
	}else{
	    System.out.println("El a�o " + a�o + " no es bisiesto");
	}

    }
}
