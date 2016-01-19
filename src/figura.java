
public class figura implements InterfazGeometrica {
    
    protected Punto origen;
    
    private static int numFiguras = 0;
    
    public figura(Punto origen){
        
        this.origen = origen;
        figura.numFiguras++;
        
    }   
    
    public Punto GetOrigen(){
        return origen;
    }
    
    public void setOrigen(Punto origen){
        this.origen = origen ;        
    }
    
    
    public void Desplazar(double dx, double dy){
        
        this.origen.desplazar(dx, dy);
        
    }
    
    @Override
    public String toString(){
        return this.origen.toString();
    }
    
    public static int numFiguras() {
        return figura.numFiguras;
        
    }

    @Override
    public double Area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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