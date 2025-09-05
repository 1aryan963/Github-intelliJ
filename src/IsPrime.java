import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Welcome to prime checker");
        Scanner a=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=a.nextInt();
        boolean prime=isPrime(num);
        System.out.println("your number is prime: "+prime);
    }
    public static boolean isPrime(int a){
        int i=2;
        while(i<a){
            if(a%i==0){
                return false;
            }
            i++;
        }
    return true;
    }
}
