package session13.messaging;

public class EmailMessaging implements Message{

    @Override
    public void sendMessage(String message, int type) {
        System.out.println("Sending message via email! Message: "+message);
    }
}
