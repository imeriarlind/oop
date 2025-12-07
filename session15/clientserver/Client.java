package session15.clientserver;

import java.util.concurrent.ThreadLocalRandom;

public class Client {
    public static void main(String[] args) {
        Server server = new Server();
        int x = ThreadLocalRandom.current().nextInt(10, 100);
        try {
            int response = server.getResponse(x);
            System.out.printf("Client: Response %d * %d = %d%n", x, response, x * response);
        }
        catch (DBException e) {
            System.out.println("Client: Server has an error! "+e.getMessage());
        }
    }
}
