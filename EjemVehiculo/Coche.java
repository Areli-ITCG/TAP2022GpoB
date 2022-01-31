public class Coche extends Vehiculo
{
  //atributo
  private int NoCilindros;
  
  //Métodos
  public Coche(Color color, int NumSerie, int c)//método constructor
  {
    super(color, NumSerie);
    this.NoCilindros = c;
  }
  
 public int NoCilindros()
 {
   return NoCilindros;
 }
 
 public void cambiaCilindros(int c)
 {
   this.NoCilindros = c;
 }
 
 @Override
 public String toString()
 {
   return super.toString() + "  Numero de Cilindros   " + NoCilindros;
 }
}