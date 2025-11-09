package Strings;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String rev = "";
//        for( int i = s.length()-1;i>=0;i--){
//            rev = rev+ s.charAt(i);
//        }
//        System.out.println(rev);


        String s1 = "Aryan Prakash";
        String[] word = s1.split(" ");
        String rev = "";
        for(int i=0;i< word.length;i++){
            String[] s2 = new String[]{word[i]};
            for(int j = word[i].length()-1;j>=0;j--){
                rev = rev+word[i].charAt(j);
            }
            rev=rev+" ";
        }
        System.out.println(rev);


    }
}
