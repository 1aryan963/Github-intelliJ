package Basic;

import java.util.Scanner;
//CONCEPT -->  Fist number ka table pdhenge aur check krenge ki wo second number se divide ho rha ya nhi;
public class LCM {
    public static void main(String[] args) {
        System.out.println("Welcome to Basic.LCM");
        System.out.print("Enter a num: ");
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        System.out.print("Enter another num: ");
        int n2=in.nextInt();
        int lcm=lcm(n1,n2);
        System.out.println("Basic.LCM of "+n1+" and "+n2+" is "+lcm);

    }
    public static int lcm(int n1,int n2){
        int i =1;
        while(i<=n2){
            int factor = n1*i;
            if(factor % n2 == 0){
                return factor;
            }
            i++;
        }
    return 0;
    }
}

