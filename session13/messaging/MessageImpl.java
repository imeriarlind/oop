package session13.messaging;

public class MessageImpl implements Message {
    public void sendMessage(String message, int type) {
        if(type == 0)
        {
            System.out.println("Sending message via email! Message: "+message);
        }
        else if (type == 1)
        {
            System.out.println("Sending message via SMS! Message: "+message);
        }
        else if (type == 2)
        {
            System.out.println("Sending message via Viber! Message: "+message);
        }
        else {
            System.out.println("Sending message via Post! Message: "+message);
        }
    }
}
