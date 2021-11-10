/**
 *Clase Bisiesto programa que muestra si un año es bisiesto
 *
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
import java.util.Scanner;
    public class Bisiesto{
	/**
	 *Metodo principal donde usamos condicionales para saber si un año es bisiesto
	 *@param args Los argumentos
	 **/
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);//Usamos scanner para obtener un dato del usuario
	System.out.println("Ingresa el año del que deseas saber si es bisiesto: ");
	int año = sc.nextInt();
	int n = año/4;
	// Imprimimos una cadena de texto dependiendo si la condicion es verdadera o no
	if(((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0)){
	    System.out.println("El año " + año + " es bisiesto");
	}else{
	    System.out.println("El año " + año + " no es bisiesto");
	}

    }
}
