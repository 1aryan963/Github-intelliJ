public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,43,30,87,46,76};
        int key=30;
        boolean found = false;
        for (int num : arr){
            if(num==key){
                found=true;
                break;
            }
        }
        System.out.println("Found? "+found);
    }
}
