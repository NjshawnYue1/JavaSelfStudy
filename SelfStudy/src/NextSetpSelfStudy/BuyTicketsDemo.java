package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-18 18:41
 *
 * ��Ʊ��
 *
 * �̰߳�ȫ���������ԭ�� ����߳��ڲ���һ���������� �����������ݵ�����ж���
 *
 * ��һ���߳���ִ�в�����ϲ���ݵĶ�����������У� �����̶߳�����������ͻᵼ�°�ȫ����Ĳ���
 *
 * ����ķ�ʽ���ǰѶ��������������ݵ��̴߳����װ���� �����߳���ִ����Щ�����ʱ�� �����̲߳����Բ������� ����Ҫ��ǰ�̰߳���Щ����ִ����Ϻ������̲߳ſ��Բ�������
 * synchronized������ʵ��ͬ��{ ��Ҫͬ���Ĵ���� }
 */
public class BuyTicketsDemo {

  public static void main(String[] args) {
    Tickets t = new Tickets();//����һ���߳��������
    Thread t1 = new Thread(t);//���߳�������󽻸��̶߳���ȥ����
    Thread t2 = new Thread(t);
    Thread t3 = new Thread(t);
    Thread t4 = new Thread(t);

    t1.start();
    t2.start();
    t3.start();
    t4.start();

//    Tickets ticket1 = new Tickets();
//    Tickets ticket2 = new Tickets();
//    Tickets ticket3 = new Tickets();
//    Tickets ticket4 = new Tickets();

//    ticket1.start();
//    ticket2.start();
//    ticket3.start();
//    ticket4.start();

  }

}

class Tickets implements Runnable {//extends Thread {
  private  Object o = new Object();
  private int num = 100;//static��һ����4���߳�ȥ��100��Ʊ�ķ�ʽ�����Ӿ�̬��ÿ���̶߳�����100��Ʊ

  public void run() {
    sale();
  }

  private void sale() {
    while (num > 0) {
      synchronized (o) {//��ĳһ���߳̽���� ���߳̾ͻ����������������ã��������߳��ж�ʱ�������ò����������޷���������Ĳ��� ֪����һ���߳�ִ��������� �����������ñ����¹黹 �����̲߳ſ��Խ��벢�ҶԹ������ݽ��в���
        if (num > 0)
//        try {
//          Thread.sleep(10);
//        } catch (InterruptedException e) {
//          System.out.println();//�������
//        }
//�߳�������ʱ���ܻ����
// ����߳̽����ж���������һ���߳����н���ʹnum--��
// �����߳������Ѿ��жϹ��ˣ�
// ��ʱ�����ִ�е���Ʊ��С��0��
// �������̵߳Ĳ��ȶ���
// �˴�ʹ��try catch����Ϊsleep�����Ǿ�̬�����Կ���ֱ��ʹ�����������Ҹ÷����������ж��쳣��
// ������Ϊ������ʵ����Runnable�ӿڵ������޷������쳣��
// ����������޷�����ֻ��ʹ�ò�׽������֮һ
        {
          System.out.println(Thread.currentThread().getName() + ".....sales......." + num--);
        }
      }
    }
  }
}