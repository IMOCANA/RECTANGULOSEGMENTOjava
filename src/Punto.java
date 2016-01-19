/*
Creamos la clase Punto que forma parte de la clase figura
 */

public class Punto {    
 
// Declaración de atributos 
    
   private double x; 
   private double y; 
   
// Constructor 
// añade un valor de los atributos que se convierte en variables cuando el usuario
// introduce por pantalla los valores.
   
   public Punto (double x, double y) 
           
 { 
       this.x = x; 
       this.y = y;         
 } 
   
// Definición de métodos  
   
        //public double get
   
        //public tipodedato get+nombre variable
   
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

        //public void
    
        ////public void set+nombre variable
    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

//Definición de funciones
    
   @Override //sobre escribir el método toString para que se escriba lo que yo quiero
   
    public String  toString() {
        return "("+this.x+","+this.y+")";
    }

    public void desplazar(double x,double y) {
        
        this.x=this.x+x; //si el punto está en el punto por ejemplo (0,0) se traduce como this.x (es un ejemplo) y le dices que se desplace 
        this.y=this.y+y; //la x 3 posiciones y la y 2 posiciones le indicamos que la variable this.x valdrá su valor + la suma de la posición.
    }
    
   
     public double distancia(Punto p2) {
        
         double resultado = Math.sqrt(Math.pow(p2.getX()-this.x,2) + Math.pow(p2.getY()-this.y,2));
         return resultado;
    } //p2.getX() ---> Para que coja lo que vale la nueva x introducida por el usuario.
     //
     
}


   
//void lo ponemos porque no sabemos que tipo de dato es el nombre de método.
  