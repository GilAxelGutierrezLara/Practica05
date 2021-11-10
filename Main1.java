/**
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
import java.util.Scanner;
public class Main1{
    /**
     *Metodo principal donde usaremos la clase Cuenta
     *
     *@param args Los argumentos 
     **/
    public static void main(String[] args){
	Cuenta cuenta = new Cuenta();
	
	
        //Imprimimos cadenas de texto con los valores iniciales
	System.out.println(cuenta.getTitular());
	System.out.println(cuenta.getDineroDisponible());
	System.out.println(cuenta.toString());

	//Usamos Scanner para obtener datos del usuario
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa tu nombre para conocer tu saldo");
	String titular2 = sc.nextLine();
	
	Cuenta cuenta2 = new Cuenta(titular2,0.0);
	
       
	//IMprimimos cadenas de texto con los valores dados por el usiario
	cuenta2.setTitular(titular2);
	System.out.println(cuenta2.getTitular());
	System.out.println(cuenta2.getDineroDisponible());
	System.out.println(cuenta2.toString());
        



	
    }
}
