package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 21:57
 **/

public class HouseBland extends AbstractBeverage {


    @Override
    public String getDescription() {
        return description = "HouseBland : ";
    }

    @Override
    public double getCost() {
        return 0.83;
    }
}
