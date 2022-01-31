public class Avion extends Vehiculo
{
    private double pesoton;

    public Avion(Color color, int numSerie, double peso) {
        super(color, numSerie);
        this.pesoton = peso;
    }
    
    public double pesoton()
    {
        return pesoton;
    }
    
     public void cambiapesoton(int c)
    {
        this.pesoton = c;
    }
     
 @Override
public String toString() {
    return super.toString() + ", peso en toneladas = " + pesoton;
  }
}
    