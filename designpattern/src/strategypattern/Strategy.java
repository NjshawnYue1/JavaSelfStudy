package strategypattern;

public interface Strategy {

    /**
     * 接口中给一个在实现类中覆写的方法
     */
    int doOperation(int num1, int num2);

}
