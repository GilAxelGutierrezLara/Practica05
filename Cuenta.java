/**
 *Clase que representa una cuenta bancaria
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Cuenta{

    //Atributos
    //El nombre del titular de la cuenta
    private String titular;
    //La cantidad de dinero disponible en la cuenta
    private double dineroDisponible;

    //Constructor sin Args
    /**
     *Constructor con valores preestablecidos
     *@param titular EL parametro que representa el nombre del titular
     *@param dineroDisponible EL valor que representa la catidad de dinero en la cuenta
     **/
    public Cuenta(){
	this.titular = "Gil Axel Gutierrez Lara";
	this.dineroDisponible = 5000000.0;
    }

    //Construcctor con Args
    /**
     *Constructor que recibe dos datos un nombre e inicializa la catidad de dinero disponible en cero
     *@param titular EL parametro que representa el nombre del titular
     *@param dineroDisponible EL valor que representa la catidad de dinero en la cuenta
     **/
    public Cuenta(String titular, double dineroDisponible){
	this.titular = titular;
	this.dineroDisponible = 0.0;
    }
    //Metodos get y set
    /**
     *Metodo que devuelve el nombre del titular
     *@return El nombre del titular 
     **/
    public String getTitular(){
	return this.titular;
    }
    /**
     *Metodo que devuelve la cantidad de dinero disponible
     *@return La cantidad de dinero disponible
     **/
    
    public double getDineroDisponible(){
	return this.dineroDisponible;
    }
    /**
     *Metodo que cambia el nombre del titular
     *@param El nuevo nombre del titular
     **/
    public void setTitular(String titular){
	this.titular = titular;
    }
    /**
     *Metodo que cambia la cantidad de dinero disponible
     *@param La nueva cantidad de dinero disponible
     **/
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }

    // Metodo toString
    /**
     *Metodo que imprime una cadena de texto con la informacion de la cuenta
     **/
    public String toString(){
	return "El titular " + titular + " tiene un saldo de " + dineroDisponible + " pesos"; 
    }
    
}

