package Experiment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

/**
 * @author ShawnYue
 * @date 2018-11-09 13:27
 */
/*
 * 利用实验二中的Person类，创建10个相应的对象，
 * 分别选用Vector、LinkedList、ArrayList、HashSet、HashMap、TreeMap类的对象来存储这10个对象，
 * 检索其中的某2个对象，遍历输出所有对象。
 */
public class DataStrucDemo {

  private static Person person1 = new Person(20, "name1");
  private static Person person2 = new Person(21, "name2");
  private static Person person3 = new Person(22, "name3");
  private static Person person4 = new Person(23, "name4");
  private static Person person5 = new Person(24, "name5");
  private static Person person6 = new Person(25, "name6");
  private static Person person7 = new Person(26, "name7");
  private static Person person8 = new Person(27, "name8");
  private static Person person9 = new Person(28, "name9");

  public static void main(String[] args) {
    testArrayList();
    testHashSet();
    testLinkedList();
    testVector();
    testHashMap();
    testTreeMap();

  }

  private static void testVector() {
    Vector<Person> vector = new Vector<>();

    vector.add(person1);
    vector.add(person2);
    vector.add(person3);
    vector.add(person4);
    vector.add(person5);

    System.out.println("person2的下标是: " + vector.indexOf(person2));
    System.out.println("person3的年龄是: " + vector.get(2).getId());

    //遍历
    for (Person p : vector) {
      System.out.println("姓名是: " + p.getName() + "年龄是: " + p.getId());
    }
    System.out.println();
  }

  private static void testLinkedList() {
    LinkedList<Person> linkedList = new LinkedList<>();

    linkedList.add(person1);
    linkedList.add(person2);
    linkedList.add(person3);
    linkedList.add(person4);
    linkedList.add(person5);

    System.out.println("Person3的下标是" + linkedList.indexOf(person3));
    System.out.println("第五个人的姓名是：  " + linkedList.get(4).getName());

    //遍历
    for (Person p : linkedList) {
      System.out.println("姓名是: " + p.getName() + "年龄是: " + p.getId());
    }
    System.out.println();
  }

  private static void testArrayList() {
    ArrayList<Person> arrayList = new ArrayList<>();

    arrayList.add(person1);
    arrayList.add(person2);
    arrayList.add(person3);
    arrayList.add(person4);
    arrayList.add(person5);
    arrayList.add(person7);
    arrayList.add(person8);

    System.out.println("Person1的下标是" + arrayList.indexOf(person1));
    System.out.println(arrayList.get(5).getName());
//遍历
    for (Person p : arrayList) {
      System.out.println("姓名是: " + p.getName() + "年龄是: " + p.getId());
    }
    System.out.println();
  }

  private static void testHashSet() {
    HashSet<Person> hashSet = new HashSet<>();

    hashSet.add(person1);
    hashSet.add(person2);
    hashSet.add(person3);
    hashSet.add(person4);
    hashSet.add(person5);
    hashSet.add(person9);
    hashSet.add(person6);

    System.out.println("该集合是否包含person6" + hashSet.contains(person6));
    System.out.println("该集合是否包含person3" + hashSet.contains(person3));
//遍历
    for (Person p : hashSet) {
      System.out.println("姓名是: " + p.getName() + "年龄是: " + p.getId());
    }
    System.out.println();

  }

  private static void testHashMap() {
    HashMap<Integer, Person> hashMap = new HashMap<>();

    hashMap.put(1, person1);
    hashMap.put(2, person2);
    hashMap.put(3, person3);
    hashMap.put(4, person4);
    hashMap.put(5, person5);
    hashMap.put(6, person6);
    hashMap.put(7, person7);
    hashMap.put(8, person8);
    hashMap.put(9, person9);

    System.out.println("Person3的年龄是" + hashMap.get(4).getId());
    System.out.println("Person7的姓名是" + hashMap.get(7).getName());

    Set<Integer> keySet = hashMap.keySet();
    //遍历
    for (Integer key : keySet) {
      System.out
          .println("姓名是: " + hashMap.get(key).getName() + "  年龄是: " + hashMap.get(key).getId());
    }

  }

  private static void testTreeMap() {
    TreeMap<Integer, Person> treeMap = new TreeMap<>();

    treeMap.put(1, person1);
    treeMap.put(2, person2);
    treeMap.put(3, person3);
    treeMap.put(4, person4);
    treeMap.put(5, person5);
    treeMap.put(6, person6);
    treeMap.put(7, person7);
    treeMap.put(8, person8);
    treeMap.put(9, person9);

    System.out.println("Person5的年龄是" + treeMap.get(5).getId());
    System.out.println("Person2的姓名是" + treeMap.get(2).getName());

    Set<Integer> keySet = treeMap.keySet();
    //遍历
    for (Integer key : keySet) {
      System.out
          .println("姓名是: " + treeMap.get(key).getName() + "  年龄是: " + treeMap.get(key).getId());
    }

  }

}
