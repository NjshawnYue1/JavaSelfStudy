package API;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShawnYue
 * @date 2018-10-28 11:27
 */
public class ListDemo {

  public static void main(String[] args) {
    List list = new ArrayList();
    function(list);
  }

  private static void function(List list) {
    //���Ԫ��
    list.add("abc1");
    list.add("abc2");
    list.add("abc3");
    System.out.println(list);//[abc1, abc2, abc3]

    //����Ԫ��
//    list.add(1,"abc9");[abc1, abc9, abc2, abc3]
    //ɾ��Ԫ��
//    System.out.println("remove:"+list.remove(2));//remove:abc3 ���ص��Ǳ�ɾ����Ԫ�� Ҳ�ı��˳���
    //�޸�Ԫ��
//    System.out.println("set:"+list.set(1,"abc8"));//���ر��޸ĵ��Ǹ�Ԫ��
    //��ȡԪ��
//    System.out.println("get:"+list.get(0)); ���еĻ�ȡ���������Բ�����������
    //��ȡ���б�
//    System.out.println("sublist:"+list.subList(0,2));//����ͷ��������β
    System.out.println(list);

  }

}
