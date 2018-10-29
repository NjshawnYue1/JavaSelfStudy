package API;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ShawnYue
 * @date 2018-10-27 20:26
 */
public class CollectionDemo {

  public static void main(String[] args) {
    Collection collection = new ArrayList();//���� ArrayList���Ѿ�ʵ�ֵ�����
    show(collection);//[abcd1, abcd2, abcd3]
    Collection c1 = new ArrayList();
    Collection c2 = new ArrayList();
    show(c1, c2);
  }

  public static void show(Collection c1, Collection c2) {
    //��c1���Ԫ��
    c1.add("abcd1");
    c1.add("abcd2");
    c1.add("abcd3");
    c1.add("abcd4");

    //��c2���Ԫ��
    c2.add("abcd2");
    c2.add("abcd6");
    c2.add("abcd7");

    System.out.println("c1:" + c1);
    System.out.println("c2:" + c2);

    //��ʾaddAll
    c1.addAll(c2);//��c2�е�Ԫ����ӵ�c1�� ��������һ������
    c1.removeAll(c2);//�����������е���ͬԪ��ɾ���ӵ����ߵļ�����ɾ��
    //��ʾcontainsAll
    boolean b = c1.containsAll(c2);
    System.out.println(b);
//retainAll
    boolean b1 = c1.retainAll(c2);//�����͵���������ͬ��Ԫ�أ�ɾ����ͬ��Ԫ��
    System.out.println(b1);

    System.out.println(c1);

  }

  public static void show(Collection collection) {
    //1.���Ԫ�� add
    collection.add("abcd1");
    collection.add("abcd2");
    collection.add("abcd3");
    System.out.println(collection);

    //2.ɾ��Ԫ�� ��ı伯�ϵĳ���
    collection.remove("abc2");
    System.out.println(collection);

    //3.��ռ���
//    collection.clear();

    System.out.println(collection.contains("abc3"));

  }

}
