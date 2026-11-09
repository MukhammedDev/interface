package java24;

public class SmsNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("SMS-ке жонотулду "+ message);
    }
}
