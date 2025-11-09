package Basic;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int q=sc.nextInt() ;
            int [] arr= new int[q] ;
            int found=0 ;
            for (int i=0;i< arr.length;i++){
                arr[i]= sc.nextInt();}
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<i-j-1;j++){
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j] ;
                        arr[j]=arr[j+1] ;
                        arr[j+1]=temp ;
                    }
                }
            }
            for (int k=0;k< arr.length;k++){
                if (arr[k]==k){
                    found+=1 ;
                    System.out.println(k);}
            }
            if (found==0){
                System.out.println("False");
            }
        }
}