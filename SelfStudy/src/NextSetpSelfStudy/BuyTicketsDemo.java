package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-18 18:41
 *
 * 卖票：
 *
 * 线程安全问题产生的原因： 多个线程在操作一个共享数据 操作共享数据的语句有多条
 *
 * 当一个线程在执行操作恭喜数据的多条代码过程中， 其他线程都参与了运算就会导致安全问题的产生
 *
 * 避免的方式就是把多条操作共享数据的线程代码封装起来 当有线程在执行这些代码的时候 其他线程不可以参与运算 必须要当前线程把这些操作执行完毕后其他线程才可以参与运算
 * synchronized（对象）实现同步{ 需要同步的代码块 }
 */
public class BuyTicketsDemo {

  public static void main(String[] args) {
    Tickets t = new Tickets();//创建一个线程任务对象
    Thread t1 = new Thread(t);//把线程任务对象交给线程对象去处理
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
  private int num = 100;//static是一种让4个线程去卖100张票的方式，不加静态则每个线程都会卖100张票

  public void run() {
    sale();
  }

  private void sale() {
    while (num > 0) {
      synchronized (o) {//当某一个线程进入后 该线程就会拿走这个对象的引用，当其他线程判断时由于引用不存在所以无法进入下面的操作 知道上一个线程执行完操作后 这个对象的引用被重新归还 其他线程才可以进入并且对共享数据进行操作
        if (num > 0)
//        try {
//          Thread.sleep(10);
//        } catch (InterruptedException e) {
//          System.out.println();//具体操作
//        }
//线程在运行时可能会出现
// 多个线程进入判断条件单当一个线程运行结束使num--后，
// 其他线程由于已经判断过了，
// 此时会接着执行导致票数小于0，
// 这属于线程的不稳定性
// 此处使用try catch是因为sleep方法是静态的所以可以直接使用类名调用且该方法声明了中断异常，
// 但又因为本类是实现了Runnable接口的所以无法声明异常，
// 这就是属于无法声明只能使用捕捉的情形之一
        {
          System.out.println(Thread.currentThread().getName() + ".....sales......." + num--);
        }
      }
    }
  }
}