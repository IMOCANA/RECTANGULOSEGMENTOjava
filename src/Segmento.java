/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isamar
 */
public class Segmento {
    
       
 
// Declaración de atributos 
    
   private Punto x1; 
   private Punto x2; 
   
// Constructor 
// añade un valor de los atributos que se convierte en variables cuando el usuario
// introduce por pantalla los valores.
   
   public Segmento (Punto x1, Punto x2) 
           
 { 
       this.x1 = x1; 
       this.x2 = x2;         
 } 
   
// Definición de métodos  
   
        //public double get
   
        //public tipodedato get+nombre variable
   
    public Punto getX1() {
        return this.x1;
    }

    public Punto getX2() {
        return this.x2;
    }

        //public void
    
        ////public void set+nombre variable
    
    public void setX1(Punto x1) {
        this.x1 = x1;
    }

    public void setX2(Punto x2) {
        this.x2 = x2;
    }

//Definición de funciones
    
   @Override //sobre escribir el método toString para que se escriba lo que yo quiero
   
    public String  toString() {
        return "("+this.x1+","+this.x2+")";
    }
    
     /* public double distancia(Punto x1, Punto x2){
            return this.x1.distancia(x2.getx2());
        }*/

    public void desplazar(Punto x1, Punto x2) {
        
        this.desplazar(x1,x2); 
        /*this.x2.desplazar(Punto x1,x2);*/
    }
    
   
    /* public double distancia(Punto p2) {
        
         double resultado = Math.sqrt(Math.pow(p2.getX()-this.x,2) + Math.pow(p2.getY()-this.y,2));
         return resultado;
    } //p2.getX() ---> Para que coja lo que vale la nueva x introducida por el usuario.
     //*/
     
}


