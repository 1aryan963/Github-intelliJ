import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {

        System.out.println("Welcome to the world of Sum Of Digits");
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int reverse = ReverseDigits(n);
        System.out.println("Reverse of " + n + " is " + reverse);
    }

    public static int ReverseDigits(int n) {
        int newNum = 0;
        while (n > 0) {
            int digit = n % 10;
            newNum = newNum * 10 + digit;
            n/=10;
        }
        return newNum;
    }
}

