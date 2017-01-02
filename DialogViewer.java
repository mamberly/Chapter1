import javax.swing.JOptionPane;
public class DialogViewer
{
   public static void main(String[] args)
   {
   //JOptionPane.showMessageDialog(null, "Hello, Megan!");
   String name = JOptionPane.showInputDialog("What is your name?");
   //System.out.print("Hello " + name);
   JOptionPane.showInputDialog("What would you like me to do?");
   JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afraid I can't do that.");
   System.exit(0);
   }
   }