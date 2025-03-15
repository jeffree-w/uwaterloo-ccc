import java.util.Scanner;
import static java.lang.System.*;

class Main {
  static boolean canStringToNumber(String in) {
    try {
      Integer.parseInt(in);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
    String nextLine = console.nextLine();
    String construct = "";
    String lastCharacter = "";

    int length = nextLine.length();
    
    for (int interval = 0; interval < length; interval++) {
      String currentCharacter = String.valueOf(nextLine.charAt(interval));
      if (canStringToNumber(lastCharacter) && !canStringToNumber(currentCharacter)) {
        out.printf("%s \n",construct);
        construct = "";
      }
      switch (currentCharacter) {
        case "+":
          construct += " Tighten";
          break;
        case "-":
          construct += " Loosen";
          break;
        default:
          if (canStringToNumber(currentCharacter)) {
            construct += currentCharacter;
          } else {
            construct += currentCharacter;
          }
          break;
      }
      lastCharacter = currentCharacter;
    }
    out.printf("%s \n",construct);
    in.close();
  }
}
