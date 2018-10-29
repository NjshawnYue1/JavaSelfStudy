package API;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ShawnYue
 * @date 2018-10-29 21:39
 *
 *
 * 向集合中存储Person对象 如果姓名和年龄相同视为同一个元素
 */
public class HashSetTest {

  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    /*
     * 数据结构是哈希表 存储元素的时候使用的是元素的hashCode方法来确定位置，如果位置相同再通过元素的equals()来确定是否相同
     * */

    hashSet.add(new Person("lisi4", 24));
    hashSet.add(new Person("lisi7", 27));
    hashSet.add(new Person("lisi1", 21));
    hashSet.add(new Person("lisi9", 29));
    hashSet.add(new Person("lisi7", 27));//这个元素会被存到hashSet中因为他们的equals方法判断的是地址是否相同而此时创建了两个对象他们的地址是不同的

    Iterator iterator = hashSet.iterator();

    while (iterator.hasNext()) {
      Person person = (Person) iterator.next();
      System.out.println(person.getName() + "....." + person.getAge());
    }
  }

}
