package Experiment5;

/**
 * @author ShawnYue
 * @date 2018-11-14 22:05
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortTest {

  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("aa", 45));
    list.add(new Student("bb", 89));
    list.add(new Student("cc", 78));
    list.add(new Student("dd", 90));
    list.add(new Student("ee", 60));
    Collections.sort(list);
    System.out.println(list);
  }

}
