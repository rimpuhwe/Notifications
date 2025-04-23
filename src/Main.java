import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                new PushNotification().sendNotification("New message received!");
            }
        };
        timer.schedule(task ,5000);

    }
}
