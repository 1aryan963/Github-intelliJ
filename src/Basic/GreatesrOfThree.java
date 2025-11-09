package Basic;

import java.util.Scanner;

public class GreatesrOfThree {
    public static void main(String[] args) {
        System.out.println("Greatest number finder");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = input.nextInt();
        System.out.println("Enter Second number");
        int b = input.nextInt();
        System.out.println("Enter Third number");
        int c = input.nextInt();
        System.out.print("Greatest number is ");
        if (a>=b && a>=c){
            System.out.println(a);
        }else if (b>=c && b>=a){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
