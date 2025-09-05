import java.util.Scanner;

public class EvenOddUsingBitwise {
    public static void main(String[] args) {
        System.out.println("Even/Odd finder using bitwise");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if ((num & 1)==1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }
    }
}
