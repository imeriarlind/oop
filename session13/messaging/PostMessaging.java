package session13.messaging;

public class PostMessaging implements Message{

    @Override
    public void sendMessage(String message, int type) {
        System.out.println("Sending message via POST! Message: "+message);
    }
}
