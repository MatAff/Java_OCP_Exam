
package Chapter04;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FlatMap {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);

        Stream.of(l1,l2).flatMap(l -> l.stream()).forEach(System.out::println);

        Stream<Integer> s1 = l1.stream();
        Stream<Integer> s2 = l2.stream();

        Stream.of(s1,s2).flatMap(s -> s).forEach(System.out::println);
    } 

} 
