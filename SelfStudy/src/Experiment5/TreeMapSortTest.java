package Experiment5;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author ShawnYue
 * @date 2018-11-14 21:49
 *
 * 、修改题1中的Person类实现Comparable接口， 该接口中对id进行排序，创建10个相应的对象， 分别用HashSet、TreeMap类的对象来存储这10个对象，输出存储的这10个对象(排序后)。
 */
public class TreeMapSortTest {

  public static TreeMap<Integer, Person> addPerson() {

    TreeMap<Integer, Person> treeMap = new TreeMap<>();
    Random random = new Random();
    //随机生成ID 顺序生成姓名 容易查看排序之后的结果
    for (int i = 0; i < 10; i++) {
      int id = random.nextInt(30);
      treeMap.put(i, new Person(id, "Ga" + i));
    }
    TreeMap<Integer, Person> treeMap2 = new TreeMap<>(new TreeSortMap(treeMap));
    treeMap2.putAll(treeMap);
    return treeMap2;

  }

  public static void main(String[] args) {
    TreeMap<Integer, Person> treeMap = addPerson();
    Set<Integer> set = treeMap.keySet();
    for (Integer key : set) {
      System.out.println(treeMap.get(key));
    }
  }

}
