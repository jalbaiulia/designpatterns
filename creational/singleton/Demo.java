package creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        long timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        Statement sta;

        try {
            sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                    " City VARCHAR(20))");
            System.out.println("Table created");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);


    }
}
