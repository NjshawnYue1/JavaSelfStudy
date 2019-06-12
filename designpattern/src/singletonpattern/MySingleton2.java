package singletonpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 21:44
 **/

public class MySingleton2 {

    /**
     * 在多线程中本来可以使用关键字synchronized来解决但是因为是单例模式
     *
     * 这个类应当只需要加载一次 加上关键字后每次都要判断程序性能降低
     *
     * 所以提前实例化这个变量
     */
    private static MySingleton2 mySingleton2 = new MySingleton2();

    private MySingleton2() {
    }

    public static MySingleton2 getInstance() {
        return mySingleton2;
    }

}
