package Sql;

/**
 * @author ShawnYue
 * @date 2018-11-14 13:01
 */
import java.sql.*;
import java.util.Properties;
public class TestSql {

  public static void main(String[] args) {

    // JDBC 驱动名及数据库 URL
    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";


    String DB_URL = "jdbc:mysql://localhost:3306/experiment7";

    // 数据库的用户名与密码，需要根据自己的设置
    String user = "root";
    String password = "951209";

    Connection conn = null;
    Statement stmt = null;
    try{
      // 注册 JDBC 驱动
      Class.forName(JDBC_DRIVER);

      // 打开链接
      System.out.println("连接数据库...");

      Properties info = new Properties();
      info.setProperty("user",user);//property的key必须是"user"
      info.setProperty("password",password);//property的key必须是"password"
      conn = DriverManager.getConnection(DB_URL,info);



      // 执行查询
      System.out.println(" 实例化Statement对象...");
      stmt = conn.createStatement();
      //sql语句
      String sql;
      sql="SELECT * FROM Student";

      ResultSet rs = stmt.executeQuery(sql);

      // 展开结果集数据库
      while(rs.next()){
        // 通过字段检索
        int id  = rs.getInt("Student_ID");

        String name = rs.getString("Student_Name");
        int age_s = rs.getInt("Age");
        float math_s = rs.getFloat("Math_Scores");
        float english_s = rs.getFloat("English_Scores");
        float Height_s = rs.getFloat("Height");
        float Weight_s = rs.getFloat("Weight");
        // 输出数据
        System.out.print("ID: " + id);
        System.out.print(" 名字: " + name);
        System.out.print(" 年龄: " + age_s);
        System.out.print(" 数学成绩: " + math_s);
        System.out.print(" 英语成绩: " + english_s);
        System.out.print(" 身高（cm）: " + Height_s);
        System.out.print(" 体重（kg）: " + Weight_s);

        System.out.print("\n");

      }

      ///////////////////////////插入一条新数据//////////////////////////////////////
      int new_id  = 20161233;
      boolean new_sex = true;
      String new_name = "ShawnYue";
      int new_age_s = 23;
      float new_math_s = 88;
      float new_english_s = 83;
      float new_Height_s = 167;
      float new_Weight_s = 52;
      String strSQL="Insert Into Student (Student_Name,Student_ID,Age,Sex,Math_Scores,English_Scores,Height,Weight) Values (?,?,?,?,?,?,?,?)";

      //利用SQL语句将数据添加到数据库
      //3. 获取预编译语句对象
      PreparedStatement pstmt = null;
      pstmt = conn.prepareStatement(strSQL);
      //4. 给各个占位符赋值
      pstmt.setString(1,new_name);
      pstmt.setInt(2, new_id);
      pstmt.setInt(3, new_age_s);
      pstmt.setBoolean(4, new_sex);
      pstmt.setFloat(5, new_math_s);
      pstmt.setFloat(6, new_english_s);
      pstmt.setFloat(7, new_Height_s);
      pstmt.setFloat(8, new_Weight_s);
      //5.执行sql语句,返回值是影响记录的行数
      int n = pstmt.executeUpdate();
      if(n>0){
        System.out.println("插入记录成功");
      }

      // 完成后关闭
      rs.close();
      stmt.close();
      conn.close();
    }catch(SQLException se){
      // 处理 JDBC 错误
      se.printStackTrace();
    }catch(Exception e){
      // 处理 Class.forName 错误
      e.printStackTrace();
    }finally{
      // 关闭资源
      try{
        if(stmt!=null) stmt.close();
      }catch(SQLException se2){
      }// 什么都不做
      try{
        if(conn!=null) conn.close();
      }catch(SQLException se){
        se.printStackTrace();
      }
    }
    System.out.println("Goodbye!");
  }

}
