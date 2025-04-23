import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification = new EmailNotification();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                emailNotification.sendNotification("A New Email Message Incoming");
            }
        };
        timer.schedule(task ,5000);

        NotificationService smsNotification = new SmsNotification();
        smsNotification.sendNotification("Hello Sweetie \uD83C\uDF53");

    }
}
