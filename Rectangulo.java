/**
 *Clase que representa a un rectangulo
 *
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/

public class Rectangulo{

    //Atributos
    //El valor de la base
    private double base;
    //El valor de la altura
    private double altura;
    //El valor del area
    private double area;
    //El valor del perimetro
    private double perimetro;

    //Constructores sin Args
    /**
     *Metodo constructor sin argumentos
     **/
    
    public Rectangulo(){
	this.base = 5;
	this.altura = 4;
    }
    
    //Construc con Args
    /**
     *Constructor que recibe dos valores reales
     *
     *@param base El parametro que representa el valor de la base
     *@param altura El parametro que representa el valor de la altura
     **/
    
    public Rectangulo(double base, double altura){
	this.base = base;
	this.altura = altura;
    }

    // Metodos
    /**
     *Metodo que devuelve el valor de la base
     *
     *@return El valor de la base
     **/
    
    public double getBase(){
	return this.base;
    }
    
    /**
     *Metodo que devuelve la altura
     *
     *@return El valor de la altura
     **/
    
    public double getAltura(){
	return this.altura;
    }

    /**
     *MEtodo que cambia del valor de la base
     *
     *@param El nuevo valor de la base
     **/

    public void setBase(double base){
	this.base = base;
    }

    /**
     *Metodo que cambia el valor de la altura
     *
     *@param EL nuevo valor de la altura
     **/

    public void setAltura(double altura){
	this.altura = altura;
    }

    /**
     *Metodo que devuelve el valor del area
     *
     *@return El valor de la altura
     **/

    public double area(){
	return base*altura;
    }
    /**
     *Metodo que devuelve el valor del perimetro
     *
     *@return El valor del perimetro
     **/

    public double perimetro(){
	return (base*2) + (altura*2);
    }

    /**
     *Metodo que asigna el valor del area
     *
     *@return El valor del area
     **/
    
    public double getArea(){
	return this.area;
    }

    /**
     *Metodo que devuelve el valor del perimetro
     *
     *@return EL valor del perimetro
     **/

    public double getPerimetro(){
	return this.perimetro;
    }
    /**
     *Metodo para cambiar el valor del area
     *
     *@param El nuevo valor del area
     **/
    
    public void setArea(double area){
	this.area = area;
    }
    /**
     *Metodo que cambia el valor del perimetro
     *
     *@param El nuevo valor del perimetro
     **/

    public void setPerimetro(double perimetro){
	this.perimetro = perimetro;
    }

    /**
     *Metodo para imprimir una cadena de texto con los atributos del rectangulo
     **/

    public String toString(){
	return "El rectangulo con altura = " + altura + ", y base = " + base + " tiene area = " + area + "; y perimetro = " + perimetro + ".";
    }
   
}
