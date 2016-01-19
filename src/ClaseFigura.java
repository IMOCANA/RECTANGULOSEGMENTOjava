/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isamar
 */
   
    public abstract class ClaseFigura {
        protected Punto origen; //Protegido solo puede acceder desde que las herede 
                                //solo comparten la clase punto, lo metemos aqui
        
        private static int numFiguras = 0 ;
        
        public ClaseFigura(Punto origen) {
            this.origen=origen;
            ClaseFigura.numFiguras++;
        }
        public Punto getOrigen() {
            return origen;
        }
        
        
        public void setOrigen(Punto Origen) {
            
            this.origen=Origen;
        }
        
         public void desplaza(int dx, int dy) {
            
            this.origen.desplazar(dx, dy);
        }


        @Override
        public String toString() {
            return this.origen.toString(); 
        }
        
        public int numFiguras(){
            return ClaseFigura.numFiguras;
            
        }
        
        public double distancia(ClaseFigura f){
            return this.origen.distancia(f.getOrigen());
        }
        
        protected abstract double area();
        protected abstract double perímetro();
        protected abstract void escalar(double n);
        
      
    }

