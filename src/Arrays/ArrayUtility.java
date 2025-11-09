package Arrays;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        System.out.print("Array input");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num = new int[size];
        int i=0;
        while(i<size){
            System.out.println("Enter elements");
            num[i]=in.nextInt();
            i++;
        }
        return num;
    }
}
