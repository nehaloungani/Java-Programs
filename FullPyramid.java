public class FullPyramid {

    public static void main(String[] args) {
        int rows = 5, k = 0;
        // outer loop for row
        for (int i = 1; i <= rows; i++, k = 0) {
        // inner loop for column
        for (int j = 1; j <= rows - i; j++) {
            System.out.print("  ");
        }
        // print full starts 
        while (k != 2 * i - 1) {
            System.out.print("* ");
            ++k;
        }
        //new line
            System.out.println();
        }
    }
  }