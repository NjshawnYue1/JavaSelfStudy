package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-13 9:51
 *
 * 进程：正在运行中的程序
 *
 * 线程：进程中负责程序执行的控制单元 又叫做执行路径
 *
 * 一个进程中可以有多个执行路径但至少有一个线程 称为多线程
 *
 * 每个线程也会有自己独立运行的内容 称之为任务
 *
 * JVM中包含了多个线程：主函数运行和回收垃圾对象的动作是两个基本线程
 *
 * 问题：当程序中出现循环运算时 程序可能执行的比较慢 如果两个对象都去调用了那个方法 那么就会导致效率降低 此时就需要让这两个对象同时运行也就是让这两个线程同时运行
 * 那么就需要让这个对象的方法的执行在一个线程当中 就需要用户去创建一个线程 如下面的例子 程序会由于运算-9999到9999而浪费很多时间
 *
 * 如何创建线程？
 *
 * 1.定义一个类继承Tread类并且覆写void run方法
 */
class ThreadDemo2 extends Thread {

  private String name;

  ThreadDemo2(String name) {
    this.name = name;
  }

  public void run() {
    show();
  }

  public void show() {
    for (int x = 0; x < 9; x++) {
//      for (int y = -99999; y < 9999; y++) {//这一步用来区分cpu执行的随机性
//      }
      System.out.println(name + "....." + x + ".....name=" + Thread.currentThread().getName());
    }
  }
}

public class ThreadDemo {

  public static void main(String[] args) {
    /*
     * 创建线程的目的是为了开启一条执行路径去执行指定的代码实现和其他代码同时运行
     * 而运行的指定代码就是这个执行路径的任务
     * 自定义的线程 执行的代码应该在 run()中
     *
     * 不直接创建Thread类对象并直接调用他的run方法是因为该类方法中执行的代码并不一定是本类中需要的
     *
     * 所以需要自己创建一个Thread的子类并且覆写他的run()
     *
     * 覆写完成后直接调用run()是和创建原来类的对象并直接调用方法的效果是相同的
     * 创建了新的线程之后需要使用start()去启动这个线程而这个方法做了两个事情
     * 1.启动该线程2.调用run()
     * */
    ThreadDemo2 thread1 = new ThreadDemo2("a");//线程子类对象 线程中有getName方法可以获取当前线程的名字
    // 而线程的名字在用户创建线程对象的时候，Thread类中有一个空参构造函数里 执行了一句init操作就把这个线程命名了 Thread-0从0开始 用户如果需要自定义名称只需要在子类的构造函数中使用super(name)来自助命名就可以
    ThreadDemo2 thread2 = new ThreadDemo2("b");
//    thread1.show();
//    thread2.show();
//    thread1.run();
//    thread2.run();//此时还是主线程在执行 并没有使用新的线程去调用方法
    thread1.start();
    thread2.start();//以往是在主函数中调用其他函数依次运行之后然后出栈，现在开启了多个线程之后相当于是线程子类对象执行的方法和主函数并列运行并不受主函数出栈干扰
    System.out.println(4 / 0);//ArithmeticException是出现异常的运算条件时抛出的异常，但另外两个线程仍然可以运行 正常时是可以接着运行下面的语句的
    for (int i = 0; i < 9; i++) {
      System.out.println(Thread.currentThread());
    }
  }

}
