package Generic;

import Bean.Student;
import Bean.Worker;

/**
 * @author ShawnYue
 * @date 2018-11-29 15:50
 */
public class GenericDefineDemo {

  public static void main(String[] args) {

    Tool<Student> tool = new Tool<>();
    tool.setE(new Student());
    Student student = tool.getE();

//    Tool tool = new Tool();
//
//    tool.setObject(new Worker());
//
//    Student student = (Student)tool.getObject();
  }

}
