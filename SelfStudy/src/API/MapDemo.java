package API;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ShawnYue
 * @date 2018-11-09 14:58
 */
public class MapDemo {

  public static void main(String[] args) {

    Map<Integer,String> map = new HashMap<>();
//    method(map);
    method_2(map);
  }

  public static void method_2(Map<Integer,String> map){
    map.put(3,"aa");
    map.put(5,"bb");
    map.put(8,"cc");
    map.put(6,"dd");

    //取出所有元素 通过keySet()方法获取所有的键的集合 Map没有迭代器 但是set有
    //通过键获取值

    Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

    Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();
    while (iterator.hasNext()){
     Map.Entry<Integer,String> entry = iterator.next();
     Integer integer = entry.getKey();
     String s = entry.getValue();
      System.out.println(integer + s);
    }
//    Set<Integer> keySet = map.keySet();
//    Iterator<Integer> iterator = keySet.iterator();
//
//    while (iterator.hasNext()){
//      Integer key = iterator.next();
//      String value = map.get(key);
//      System.out.println(value);
//    }



  }

  public static void method(Map<Integer,String> map){

    //添加元素
    System.out.println(map.put(8,"aa"));//null
    System.out.println(map.put(8,"bbs"));//aa  返回这个Key之前对应的值

    System.out.println(map);



  }

}
