import java.util.Scanner;
import static java.lang.System.*;

class Main {

  //scan for big square
  public static int getBigSquare(int[][] g, int y, int x, int range) {
    for (int down = y; down < y + range; down++) {
      for (int right = x; right < x + range ; right++) {
        if (right < g.length && down < g.length) {
          if (g[down][right] == 1) {
            return range - 1;
          }
        } else {
          return range - 1;
        }
      }
    }
    return getBigSquare(g,y,x,range + 1);
  }
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(in);

    int n = Integer.parseInt(inp.nextLine()); // size of
    int biggest = 0;
    int t = Integer.parseInt(inp.nextLine()); // # of trees
    int[][] g = new int[n][n];

    for (int i = 0; i < t; i++) { // create grid
      String[] line = inp.nextLine().split("\\s");
      int y = Integer.parseInt(line[0]) - 1;
      int x = Integer.parseInt(line[1]) - 1;
      g[y][x] = 1;
    }
    
    for (int y = 0; y < n; y++) { // check for best spot
      for (int x = 0; x < n; x++) {
          if (g[y][x] != 1) {
            int biggestinunit = getBigSquare(g,y,x,0);
            if (biggestinunit > biggest) {
            biggest = biggestinunit;
          }
        }  
      }
    }
    out.printf("%d", biggest);
  }
}
