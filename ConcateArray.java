import java.util.Arrays;
public class ConcateArray {
    public static void main(String[] args) {
    //declare and initilize two arrays 
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
    //check length of both arrays 
        int a = arr1.length;
        int b = arr2.length;
    // concat both arrays into an other array 
        int[] arr3 = new int[a + b];
    //copy both arrays 
        System.arraycopy(arr1, 0, arr3, 0, a);
        System.arraycopy(arr2, 0, arr3, a, b);
    //print both arrays into new array 
        System.out.println(Arrays.toString(arr3));
    }
}

