package Experiment7;

import StartSQL.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-11-23 9:56
 */
public class ExchangeRateSqlTest {

  private static final String DB_URL = "jdbc:mysql://localhost:3306/experiment7";

  public static void main(String[] args) {
    // 数据库的用户名与密码
    String user = "root";
    String password = "951209";

    try {
      Connection connection = JDBCUtils.getConnection(DB_URL, user, password);
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入你所在的城市: \"KR\"  \"USA\"  \"AS\"  \"HK\"  \"CN\" ");
      String country = scanner.next();
      System.out.println("请输入你要兑换的城市：\"KR\"  \"USA\"  \"AS\"  \"HK\"  \"CN\"");
      String targetCountry = scanner.next();
      String selectSQL = "select Rate from exchangerate where Country = ? and TargetCountry = ?";
      PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
      preparedStatement.setString(1, country);
      preparedStatement.setString(2, targetCountry);

      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        String rate = resultSet.getString("Rate");

        System.out.print("汇率是： " + rate);
        System.out.println();
        System.out.println("请输入你要兑换的金额： ");
        double cash = scanner.nextDouble();
        double targetRate = Double.parseDouble(rate);
        double newCash = cash * targetRate;
        System.out.println("兑换后的金额为： ");
        System.out.println(newCash);
      }

      JDBCUtils.closeStatement(resultSet, preparedStatement, connection);

    } catch (SQLException e) {
      e.printStackTrace();
    }


  }

}
