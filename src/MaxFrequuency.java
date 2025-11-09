import java.util.Scanner;

public class MaxFrequuency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int c=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                c=arr[i];
            }
        }
        System.out.println("Most Frequent element "+c);
        System.out.println("Frequency "+ max);
    }
}
