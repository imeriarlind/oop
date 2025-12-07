package session15.clientserver;

import java.util.concurrent.ThreadLocalRandom;

public class DBServer implements AutoCloseable
{
    public int getValue() throws DBException
    {

        int value = ThreadLocalRandom.current().nextInt(-99, 100);
        if(value % 2 == 0)
        {
            throw new DBException(value + " is an even number");
        }
        return value;
    }

    public void close() throws DBException
    {
        int value = ThreadLocalRandom.current().nextInt(-99, 100);
        if(value < 0)
        {
            throw new DBException("Exception while closing connection!");
        }
        System.out.println("Closing DB Connection!");
    }
}
