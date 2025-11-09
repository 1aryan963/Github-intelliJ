package Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of factorial");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        long factorial=fact(n);
        System.out.println(factorial);

    }
    public static long fact(int n) {
        int i=1;
        long f =1;
        while(i<=n){
            f=f*i;
            i++;
        }
    return f;
    }
}
