/**
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class CicloWhile{
    /**
     *Metodo principal que imprime los numeros primos menores a mil
     *@param args Los argunetos
     **/
    public static void main(String[] args){
	int n=2;
	int j=2;
	boolean primo=true;
	//Imprimimos los numeros primos a traves del ciclo While
	while(n<1000){
	    while(j<n){
		if(n%j==0){
		    primo=false;
		}
		j++;
	    }
	    if(primo){
		System.out.println(n);
	    }
	    
	    n++;
	    //Restablecemos los valores iniciales de las variables j y primo
	    j=2;
	    primo=true;
	}
    }

}


