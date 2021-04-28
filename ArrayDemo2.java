import java.util.Arrays;
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] MyArr = {3, 7, 9};
        String[] fruits = {"Mango", "Apple", "Orange"};
        System.out.println(MyArr[1]);
        System.out.println(fruits[1]);

        int s = MyArr.length;
        System.out.println(s);
        System.out.println(Arrays.toString(MyArr));
        System.out.println(Arrays.toString(fruits));
    }
}
