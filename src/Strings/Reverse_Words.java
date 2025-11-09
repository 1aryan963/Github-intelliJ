package Strings;

import java.util.Scanner;

public class Reverse_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        String rev = "";
        for(int i= s1.length-1;i>=0;i--){
            rev = rev + s1[i] +" ";
        }
        System.out.println(rev);

        // Using StringBuilder
//        StringBuilder sb = new StringBuilder();
//        for(String s = sb)
    }
}
