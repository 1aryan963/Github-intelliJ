package Basic;

import java.util.Scanner;

public class Bitwise_AND {
    public static void main(String[] args) {
        System.out.println("Showcasing Bitwise 'and' operator");
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is: "+ result);
    }
}


// Aise hi bitwise And (&),Or (|),Xor (^),Not (~) k liye v code likha jayega
// bs result me in sbhi ka symbol use hoga
