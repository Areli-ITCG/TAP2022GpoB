mport javax.swing.*;
import java.awt.event.*;//paquete para controlar los eventos

public class ConvCentoFar extends JFrame
{
  JLabel lblGCenti, lblGFar, Letrero;
  JTextField GCenti, GFar ;//Reserva el espacio en memoria
  JButton btnConvertir, btnSalir;
  JPanel panel;
  
  public ConvCentoFar()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar la ventana principal
    GCenti = new JTextField(10);//instanciación del objeto
    GFar = new JTextField(10);
    GFar.setEditable(false);//el usuario no puede cambiar el valor del texto
    
    Letrero = new JLabel("Convierte Grados Centigrados a Grados Farenheit");
    lblGCenti = new JLabel("Grados Centigrados: ");
    lblGFar = new JLabel("Grados Farenheit: ");
    
    btnConvertir = new JButton("Convertir");
    btnConvertir.setMnemonic('C');
    btnSalir = new JButton("Salir");
    btnSalir.setMnemonic('S');
    
    btnConvertir.addMouseListener(new MyClickListener());
    btnSalir.addMouseListener(new MyListener());
    
    panel = new JPanel();
    panel.add(Letrero);
    panel.add(lblGCenti);
    panel.add(GCenti);
    panel.add(lblGFar);
    panel.add(GFar);
    panel.add(btnConvertir);
    panel.add(btnSalir);
    setTitle("Centigrados a Farenheit");
    setContentPane(panel);
    setVisible(true);
  }
   
  private class MyClickListener extends MouseAdapter
  {
    double farenheit = 0.0;
    int gcent = 0;
    
    public void mouseClicked(MouseEvent event)
    { 
       try{
            String c = GCenti.getText();
           gcent = Integer.parseInt(c.trim());
           farenheit = (gcent * 9 / 5) + 32;//conversion
           GFar.setText(String.valueOf(farenheit));//Los JTextField solamente pueden recibir y mostrar cadenas.
          }
       catch(NumberFormatException e)
       {
         JOptionPane.showMessageDialog(null, "El valor de los grados centigrados no es correcto");
         GCenti.setText(" ");
         //GCenti.setText(null);
         GCenti.requestFocus();
         GFar.setText("32.00");
       }
    }//MyClickListener
  }//class

private class MyListener extends MouseAdapter
  {
    public void mouseClicked(MouseEvent event)
    {
      System.exit(0);
     }
  }
  
}
