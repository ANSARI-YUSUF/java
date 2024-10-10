

import javax.swing.*;


public class GUI {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("enter name:");
        JOptionPane.showMessageDialog(null, "name="+ name);


        int age=Integer.parseInt(JOptionPane.showInputDialog("enter age:"));
        JOptionPane.showMessageDialog(null,"your age="+ age);

        // JOptionPane.showInternalConfirmDialog(null, name);
        JOptionPane.showMessageDialog(null,  "name"+name+"age="+age);
        // JOptionPane.showMessageDialog(null,  "age="+);

    }
    
}
