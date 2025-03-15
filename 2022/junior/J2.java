import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int b = 0;
    for (int i = 0; i < n; i++) {
        int s = in.nextInt();
        int f = in.nextInt();
        int t = (s * 5) - (f * 3);
        if (t > 40) {
          b = b + 1;
        }
    }
    System.out.printf("%d%s\n",b,n==b ? "+" : "");
  }
}
