/**
 *Programa que muestra el numero de Bytes que ocupa cada tipo primitivo
 *@autor Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Primitivo{
    /**
     *Metodo principal que imprime la memoria que ocupa cada variable de tipo primitivo
     *
     *@param args Los argumentos
     **/
    public static void main(String[] args){

	//Necesitamos una variable de cada tipo primitivo
	int x = 1;
	byte y = 5;
	short z = 5;
	long a = 5;
	float b = 5.5f;
	double c = 5.5f;
	char d = 'h';
	boolean e = true;

	//IMprimimos cadenas de texto que muestran la cantidad de memoria que
	//ocupa cada variable de tipo primitivo

       	System.out.println("int: " + Integer.BYTES);

	System.out.println("byte: " + Byte.BYTES);

	System.out.println("short: " + Short.BYTES);

	System.out.println("long: " + Long.BYTES);

	System.out.println("float: " + Float.BYTES);

	System.out.println("boolean: 1 bytes");

       	System.out.println("double: " + Double.BYTES);

	System.out.println("char:  " + Character.BYTES);
    }
}
