package session13.messaging;

public class SmsMessaging implements Message{

    @Override
    public void sendMessage(String message, int type) {
        System.out.println("Sending message via SMS! Message: "+message);
    }
}
