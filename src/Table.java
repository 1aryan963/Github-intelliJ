import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        System.out.println("Multiplication table");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        int i;
        for (i =1;i<=10;i++){
            int m=n*i;
            System.out.println(n+" x "+i +" = "+m);
        }

    }
}
