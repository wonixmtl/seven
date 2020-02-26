package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC
{
    //数据库url
    private static String url = "jdbc:mysql://localhost:3306/my_test?useSSL=false&serverTimezone=UTC";
    //用户名
    private static String user = "root";
    //密码
    private static String password = "root";

    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url,user,password);

        return conn;
    }
}
