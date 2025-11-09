package Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to fibonacci series");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number up to which fibonacci has to be printed");
        int num=in.nextInt();
        System.out.println("Basic.Fibonacci series: ");
        fibonacci(num);
    }
    public static void fibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");

        int first=0,second=1;
        while(first+second<=num){
            int third =first+second;
            System.out.print(third + " ");
            first=second;
            second=third;
        }
    }
}
