package Arrays.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("mango");
        //Accessing the element
        System.out.println(fruits.get(1));
        //changing the element
        fruits.set(2,"orange");
        //removing the element
        fruits.remove("apple");
        //display all elements
        System.out.println(fruits);
        //size of arraylist
        System.out.println("size: "+fruits.size());
    }
}
