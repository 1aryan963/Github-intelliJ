package Strings;

import java.util.Scanner;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine().toLowerCase();
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != ' '){
                freq[c]++;
            }
        }
        System.out.println("character frequency");
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char) i  + "=" + freq[i]);
            }
        }
    }
}
// logic acche se samajh nhi aaya hai av (08/11/20025)