package session13.messaging;

public class MessageTest {
    public static void main(String[] args) {
        Message emailMessaging = new EmailMessaging();
        Message smsMessaging = new SmsMessaging();
        Message postMessaging = new PostMessaging();
        Message viberMessaging = new ViberMessaging();
        emailMessaging.sendMessage("Tung juve", 0);
        smsMessaging.sendMessage("Hello World", 1);
        postMessaging.sendMessage("Tungjatjeta", 10);
        viberMessaging.sendMessage("Pershendetje", 10);
    }
}
