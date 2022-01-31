/*Clase que representa un vehículo cualquiera*/
public class Vehiculo
{
  //colores con los que se puede pintar un vehículo
  public static enum Color {ROJO, VERDE, AZUL}
  
  //atributos
  
  private Color color;
  private int numSerie;
  
  /**
  * Construye un vehículo
  * solicitar dos parámetros el color y el número de serie
  */
  public Vehiculo(Color color, int numSerie)
  {
    this.color = color;
    this.numSerie = numSerie;
  }
  
  /*Retorna el color del vehículo*/
  public Color color()
  {
    return color;
  }
  
  public int numSerie()
  {
    return numSerie;
  }
  
  public void pinta(Color c)
  {
    color = c;
  }
  
@Override
 public String toString() {
    return "Vehiculo -> numSerie= " + numSerie + ", color= " + color;
  }
}
