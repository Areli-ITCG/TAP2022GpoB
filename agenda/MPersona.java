import java.util.*;

public class MPersona
{
  static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();
  private Persona objPersona;
  
  public MPersona()
  {}
  
  public void agregar(String nom, String ap, String tel, String correo, String tipo)
  {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setApellidos(ap);
    objPersona.setTelefono(tel);
    objPersona.setCorreoe(correo);
    objPersona.setTipo(tipo);
    Arrpersona.add(objPersona);//Agrega el objeto al arrayList
  }
}