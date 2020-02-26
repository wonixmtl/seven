package test;

import utils.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            Connection conn = JDBC.getConnection();

            String sql = "select * from zhou";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                System.out.println(rs.getInt(1) + "," + rs.getString(2));
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
