package Generic;

import Bean.Person;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author ShawnYue
 * @date 2018-11-29 11:04
 */
public class GenericDemo2 {

  public static void main(String[] args) {

    TreeSet<Person> treeSet = new TreeSet<>();
    treeSet.add(new Person("aa",6));
    treeSet.add(new Person("bb",4));
    treeSet.add(new Person("cc",5));
    treeSet.add(new Person("dd",9));

    Iterator<Person> iterator = treeSet.iterator();
    while (iterator.hasNext()){
      Person person = iterator.next();
      System.out.println(person);
    }


  }

}
