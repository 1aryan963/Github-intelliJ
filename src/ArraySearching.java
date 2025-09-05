import java.util.Enumeration;
import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Searching...");
        int[] arr = {1, 34, 5, 4, 45, 67, 78, 22, 33, 45, 32, 90};
        System.out.println("Enter the number to be searched in the array");
        int n = sc.nextInt();
        boolean isFound = isFound(arr, n);
        if (isFound) {
            System.out.println("Your num was found");
        } else {
            System.out.println("not found");
        }
    }
    public static boolean isFound(int[] arr,int num){
        int i=0;
        while(i<arr.length){
            if(arr[i]==num){
                return true;
            }
            i++;
        }
        return false;
    }

}
