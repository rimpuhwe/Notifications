import javax.swing.*;
import java.awt.*;

public class PushNotification implements NotificationService{
    String title;
    PushNotification(){
        this.title = "Notification";
    }

    @Override
    public void sendNotification(String message) {;
        System.out.println("Send push Notification :" + message);
    }

}
