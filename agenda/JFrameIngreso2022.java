import javax.swing.*;
import java.awt.*;

public class JFrameIngreso2022 extends JFrame
{
   PanelIngreso2022 mostrar = new PanelIngreso2022();
   
    public JFrameIngreso2022()
   { 
     initComponents();
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("Usuario y Contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}