package API;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author ShawnYue
 * @date 2018-10-29 17:27
 */
public class LinkedListDemo {

  public static void main(String[] args) {

    LinkedList<String> linkedList = new LinkedList<>();

    linkedList.addFirst("abc1");
    linkedList.addFirst("abc2");
    linkedList.addFirst("abc3");
    linkedList.addFirst("abc4");

    System.out.println(linkedList.getFirst());
    System.out.println(linkedList.getFirst());

    System.out.println(linkedList.removeFirst());
    System.out.println(linkedList.removeFirst());//移除后长度改变

    System.out.println(linkedList);//[abc2, abc1]

    while (!linkedList.isEmpty()){
      System.out.println(linkedList.removeLast());
    }

//    Iterator iterator = linkedList.iterator();
//    while (iterator.hasNext()){
//      System.out.println(iterator.next());
//    }
  }

}
