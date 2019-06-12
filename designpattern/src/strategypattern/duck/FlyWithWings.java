package strategypattern.duck;

/**
 * @author ShawnYue
 * @date 2019-06-11 22:11
 **/

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("flyWithWings");
    }
}
