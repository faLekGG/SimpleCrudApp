package com.Goloveyko.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL ="jdbc:mysql://localhost:3306/UserDB?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true"
            + "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String userName = "root";
    private static final String userPassword = "falek";

    private static Connection connection;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, userName, userPassword);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return connection;
        }
    }
}
