import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of Sum Of Digits");
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int sum=SumOfDigits(n);
        System.out.println("Sum of digits is "+sum);
    }
//    public static int SumOfDigits(int n){
//        int b=0;
//        int a;
//        while(n>0){
//            a=n%10;
//            b=b+a;
//            n=n/10;
//        }
//    return b;
//    }
    public static int SumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
