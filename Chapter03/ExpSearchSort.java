package Chapter03;

import java.util.*;

public class ExpSearchSort
{
    public static void main(String... args) {
        
        // Array
        int[] numbers = { 4, 3, 2, 1 };
        Arrays.sort(numbers); // Sorting essential before search
        
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 5));
        
        // ArrayList
        List<Integer> list = Arrays.asList(9,4,1,2);
        Collections.sort(list);
        
        System.out.println(Collections.binarySearch(list, 0));
        System.out.println(Collections.binarySearch(list, 2));
    }
}
