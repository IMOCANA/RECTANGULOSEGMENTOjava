/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isamar
 */
public class Cuadrado extends ClaseFigura {
    
    protected double ancho;
   
// Constructor 
// añade un valor de los atributos que se convierte en variables cuando el usuario
// introduce por pantalla los valores.
   
    public Cuadrado (Punto origen, double ancho){ 
      
      super(origen); 
      this.ancho = ancho;       
       
    } 
   
// Definición de métodos  
   
        //public double get
   
        //public tipodedato get+nombre variable
   
    public double getancho() {
        return ancho;
    }
    


        //public void (Se pone void porque es un metodo para escribir que no devuelve nada y se pone void).
    
        ////public void set+nombre variable
    
    public void setancho(double ancho) {
        this.ancho = ancho;
    }
 
//Definición de funciones
    
//   @Override //sobre escribir el método toString para que se escriba lo que yo quiero
   
//    public String  toString() {
//        return "("+this.origen +","+this.radio+")";
//  }
    
    //Calculamos el area
    
    @Override
    public String toString() {
        return "Cuadrado{" + super.toString() + ", ancho=" + this.ancho +"}";
    }
    
    
    @Override
    public double area() { 
        
         double resultado = (this.ancho*this.ancho);
         return resultado;
     
    }
    
    @Override
    protected double perímetro(){ //No ponemos (double radio) porque radio ya esta definido en el contructor y forma parte del circulo. No es
                                //una nueva variable.
        double resultado =(this.ancho * 4);
        return resultado;
    }

    @Override
    public void escalar(double r) { 
        
         this.ancho =  this.ancho * (r/100);
   
     
    }  
}

