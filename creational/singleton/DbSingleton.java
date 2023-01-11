package creational.singleton;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static volatile DbSingleton instance = null;
    public static volatile Connection conn = null;

    private DbSingleton() {
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (conn != null) {
            throw new RuntimeException("One getConnection() method to create");
        }
        if (instance != null) {
            throw new RuntimeException(("One getInstance() method to create"));
        }
    }

    public static DbSingleton getInstance() {
        //double checked locking pattern (DCLP :) BUB )
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized (DbSingleton.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }


}
