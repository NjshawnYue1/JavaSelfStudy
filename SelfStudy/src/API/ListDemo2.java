package API;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ShawnYue
 * @date 2018-10-28 11:39
 */
public class ListDemo2 {

  public static void main(String[] args) {
    List list = new ArrayList();
//    method(list);
    list.add("abc1");
    list.add("abc2");
    list.add("abc3");

//    Iterator iterator = list.iterator();
//    while (iterator.hasNext()) {
//      Object o = iterator.next();//java.util.ConcurrentModificationException
//      // �����޸��쳣 ��Ϊ��ʹ�õ��������е�����ʱ��������listȥ����
//      //����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator����� �ڵ����ж�Ԫ�ؽ��в���
//      if (o == "abc2") {
//        list.add("abc5");
//      } else {
//        System.out.println(list);
//      }
//    }
    //ʹ���б������ ����ʵ�ֵ��������ж�Ԫ�ص���ɾ�Ĳ�
    //ֻ��List���������������
    ListIterator listIterator = list.listIterator();
    while (listIterator.hasNext()){
      Object o = listIterator.next();
      if(o.equals("abc2")){
        listIterator.add("abc6");
      }else {
        System.out.println(list);
      }
    }

  }

  private static void method(List list) {
    list.add("abc1");
    list.add("abc2");
    list.add("abc3");

    //��Ϊ���±����Կ�������ȡ��
    for (int i = 0; i < list.size(); i++) {
      System.out.println("get:" + list.get(i));
    }

  }


}
