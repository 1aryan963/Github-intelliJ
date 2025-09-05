import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter elements "+(i+1)+": ");
            arr[i] = in.nextInt();
        }
//        System.out.print("The array elements are: ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for(int num : arr){
//            System.out.print(num+" ");    //here num represents elements of array
//        }
        System.out.println(Arrays.toString(arr));
    }
}
