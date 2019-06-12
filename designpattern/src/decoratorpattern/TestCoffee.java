package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 22:09
 **/

public class TestCoffee {

    public static void main(String[] args) {
        AbstractBeverage beverage = new Espresso();

        beverage = new Soy(beverage);

        beverage = new Milk(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());


    }

}
