package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 22:08
 **/

public class Whip extends AbstractCondimentDecorator {

    AbstractBeverage bverage;

    public Whip(AbstractBeverage bverage) {
        this.bverage = bverage;
    }

    @Override
    public String getDescription() {
        return bverage.getDescription() + "Whip";
    }

    @Override
    public double getCost() {
        return 0.13 + bverage.getCost();
    }
}
