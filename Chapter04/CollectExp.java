
package Chapter04;

import java.util.*;
import java.util.stream.*;

public class CollectExp {

  public static void main(String[] args) {

    // Create a stream
    List l = Arrays.asList(0,1,2,3,4);
    Stream s = l.stream();
    System.out.println("Printing reference");
    System.out.println(s);

    // For each
    //s.forEach(System.out::println);
    //s.forEach(System.out::println); // Reusing throws error

    // Collect - to list
    System.out.println("Collect to list");
    Stream<Integer> si = l.stream();
    List<Integer> l3 = si.collect(Collectors.toList());
    System.out.println(l3);

    // Collect - joining String
    System.out.println("Collect joining");
    Stream<Integer> si2 = l.stream();
    Stream<String> ss = si2.map(i -> "" + i);
    System.out.println(ss.collect(Collectors.joining("-")));

    // Collect grouping by
    System.out.println("Grouping by");
    Stream<Integer> si3 = l.stream();
    Map<Boolean, List<Integer>> groups = si3.collect(Collectors.groupingBy(i -> i > 1));
    System.out.println(groups);

    // Partition by
    System.out.println("Partitioning by");
    Stream<Integer> si4 = l.stream();
    Map<Boolean, List<Integer>> groups2 = si4.collect(Collectors.partitioningBy(i -> i > -1));
    System.out.println(groups2);
    

  } 

} 
