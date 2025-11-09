package Basic;

import java.util.Scanner;

public class fahToCelcius {
    public static void main(String[] args) {
        System.out.println("Enter temp in Fah");
        Scanner a = new Scanner(System.in);
        float fah = a.nextFloat();
        float celcius = (fah-32)* 5/9;
        System.out.println("temperature in celcius is "+ celcius);
    }
}
