/**
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class CicloFor{
    /**
     *Metodo principal que obtiene e imprime los primeros 100 numeros primos
     *
     *@param args Los argumentos
     **/
    public static void main(String[] args){
	boolean primo;
	int n = 1;
	int j;
	int i;
	//Obtenemos los primeros 100 numeros primos a traves del ciclo for
	for(i = 0; i < 169; n++){
	    primo = true;
	for(j = 2; j<=n/2 && primo==true; j++){
	    if(n%j==0) primo = false;
	}
	//Imprimimos el numero en caso de que sea primo
        if(primo){
	    i++;
	    System.out.println(n);
	}
	}
    }
}

	    
