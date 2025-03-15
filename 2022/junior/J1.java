import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int rbs = 8;
    int sbs = 3;
    int st = 28;
    
    int lo;
    
    int r = input.nextInt();
    int s = input.nextInt();

    lo = (rbs * r) + (sbs * s) - st;

    System.out.print(lo);
  }
}
