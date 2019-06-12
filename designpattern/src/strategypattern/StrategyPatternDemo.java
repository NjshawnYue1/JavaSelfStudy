package strategypattern;

/**
 * @author ShawnYue
 * @date 2019-06-09 22:07
 **/





public class StrategyPatternDemo {
    /**
     * 在策略模式（Strategy Pattern）中，
     *
     * 一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
     *
     * 利用多态的动态绑定
     */
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
