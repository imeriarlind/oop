package session15.clientserver;

public class Server {

    public int getResponse(int value) throws DBException
    {
        try (DBServer dbServer = new DBServer()){
            return value * dbServer.getValue();
        }
        catch (DBException e) {
            System.out.println("Server: logging DB Exception "+e.getMessage());
            throw e;
        }
//        finally
//        {
////            try {
//                dbServer.close();
////            }
////            catch (DBException e) {
////                System.out.println(e.getMessage());
////            }
//        }
    }
}
