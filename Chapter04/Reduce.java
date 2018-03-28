
package Chapter04;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,4,5,6);

        // Convert to stream and print
        l.stream().parallel().forEach(System.out::println);
        int val = l.stream().parallel().reduce(0,(i,m) -> i + m, (j,k) -> j + k);
        System.out.println(val);

    } 

} 
