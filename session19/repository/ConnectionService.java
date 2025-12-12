package session19.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {
    private static final String url = "jdbc:mysql://localhost:3306/life_oop?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
            connection.setAutoCommit(false);
            return connection;
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }
    }
}
