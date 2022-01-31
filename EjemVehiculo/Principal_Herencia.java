public class Principal_Herencia
{
  public static void main(String []args)
  {
    Coche car1 = new Coche(Vehiculo.Color.ROJO, 65438, 4);
    System.out.println(car1.toString());
    Vehiculo car2 = new Coche(Vehiculo.Color.AZUL, 98760, 6);
    System.out.println(car2.toString());
    Vehiculo barco1 = new Barco(Vehiculo.Color.VERDE, 54328);
    System.out.println(barco1.toString());
    barco1.pinta(Vehiculo.Color.ROJO);
    System.out.println(barco1.color());
    Vehiculo nose;//Reservando el espacio en memoria
    nose = new Avion(Vehiculo.Color.AZUL, 98765, 65); //instancia de la clase
    System.out.println(nose.toString());
  }
}