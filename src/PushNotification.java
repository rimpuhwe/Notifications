import javax.swing.*;
import java.awt.*;

public class PushNotification implements NotificationService{
    String title = "Notification";
    @Override
    public void sendNotification(String message) {;
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

}
