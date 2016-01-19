/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isamar
 */
public class Circulo extends ClaseFigura {   
    
    private double radio;

   
// Constructor 
// añade un valor de los atributos que se convierte en variables cuando el usuario
// introduce por pantalla los valores.
   
   public Circulo (Punto origen,double radio) { 
       super(origen); 
       this.radio = radio;      
    } 

   
   
// Definición de métodos  
   
        //public double get
   
        //public tipodedato get+nombre variable
   
   
   
    public double getradio() { 
        return radio;
    }

    public Punto getorigen() {
        return origen;
    }

        //public void
    
        ////public void set+nombre variable
    
    public void setradio(double radio) {
        this.radio = radio;
    }

    public void setorigen(Punto origen) {
        this.origen = origen;
    }

//Definición de funciones
    
//   @Override //sobre escribir el método toString para que se escriba lo que yo quiero
   
//    public String  toString() {
//        return "("+this.origen +","+this.radio+")";
//  }
    
    //Calculamos el area
    
    @Override
    public double area() { //(double radio) porque radio es lo que define el area de un circulo y double porque en un número decimal
        
         double resultado = Math.pow(this.radio,2) * 3.1416 ;
         return resultado;
     
    }
    
    @Override
    protected double perímetro() { //No ponemos (double radio) porque radio ya esta definido en el contructor y forma parte del circulo. No es
                                //una nueva variable.
        
         double resultado = 2 * 3.1416 * this.radio;
         return resultado;
         
     
    }
    
    public void escalar(double r, Circulo c1) { 
        
         this.setradio((this.radio + this.radio) * (r/100)); 
               
     
    }
  
    @Override
    public String toString() { 
        
         return "Circulo{" + super.toString() + "radio=" + this.radio + "}";
              
    }

    @Override
    protected void escalar(double n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

