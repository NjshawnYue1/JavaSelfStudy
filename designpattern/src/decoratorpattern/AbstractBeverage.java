package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 21:52
 **/

public abstract class AbstractBeverage {

    public String description = "not a coffee";

    public String getDescription() {
        return description;
    }

    /**
     * 不同的咖啡拥有不同的价格
     */
    public abstract double getCost();
}
