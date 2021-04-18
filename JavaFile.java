import java.util.Scanner;
public class JavaFile {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        //taking input
        System.out.print("Enter 1st value: ");
        int firstInt = inp.nextInt();
        System.out.print("Enter 2nd value: ");
        int secondInt = inp.nextInt();
        //print sum,difference,product,average,distance,max,and min value of input
        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
        inp.close();
    }
}
