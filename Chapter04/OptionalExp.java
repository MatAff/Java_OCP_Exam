
package Chapter04;

import java.util.*;

public class OptionalExp {

    public static void main(String[] args) {

        // Create optionals
        Optional<Double> o = Optional.empty();
        Optional<Double> p = Optional.of(2.0);

        // Get
        //System.out.println(o.get()); // Throws RunTime error if empty
        System.out.println(p.get());

        // isPresent
        System.out.println(o.isPresent());
        System.out.println(p.isPresent());

        // ifPresent
        o.ifPresent(System.out::println);
        p.ifPresent(System.out::println);

        // Or else throw
        o.orElseThrow(() -> new RuntimeException());
    } 

} 
 
