package Chapter03;

import java.util.*;

public class ExpArrayVsArrayList
{
   
    
    public static void main(String... args) {
        
        // Array
        int[] numbers = { 1, 2, 3 };
        String[] words = new String[2];
        words[0] = "Hello";
        words[1] = "Word";
        System.out.println(words); // Prints reference to array
        
        // ArrayList
        List<String> text = new ArrayList<>();
        text.add("array");
        text.add("list");
        System.out.println(text.size());
        text.remove(0);
        System.out.println(text.size());
        
        // List of primitives
        // List<int> intList = new ArrayList<>(); // Cannot use primitives
        
        // Contert array to list
        // List<Integer> integerList = new ArrayList();
        // integerList = Arrays.asList(numbers); // Cannot convert int to Integer
        
        // Convert array to list
        List<String> stringList = Arrays.asList(words);
        System.out.println(stringList);
        
        // Create ArrayList of number directly
        List<Integer> integerList = Arrays.asList(1,2,3);
        System.out.println(integerList);
        
        
    }
    
}
