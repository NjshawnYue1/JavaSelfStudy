package strategypattern.duck;

/**
 * @author ShawnYue
 * @date 2019-06-11 22:20
 **/

public class TestDuck {

    public static void main(String[] args) {
        AbstractDuck duck = new RealDuck();

        duck.setFlyBehavior(new FlyWithWings());
//        duck.setQuackBehavior(new Quack());
        duck.fly();
        duck.quack();
        duck.display();
    }

}
