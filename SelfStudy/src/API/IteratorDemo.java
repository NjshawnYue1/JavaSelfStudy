package API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ShawnYue
 * @date 2018-10-27 22:03
 */
public class IteratorDemo {

  public static void main(String[] args) {
    Collection collection = new ArrayList();

    collection.add("abcd1");
    collection.add("abcd2");
    collection.add("abcd3");
    collection.add("abcd4");

    //使用了collection中的iterator()
    // 调用集合中的迭代器方法是为了获得集合中的迭代器对象 是一个接口

    Iterator iterator = collection.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }


  }

}
