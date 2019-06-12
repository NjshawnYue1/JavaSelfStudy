package strategypattern;

/**
 * @author ShawnYue
 * @date 2019-06-09 22:07
 **/

public class Context {

    /**
     * 在策略模式中， 我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。
     *
     *
     *
     * 这个类中需要声明一个借口类型的变量并去调用接口中的方法测试的时候就会根据实例化的子类对象的不同而去调用不同的子类方法
     *
     * 策略对象改变 context 对象的执行算法
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
