package strategypattern.duck;

/**
 * @author ShawnYue
 * @date 2019-06-11 22:16
 **/

public class RealDuck extends AbstractDuck {


    @Override
    public void display() {
        System.out.println("this is real duck");
    }

    public RealDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

}
