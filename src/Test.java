import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        /*the dialog box showing the message and the title */
//        JOptionPane.showMessageDialog(null, "Hello World" , "Notification", JOptionPane.PLAIN_MESSAGE);

        /*beeping message in the console */
//        Toolkit.getDefaultToolkit().beep();
//        System.out.println("Hello World!");
        /*combining both */
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Hello World" , "Notification", JOptionPane.PLAIN_MESSAGE);git

    }
}
