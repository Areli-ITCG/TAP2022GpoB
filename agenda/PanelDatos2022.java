import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatos2022 extends JPanel implements ActionListener
{
  private JButton btnGuardar, btnCancelar;
  private JTextField txtNombre, txtApellidos, txtTelefono, txtCorreoe;
  private JRadioButton tec, trabajo;
  
  MPersona mpa = new MPersona();
  
  public PanelDatos2022()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(30);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(30);
    add(lblApellidos);
    add(txtApellidos);

    JLabel lblTelefono = new JLabel("Numero de Celular: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblCorreoe = new JLabel("Nombre: ", JLabel.RIGHT);
    txtCorreoe = new JTextField(30);
    add(lblCorreoe);
    add(txtCorreoe);
    
    JLabel lblTipo = new JLabel("ELIGE EL TIPO: ", JLabel.CENTER);
     JLabel lblTipo2 = new JLabel("", JLabel.CENTER);
    add(lblTipo);
    add(lblTipo2);

   
    ButtonGroup gpoBotones = new ButtonGroup();
    tec = new JRadioButton("TecNM/CdGuzman", true);
    trabajo = new JRadioButton("Trabajo");
    gpoBotones.add(tec);
    gpoBotones.add(trabajo);
    
    add(tec);
    add(trabajo);
    
    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);
    btnCancelar = new JButton("Cancelar");
    btnCancelar.addActionListener(this);
    
    add(btnGuardar);
    add(btnCancelar);
  }
  
  public void actionPerformed(ActionEvent e)
  {
     String tipo = "TecNM";
     if (trabajo.isSelected())
        tipo = "Trabajo";
     if(e.getSource()==btnGuardar){
       if(txtNombre.getText()==null || txtNombre.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        }
       else
        if(txtTelefono.getText()==null || txtTelefono.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes capturar su telefono",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
        }
        else
        {
          mpa.agregar(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(),
          txtCorreoe.getText(), tipo);
          JOptionPane.showMessageDialog(null, "Se guardaran los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);
            txtApellidos.setText(null);
            txtTelefono.setText(null);
            txtCorreoe.setText(null);
            txtNombre.requestFocus();
        }

     }
      if(e.getSource()==btnCancelar){
      System.exit(0);
      }
  }
}