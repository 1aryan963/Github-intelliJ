public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,43,30,87,46,76};
        int target=39;
        for(int element:arr){
            if(element==target){
                System.out.println("found");
            }
            else {
                System.out.println("not found");
                break;
            }
        }
    }
}
