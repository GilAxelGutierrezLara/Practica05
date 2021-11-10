/**
 *@autor Gil Axel Gutierrez Lara
 *@version 1.0
 **/
import java.util.Scanner;

public class Condicionales{
    /**
     *Metodo principal que compara dos valores dados por el usuario
     *
     *@param args Los argumentos
     **/
    public static void main(String[] args){
	//Usamos scanner para obtener dos datos del ususario
	Scanner sc = new Scanner(System.in);
	System.out.println("Dame el numero 1: ");
	int n1 = sc.nextInt();
	System.out.println("Dame el numero 2: ");
	int n2 = sc.nextInt();
	//Usamos condicionales para comparar los valores e imprimimos una cadena de texto con el resultado
	if(n1>n2){
	    System.out.println("El numero con mayor valor es: " + n1);
	}else if(n1<n2){
	    System.out.println("El numero con mayor valor es: " + n2);
	}else{
	    System.out.println(n1 + " es igual a " + n2);
	}

    }
}

