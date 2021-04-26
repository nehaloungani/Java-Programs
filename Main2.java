import java.util.Scanner;
public class Main2
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input value of Height of Table 1: ");
        int height1 = inp.nextInt();
        System.out.print("Input value of Width of Table 1: ");
        int width1 = inp.nextInt();
        System.out.print("input value of Height of Table 2:");
        int height2 = inp.nextInt();
        System.out.print("Input value of Width of Table 2: ");
        int width2 = inp.nextInt();
        Table tab1 = new Table(width1, height1);
        Table tab2 = new Table(width2, height2);
        // Sum of the Heights and Widths 
        System.out.println("The Sum of Heights of both Tables are: " + (tab1.getHeight() + tab2.getHeight()));
        System.out.println("The Sum of Widths of both Tables are: " + (tab1.getWidth() + tab2.getWidth()));
        inp.close();
    }
}
        // class declaration
class Table{
    int height;
    int width;
        // contructor declaration of class
    public Table(int w, int h){
        width= w;
        height = h;
    }
        // method 1
    int getHeight(){
        return height;
    }
        // method 2
    int getWidth(){
        return width;
    }
}