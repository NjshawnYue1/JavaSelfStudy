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

    //ʹ����collection�е�iterator()
    // ���ü����еĵ�����������Ϊ�˻�ü����еĵ��������� ��һ���ӿ�

    Iterator iterator = collection.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }


  }

}
