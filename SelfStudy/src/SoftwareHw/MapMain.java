package SoftwareHw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author ShawnYue
 * @date 2018-11-12 19:29
 *
 * 新建java项目，名为map。使用提供的MapMain.java的源代码新建或导入MapMain类。建立一个哈希映射（字典），k ey
 * 为每个人的名字，类型为String；value为每个人的喜欢苹果的程度，类型为Integer类型(Integer是int的对象类型，即把整形int 封装成类的形式， 使用new
 * Integer(int)进行封装)。 查找你、Encen老师以及在映射（字典）中不存在的"Tom"同学对苹果的喜欢程度，并打印输出结果；
 */


public class MapMain {

  public static void main(String[] args) {

    HashMap<String, Integer> hashMap = new HashMap<>();
    //数字代表对苹果的喜欢程度  数字越大越喜欢
    hashMap.put("Ga", 3);
    hashMap.put("EnCen", 4);
    hashMap.put("LiXi", 1);
    hashMap.put("Lucy", 2);
    hashMap.put("Lily", 5);
    hashMap.put("HanMeiMei", 6);

    String key = "Ga";
    Integer value;

    if (hashMap.containsKey(key)) {
      value = hashMap.get(key);
      System.out.println("Use key:" + key + " find value:" + value);
    } else {
      System.out.println("Does not contain key:" + key);
    }

    key = "EnCen";

    if (hashMap.containsKey(key)) {
      value = hashMap.get(key);
      System.out.println("Use key:" + key + " find value:" + value);
    } else {
      System.out.println("Does not contain key:" + key);
    }

    key = "Tom";

    if (hashMap.containsKey(key)) {
      value = hashMap.get(key);
      System.out.println("Use key:" + key + " find value:" + value);
    } else {
      System.out.println("Does not contain key:" + key);
    }

    Iterator iterator = hashMap.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
      key = entry.getKey();
      value = entry.getValue();
      System.out.println("Use iterator to get the  entry is Key :" + key + "  Value :" + value);
    }

  }
}

