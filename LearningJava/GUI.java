import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
        //String name = JOptionPane.showInputDialog("Eneter your name");
        //int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //JOptionPane.showMessageDialog(null, name);
        //JOptionPane.showMessageDialog(null, "Your age is "+ age);
        int result = JOptionPane.showConfirmDialog(null, "Are you sure?"); //return 0 yes, 1 no, 2 cancel, -1 close
        JOptionPane.showMessageDialog(null, result);
        
    }
}
