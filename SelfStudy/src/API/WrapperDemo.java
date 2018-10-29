package API;

/**
 * @author ShawnYue
 * @date 2018-10-26 10:03
 */
public class WrapperDemo {

  public static void main(String[] args) {
    /*
     * �����������Ͷ����װ��
     * Ϊ�˷������������������ֵ�����װ���˶����ڶ����ж��������Ժ���Ϊ
     * ���������ö������ͳ�Ϊ ������������ ��װ��
     *
     * 8��������������
     * Byte
     * Short
     * Integer int���ͺ�String���͵�֮��Ļ���ת��
     * ������������ת�����ַ������Ժ�""���ӣ�Ҳ����ʹ��String���е�valueOf()����
     *
     * �ַ���װ���ɻ�����������
     * ʹ�ð�װ���е�parseInt() parseDouble()�ȸ�����װ���е�ת������
     * ֻ��Character��û��parse����
     * ����ַ�����Integer�����˶����װ
     * ����ʹ�÷Ǿ�̬����intValue();
     * ��һ��Integer����ת�ɻ�����������ֵ
     *
     * ��ͬ���Ƶ�����
     * toBinaryString();  2
     * toOctalString();   8
     * toHexString();  16
     * toString(int,radix); ת����������Ƶ���
     *
     *
     * ��������װ���ɽ�Ҫת���������ַ������룬Ȼ��������ת���ɶ�Ӧ���Ƶ���
     * parseInt(string,radix);
     * parseInt("110",10);
     *
     * ����1.compareTo(����2); ����ֵ�ϵıȽ� -1 1���رȽϽ������������
     *
     * Long
     * Float
     * Double
     * Character
     * Boolean
     *
     * */
    int num = Integer.parseInt("123");//�ַ���ת����������̬�������������� ���ҿ��Խ����ַ�������
    Integer i = new Integer("123");//�����Integer����Ϳ���ʹ�ö����intValue();����
    Integer integer = new Integer("3");
    Integer integer1 = new Integer(3);
    System.out.println(integer == integer1);//��ַ
    System.out.println(integer.equals(integer1));//��ֵ
    System.out.println(i.intValue());
    System.out.println(num);
    System.out.println(Integer.MAX_VALUE);//2^31 -1
    System.out.println(Integer.toBinaryString(6));

  }

}
