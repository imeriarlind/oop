package session13.messaging;

public class ViberMessaging implements Message{

    @Override
    public void sendMessage(String message, int type) {
        System.out.println("Sending message via VIBER! Message: "+message);
    }
}
