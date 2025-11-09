package Basic;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sumTwoNum();

    }

    public static void sumTwoNum(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a num");
        int a = input.nextInt();
        System.out.print("Enter a num");
        int b= input.nextInt();
        int sum=a+b;
        System.out.println(sum);

    }
}
