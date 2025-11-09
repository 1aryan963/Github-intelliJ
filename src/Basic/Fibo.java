package Basic;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Welcomee to fibonacci series");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        while(a+b<=n){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }

    }
}
