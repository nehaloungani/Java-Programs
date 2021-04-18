import java.util.Scanner;
public class Digits {
 public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  int N= inp.nextInt();
  int sum =0;
  while(N!=0)
  {
      sum = sum + (N % 10);
      N =N / 10;
  }
  inp.close();   
 }   
}