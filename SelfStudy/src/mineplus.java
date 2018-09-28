/**
 * Created by Admin on 2017/4/16.
 */
public class mineplus {
    public static void main(String[] args) {
        int i = 10;
        int num = 10 * (i++); //括号并没有导致i的值变成11
        System.out.println(num);
    }
}
