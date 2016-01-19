
public class rectangulo2 implements InterfazGeometrica {
    
    private Segmento inferior;
    private Segmento superior;
    private Segmento izquierdo;
    private Segmento derecho;

    public rectangulo2(Segmento inferior, Segmento superior, Segmento izquierdo, Segmento derecho) {
       
        this.inferior = inferior;
        this.superior = superior;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public Segmento getInferior() {
        return inferior;
    }

    public void setInferior(Segmento inferior) {
        this.inferior = inferior;
    }

    public Segmento getSuperior() {
        return superior;
    }

    public void setSuperior(Segmento superior) {
        this.superior = superior;
    }

    public Segmento getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Segmento izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Segmento getDerecho() {
        return derecho;
    }

    public void setDerecho(Segmento derecho) {
        this.derecho = derecho;
    }
    
    public void desplazar(double x, double y){
        
        this.inferior.Desplazar(x,y);
        this.derecho.Desplazar(x,y);
        this.izquierdo.Desplazar(x, y);
        this.superior.Desplazar(x, y);
        
    }

    @Override
    public double Area() {
       
        double a,l;
        
        a=this.superior.Tamaño();
        
        l=this.izquierdo.Tamaño();
        
        
        return a+l;
    }

    @Override
    public double Perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escalar(double porcentaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

