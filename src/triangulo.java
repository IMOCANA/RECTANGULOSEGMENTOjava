
public class triangulo extends figura {

    private double base;
    private double altura;
    
    public triangulo(Punto origen, double base, double altura){
        
        super(origen);
        this.base = base;
        this.altura = altura;
        
    }
    
    public double GetBase(){
        return base;
    }
    public double GetAltura(){
        return altura;
    }
    
    public void setBase(double base){
        this.base = base ;        
    }
    public void setAltura(double altura){
        this.altura = altura ;        
    }
    
    @Override
    public double Area() {
    
        return ((Math.sqrt(3))/4)*Math.pow(this.base, 2);
        
    }

    @Override
    public double Perimetro() {
    
        return this.base + this.base + this.base;
        
    }

    @Override
    public void Escalar(double porcentaje) {
        
        if(porcentaje<1){
            this.base = base * porcentaje;
            
        }else{
            this.base = base * (porcentaje/100);
        }
        
    }

    @Override
    public String toString() {
        
        String triangulo="El origen del triangulo es "+super.origen.toString()+" la altura es de "+altura+" y la base (y los lados) son de "+base+" ";
        return triangulo;
        
    }
    
}
