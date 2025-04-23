import java.awt.*;

public class SmsNotification extends PushNotification{
     public SmsNotification() {
         super();
     }
    @Override
    public void sendNotification(String message) {
         Toolkit.getDefaultToolkit().beep();
         System.out.println("New SMS Message :" + message);
    }
}
