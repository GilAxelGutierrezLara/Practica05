/**
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class CicloDoWhile{
    /**
     *Metodo principal que imprime los primos que son menores a mil
     *@param args Los argumentos
     **/
    public static void main(String[] args){
	int n=2;
	int j= 2;
	boolean primo=true;
	//Imprimimos los numeros primos menores a mil a traves del ciclo Do-While
	do{
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
	    j=2;
	    primo=true;
		
	}while(n<1000);
    }
}
