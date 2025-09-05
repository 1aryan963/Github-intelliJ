import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Welcome to GCD calculator");
        Scanner a=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int first=a.nextInt();
        System.out.print("Enter a num: ");
        int second = a.nextInt();
        int gcd=gcd(first,second);
        System.out.println("GCD of "+first+" and "+second+" is "+gcd);
    }
    public static int least(int n1,int n2){
        if(n1>n2){
            return n2;
        }
        else{
            return n1;
        }
    }
    public static int gcd(int a,int b){
        int gcd =1;
        int i=1;
        int least=least(a,b);
        while(i<=least){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            i++;
        }
    return gcd;
    }
}

