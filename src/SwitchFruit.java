import java.util.Scanner;

public class SwitchFruit {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String Fruit = sc.next();
        switch (Fruit) {
            case "Apple" -> System.out.println("Red in colour");
            case "Mango" -> System.out.println("King");
            case "Orange" -> System.out.println("Round in shape");
            default -> System.out.println("Enter valid fruit");
        }
//        switch (Fruit){
//            case "Apple":
//                System.out.println("Red in colour");
//                break;
//            case "Mango":
//                System.out.println("King");
//                break;
//            case "Orange":
//                System.out.println("Round in shape");
//                break;
//            default:
//                System.out.println("Enter valid fruit");
//        }
    }
}
