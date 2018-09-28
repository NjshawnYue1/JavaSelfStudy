public class Main {
    public static void main(String[] args) {
        int i = 3,k = -1;
        double j,sum = 0;
        while(i <= 11) {
            j = (1.0 / i) * k;
            sum += (1 - j);
            i = i + 2;
            k = -k;
        }
            System.out.println(sum);
    }
}
