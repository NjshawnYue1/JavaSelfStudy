package API;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ShawnYue
 * @date 2018-10-29 21:28
 */
public class HashSetDemo {

  public static void main(String[] args) {
    HashSet hashSet = new HashSet();

    hashSet.add("zz");
    hashSet.add("aa");
    hashSet.add("bb");//��������ͬ��Ԫ�� �򲻻���ӵ���set��
    hashSet.add("cc");

    Iterator iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
