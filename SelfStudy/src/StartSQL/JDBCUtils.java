package StartSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ShawnYue
 * @date 2018-11-23 11:04
 */
public class JDBCUtils {
  private JDBCUtils(){

  }

  //由于驱动程序不经常改变，且没有多次加载数据库驱动的必要，
  //将驱动程序放在静态代码块中，只在类加载的时候加载一次，且在构造方法前被加载

  private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

  static {

    try {
      Class.forName(JDBC_DRIVER);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
  private static Connection connection = null;

  public static Connection getConnection(String DB_URL, String user, String password)
      throws SQLException {

    connection = DriverManager.getConnection(DB_URL, user, password);
    return connection;
  }

  public static void closeStatement(ResultSet resultSet, Statement statement,Connection connection){
    if(resultSet != null){
      try{
        resultSet.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if(statement != null){
      try{
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if(connection != null){
      try{
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }




}

