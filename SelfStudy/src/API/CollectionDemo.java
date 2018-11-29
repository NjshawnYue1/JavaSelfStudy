package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author ShawnYue
 * @date 2018-10-27 20:26
 */
public class CollectionDemo {

  public static void main(String[] args) {
//    Collection<String> collection = new ArrayList<>();//容器 ArrayList是已经实现的子类
//    show(collection);//[abcd1, abcd2, abcd3]
//    Collection<String> c1 = new ArrayList<>();
//    Collection<String> c2 = new ArrayList<>();
//    show(c1, c2);

    SortedSet<Integer> sortedSet = new TreeSet<>();
    sortedSet.add(3);
    sortedSet.add(4);
    sortedSet.add(5);
    sortedSet.add(6);
    sortedSet.add(7);
    sortedSet.add(8);
    sortedSet.add(9);

    Iterator<Integer> integerIterator = sortedSet.iterator();
    while (integerIterator.hasNext()){
      System.out.print(integerIterator.next()+" ");
    }
    System.out.println(sortedSet.first());
    System.out.println(sortedSet.last());
    System.out.println(((TreeSet<Integer>) sortedSet).pollFirst());
  }

  public static void show(Collection<String> c1, Collection<String> c2) {
    //给c1添加元素
    c1.add("abcd1");
    c1.add("abcd2");
    c1.add("abcd3");
    c1.add("abcd4");

    //给c2添加元素
    c2.add("abcd2");
    c2.add("abcd6");
    c2.add("abcd7");

    System.out.println(Arrays.toString(c1.toArray()));//要把集合中的元素以字符串的形式输出则应该先把他转换成数组的形式然后使用Array中的静态方法toString把他转成字符串

    System.out.println("c1:" + c1);
    System.out.println("c2:" + c2);
    //c1:[abcd1, abcd2, abcd3, abcd4]  c2:[abcd2, abcd6, abcd7]

    //演示addAll
    c1.addAll(c2);//将c2中的元素添加到c1中 参数是另一个集合 [abcd1, abcd2, abcd3, abcd4, abcd2, abcd6, abcd7]
    c1.removeAll(c2);//将两个集合中的相同元素删除从调用者的集合中删除  [abcd1, abcd3, abcd4]
    //演示containsAll
    System.out.println(c1);
    boolean b = c1.containsAll(c2);
    System.out.println(b);
//retainAll
    boolean b1 = c1.retainAll(c2);//保留和调用者中相同的元素，删除不同的元素
    System.out.println(b1);

    System.out.println(c1);

  }

  public static void show(Collection<String> collection) {
    //1.添加元素 add
    collection.add("abcd1");
    collection.add("abcd2");
    collection.add("abcd3");
    System.out.println(collection);

    //2.删除元素 会改变集合的长度
    collection.remove("abcd2");
    System.out.println(collection);

    //3.清空集合
//    collection.clear();

    System.out.println(collection.contains("abcd3"));

  }

}
