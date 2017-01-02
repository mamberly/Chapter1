import javax.swing.JOptionPane;
public class SG
{
public static void main(String[] args)
{
String doit = JOptionPane.showInputDialog("What can I accomplish on your behalf?");
JOptionPane.showMessageDialog(null, "I cannot " + doit + ", sorry!");
System.out.println("This prints current line and then has an enter to start next print on a distinguished line");
System.out.print("This line is on a distinguished line but the following string will be on the same line");
System.out.println("This is on the same line");
System.out.print((3+7) + "This will add 3 and 7");
System.exit(0);
}
}
