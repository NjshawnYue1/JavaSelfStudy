package strategypattern.duck;

/**
 * @author ShawnYue
 * @date 2019-06-11 22:10
 **/

public class OtherQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("zhizhi");
    }
}
