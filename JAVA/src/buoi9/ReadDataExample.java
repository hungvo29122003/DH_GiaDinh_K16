package buoi9;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDataExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/db221402";
        String user = "root";
        String passwor = "Scarlett 2003";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        // 1. kết nối đến csdl db221402
        // nạp driver cho app
        Class.forName( "com.mysql.jdbc.Driver");
        //tạo kết nối
        connection = DriverManager.getConnection(url, user, passwor);
        // thực thi câu sql
        String sql = "select Emp_Id, Emp_No, Emp_Name from Employee";
        // đối tượng java.sql.Statement
        statement = connection.createStatement();
        // dùng đối tượng statement để thực thi 
        resultSet = statement.executeQuery(sql);
        // in danh sách nhân viên
        while (resultSet.next()) {
            int emp_Id = resultSet.getInt(1);
            String empNo = resultSet.getString(2);
            String emp_Name = resultSet.getString("emp_Name");
            System.out.println("-----------------------");
            System.out.println("Emp_Id:" + emp_Id);
            System.out.println("Emp_No:" + empNo);
            System.out.println("Emp_Name" + emp_Name);
            
        }
        connection.close();
        
        
    }

}
