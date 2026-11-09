package java24;


public class Main {
    static void main() {
        System.out.println("Java 24");

        NotificationService[] notificationServices = new NotificationService[15];
        for (int i = 0; i < 15; i++) {
            if (i < 5) {
                notificationServices[i] = new EmailNotification();
            }else if (i < 10){
                notificationServices[i] = new SmsNotification();
            }else {
                notificationServices[i] = new PushNotification();
            }
        }

        for (NotificationService notService : notificationServices) {
            notService.send("Салам Java 24!");
        }
    }
}
