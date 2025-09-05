import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to odd sum");
        System.out.println("Enter a num");
        int a =input.nextInt();
        int sum=OddSum(a);
        System.out.println("OddSum till "+a+" is "+sum);
    }
    public static int OddSum(int a){
        int i=1;
        int sum=0;
        while(i<=a){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
