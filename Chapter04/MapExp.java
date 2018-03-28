
package Chapter04;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MapExp {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(1,2,3);
        Stream<Integer> s2 = Stream.of(1,2,3);

        Function<Integer,Integer> f = i -> i;
        UnaryOperator<Integer> u = j -> j;

        s1.map(f).forEach(System.out::println);
        s2.map(u).forEach(System.out::println);
        
    } 

}

