package strategypattern.duck;

/**
 * @author ShawnYue
 * @date 2019-06-11 22:12
 **/

public class FlyWithNoWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly~~~");
    }
}
