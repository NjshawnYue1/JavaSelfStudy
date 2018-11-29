package Experiment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * @author ShawnYue
 * @date 2018-11-14 21:23
 *
 * 、修改题1中的Person类实现Comparable接口，
 * 该接口中对id进行排序，创建10个相应的对象，
 * 分别用HashSet、TreeMap类的对象来存储这10个对象，输出存储的这10个对象(排序后)。
 */
public class PersonSortTest {

  //添加加排序
  private static List<Person> addPerson() {
    HashSet<Person> hashSet = new HashSet<>();
    List<Person> list;
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      hashSet.add(new Person((random.nextInt(30)), "name" + i));
    }
    list = new ArrayList<>(hashSet);
    Collections.sort(list);
    return list;
  }

  public static void main(String[] args) {
    List<Person> list = addPerson();
    for (Person person : list) {
      System.out.println(person);
    }
  }

}
