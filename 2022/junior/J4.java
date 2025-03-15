import java.util.Scanner;
import static java.lang.System.*;
import java.util.ArrayList;

class Main {

  static String word(int num) {
    String ones[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    String tens[] = {"", "", "Twenty", "Thirty", "Fourthy", "Fifty", "Sixty", "Sevendy", "Eighty", "Ninedy" };

    if (num > 19) {
      return tens[num / 10] + " " + ones[num % 10];
    } else {
      return ones[num];
    }
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(in);
    int v = 0;

    String[] orange = {"", "First", "Second", "Third", "Fourth", "Fifth","Sixth","Seventh","Eighth","Nineth"};
    // {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

    ArrayList<String> same1 = new ArrayList<String>();
    ArrayList<String> same2 = new ArrayList<String>();

    ArrayList<String> diff1 = new ArrayList<String>();
    ArrayList<String> diff2 = new ArrayList<String>();

    ArrayList<String> msgs = new ArrayList<String>();

    int x = Integer.parseInt(inp.nextLine()); // > 0
    for (int i = 0; i < x; i++) {
      String[] xl = inp.nextLine().split(" "); // same group
      same1.add(xl[0]); same2.add(xl[1]);
    }

    int y = Integer.parseInt(inp.nextLine()); // > 0
    for (int i = 0; i < y; i++) {
      String[] yl = inp.nextLine().split(" "); // not same group
      diff1.add(yl[0]); diff2.add(yl[1]);
    }

    int g = Integer.parseInt(inp.nextLine());
    for (int i = 0; i < g; i++) { // grouping
      String[] gl = inp.nextLine().split(" ");
      String name1 = gl[0];
      String name2 = gl[1];
      String name3 = gl[2];

      for (int z = 0; z < same1.size(); z++) {
        // System.out.println(same1.get(z) + " " + same2.get(z)); // debug
        if (same1.size() > 0) {
          if (same1.get(z).equals(name1) || same1.get(z).equals(name2) || same1.get(z).equals(name3)) {
            if (!same2.get(z).equals(name1) && !same2.get(z).equals(name2) && !same2.get(z).equals(name3)) {
              v++;
              msgs.add("The  constraint is that " + same1.get(z) + " and " + same2.get(z)
                  + " must be in the same group. This is violated");
            } else {
              msgs.add("The  constraint is that " + same1.get(z) + " and " + same2.get(z)
                  + " must be in the same group. This is NOT violated");
            }
          }
        }
      }
      // The first constraint is that A and B must be in the same group. This is
      // violated.
      for (int z = 0; z < diff1.size(); z++) {
        if (diff1.size() > 0) {
          if (diff1.get(z).equals(name1) || diff1.get(z).equals(name2) || diff1.get(z).equals(name3)) {
            if (diff2.get(z).equals(name1) || diff2.get(z).equals(name2) || diff2.get(z).equals(name3)) {
              v++;
              msgs.add("The  constraint is that " + diff1.get(z) + " and " + diff2.get(z)
                  + " must NOT be in the same group. This is NOT violated");
            } else {
              msgs.add("The  constraint is that " + diff1.get(z) + " and " + diff2.get(z)
                  + " must NOT be in the same group. This is violated");
            }
          }
        }
      }
    }
    for (int k = 0; k < msgs.size(); k++) {
      String t[] = msgs.get(k).split(" ",2);
      out.println(t[0] + " " + (k < 10 ? orange[k + 1] : word(k)) + t[1]);
      
    }
    out.printf("Out of the %s constraints, %s were violeted\n", word(same1.size() + diff1.size()), word(v));
  }
}
