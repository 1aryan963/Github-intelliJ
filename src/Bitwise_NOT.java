import java.util.Scanner;

public class Bitwise_NOT {
    public static void main(String[] args) {
        System.out.println("Showcasing compliment ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("Compliment is "+result );
    }
}
