import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= in.nextInt();
        int palin=Pdrome(a);
        if (a==palin){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static int Pdrome(int n){
        int newNum = 0;
        while (n > 0) {
            int digit = n % 10;
            newNum = newNum * 10 + digit;
            n/=10;
        }
    return newNum;
    }
}
