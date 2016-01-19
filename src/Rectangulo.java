/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isamar
 */
public class Rectangulo extends Cuadrado {
         
   private double altura; 
   
   
// Constructor 
// añade un valor de los atributos que se convierte en variables cuando el usuario
// introduce por pantalla los valores.
   
   public Rectangulo (Punto origen, double ancho,double altura){ 
       
       super(origen,ancho); /*es hijo de alguien*/
       this.altura = altura; 
             
    } 
   
   public double getAltura() {
        return this.altura;
    }
    

        //public void (Se pone void porque es un metodo para escribir que no devuelve nada y se pone void).
    
        ////public void set+nombre variable
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
   
   
    public double area() { //base * altura
        
         double resultado = super.ancho * this.altura;
         return resultado;
     
    }
    
    public double perimetro() { //No ponemos (double radio) porque radio ya esta definido en el contructor y forma parte del circulo. No es
                                //una nueva variable.
        
         double resultado = super.ancho + super.ancho + this.altura + this.altura;
         return resultado;
     
    }

    public void escalar(double r) { 
        
         super.setancho(super.ancho * (r/100));
         this.setAltura(this.altura * (r/100));
     
    }
  
    @Override
     public String toString() {         
       return "Cuadrado{" + super.toString() + ", ancho=" + this.ancho +" "+this.altura+"}";         
    }
}
  
 