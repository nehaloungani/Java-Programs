    import java.util.Scanner;
    public class Main1
    {
        public static void main(String args[])
        {
            Scanner inp= new Scanner(System.in);
            System.out.println("enter value");
            int userinp = inp.nextInt();
            for(int count =1; count<=10; count++){
                System.out.println(userinp + " * " + count + "= " + userinp*count);
            }
            inp.close();
       }
    } 