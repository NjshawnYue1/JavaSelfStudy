package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-12 13:47
 *
 * ����һ��class�߱�private�����ݳ�Ա��private������ ׫дһ���ڲ��ࣨinner class����ʹ�䷽���޸���Χ�ࣨouter
 * class�����ݳ�Ա����������Χ�ࣨouter��class�������� ���ڵڶ�����Χ�ࣨouter class�������в����ڲ��ࣨinner class������
 * �������䷽������˵������Χ�ࣨouter class�������Ӱ�졣
 */
public class OuterDemo2 {

  private int i, j, sum = 0;

//  OuterDemo2(int i, int j) {
//    this.i = i;
//    this.j = j;
//  }

  private void addNum(int i, int j) {
    sum = i + j;
    System.out.println(sum);
  }

  abstract class Inner {

    public abstract void show();

    public abstract void test();


  }

  public void method() {
    Inner inner = new Inner() {
      @Override
      public void show() {
        i = 4;
        j = 5;
        System.out.println(i + "........." + j);
      }

      @Override
      public void test() {
        addNum(3, 4);
      }

    };
    inner.show();
    inner.test();
  }

//  new Inner() {
//
//    public void show() {
//      i = 4;
//      j = 5;
//      System.out.println(i + "........." + j);
//    }
//
//    public void test() {
//      addNum(3, 4);
//    }
//
//    public void test1() {
//      class Inner1 {
//
//        void show() {
//          System.out.println("show run");
//        }
//      }
//      Inner1 in = new Inner1();
//      in.show();//�����ⲿ�෽���е��ڲ������ �����ñ����е�show����
//    }
//  }

  public static void main(String[] args) {
//    OuterDemo2.Inner inner = new OuterDemo2().new Inner();//�����ڲ������
//    inner.test();
//    inner.show();
//    inner.test1();
    /**ʹ���������޸���һ���е��ڲ��ࣨinner class��
     ����Դ���򣬾����������Щ.class�ļ����ֱ��Ӧ����Щ�ࣨ��ӿڣ�
     */
    OuterDemo2 outerDemo2 = new OuterDemo2();
    outerDemo2.method();//�����ڲ���ķ�������

  }
}
