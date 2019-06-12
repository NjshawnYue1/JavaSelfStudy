package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 22:06
 **/

public class Soy extends AbstractCondimentDecorator {

    AbstractBeverage bverage;

    public Soy(AbstractBeverage bverage) {
        this.bverage = bverage;

    }

    @Override
    public String getDescription() {
        return bverage.getDescription() + "Soy";
    }

    @Override
    public double getCost() {
        return 0.22 + bverage.getCost();
    }
}
