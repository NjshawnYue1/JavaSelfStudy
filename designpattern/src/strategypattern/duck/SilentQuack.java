package strategypattern.duck;

/**
 * @author ShawnYue
 * @date 2019-06-11 22:09
 **/

public class SilentQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("silent");
    }
}
