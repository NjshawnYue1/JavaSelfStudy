package API;

/**
 * @author ShawnYue
 * @date 2018-10-26 10:42
 */
public class WrapperDemo2 {

  public static void main(String[] args) {
    int num = 4;

    Integer i = 4;//i = new Integer(4) �Զ�װ��

    /*�������Ժ�int һ�� Integer�з�װ�Ķ��󣬵��������װ�Ķ�����ֵ��һ���ֽ�֮����ô��һ�δ���ͬ������ʱ��ֱ�ӹ�������ݶ������¿��ٿռ�*/
    Integer x = 127;
    Integer y = 127; //������һ������ ��ַ��ͬ

    Integer a = 128;
    Integer b = 128;//������ͬ�ĵ�ַ
    System.out.println(x==y);//true
    System.out.println(a==b);//false
  }

}
