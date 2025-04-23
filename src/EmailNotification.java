import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class EmailNotification extends PushNotification{
    public EmailNotification() {
        super();
    }
    @Override
    public void sendNotification(String message){
        JOptionPane.showMessageDialog(null , message, title, JOptionPane.INFORMATION_MESSAGE);

    }
}
