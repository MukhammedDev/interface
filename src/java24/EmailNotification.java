package java24;

public class EmailNotification implements NotificationService{

    @Override
    public void send(String message){
        System.out.println("Email-га жонотулду: "+message);
    }
}
