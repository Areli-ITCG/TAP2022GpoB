public class Main2022
{
  public static void main(String[] args) 
  {
   MySimpleGUI gui = new MySimpleGUI();
  }
}

class MySimpleGUI extends JFrame 
{
  public MySimpleGUI() 
  {
    setSize(500, 300);
    setTitle("Ventana tipo JFrame");
    setVisible(true);
   }
}
