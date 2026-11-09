package java24;

public class PushNotification implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Push-ка жонотулду: "+ message);
    }
}
