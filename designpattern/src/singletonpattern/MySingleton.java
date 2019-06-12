package singletonpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 21:41
 **/

public class MySingleton {

    /**
     * 延迟加载 在单线程中可以使用
     */
    private static MySingleton mySingleton;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }


}
