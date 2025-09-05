import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        System.out.println("Array reverse");
        int[] arr = {1,2,4,6,4,3,7,8,9};
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


    }
}
