package Experiment7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-11-21 18:44
 */
public class SqlTestDemo {

  static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost:3306/experiment7";

  public static void main(String[] args) {

    // 数据库的用户名与密码
    String user = "root";
    String password = "951209";

    Connection connection = null;
    Statement statement = null;

    try {
      Class.forName(JDBC_DRIVER);

      // 打开链接
      System.out.println("连接数据库...");

      Properties info = new Properties();
      info.setProperty("user", user);//property的key必须是"user"
      info.setProperty("password", password);//property的key必须是"password"
      connection = DriverManager.getConnection(DB_URL, info);

      // 执行查询 实例化statement对象
      statement = connection.createStatement();
      //存放sql语句
      String sql;
      sql = "SELECT * FROM Phone";

      ResultSet resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {

        String name = resultSet.getString("Name");
        String phoneNumber = resultSet.getString("PhoneNumber");

        System.out.print("姓名: " + name);
        System.out.print(" 电话: " + phoneNumber);
        System.out.println();
      }

      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入新增的姓名： ");

      String newName = scanner.next();
      System.out.println("请输入新增的电话: ");
      String newNum = scanner.next();
      String insertSQL = "insert into Phone (Name,PhoneNumber) Values (?,?)";

      //利用SQL语句将数据添加到数据库
      //3. 获取预编译语句对象
      PreparedStatement preparedStatement = null;
      preparedStatement = connection.prepareStatement(insertSQL);
      //4. 给各个占位符赋值
      preparedStatement.setString(1, newName);
      preparedStatement.setString(2, newNum);

      System.out.println();
      //5.执行sql语句,返回值是影响记录的行数
      int n = preparedStatement.executeUpdate();

      if (n > 0) {
        System.out.println("插入记录成功");
      }
      System.out.println("请输入你要修改的联系人： ");
      String updateName = scanner.next();
      System.out.println("请输入新号码： ");
      String updatePhoneNumber = scanner.next();

      String updateSQL = "update Phone set PhoneNumber = ? where Name = ?";
      preparedStatement = connection.prepareStatement(updateSQL);

      preparedStatement.setString(1, updatePhoneNumber);
      preparedStatement.setString(2, updateName);

      int m = preparedStatement.executeUpdate();

      if (m > 0) {
        System.out.println("修改成功");
      }
      System.out.println("请输入你要删除的联系人： ");
      String delteName = scanner.next();
      String deleteSQL = "delete from Phone where Name = ?";
      preparedStatement = connection.prepareStatement(deleteSQL);

      preparedStatement.setString(1, delteName);
      int k = preparedStatement.executeUpdate();
      if (k > 0) {
        System.out.println("删除成功");
      }

      resultSet.close();
      statement.close();
      connection.close();


    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
