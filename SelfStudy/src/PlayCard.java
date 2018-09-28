public class PlayCard {

  public static void main(String[] args) {
    String[] myCard = new String[5];
    System.arraycopy(rank, 0, myCard, 0,5);
    shuffle(myCard);
    for (int i=0;i<myCard.length;i++){
      System.out.println(myCard[i]+"");
    }
  }


  static String[] rank = {"2", "3", "4", "5", "6"};

  public static int uniform(int N) {
    return (int) (Math.random() * N);
  }

  public static void exch(String[] a, int i, int j) {
    String t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  public static void shuffle(String[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++) {
      exch(a, i, i + uniform(N - i));
    }
  }
}