import java.util.Scanner;
public class Bodymass {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entert weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();
        Double BMI = weight * 0.45 /  (inches* 0.025 *inches* 0.024); 
        System.out.println("Body mass is " + BMI +  "\n");
        input.close();
    }
}