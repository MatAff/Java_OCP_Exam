package Chapter03;

import java.util.*;

public class ExpCollections
{
        public static void main(String... args) {
        System.out.println("This class explores the various Collections available in java");
        
        // Lists
        System.out.println("LISTS");
        System.out.println("Duplicates are fine; Has index (and order); Can add/remove in any order");
        System.out.println("ArrayList, LinkedList, Stack, Vector");
        System.out.println("");
        
        // ArrayList
        System.out.println("ArrayList");
        List<String> arrayList = new ArrayList();
        System.out.println("Essentially resizable array");
        System.out.println("");
        
        // LinkedList
        System.out.println("LinkedList");
        System.out.println("Implements both List and Queque");
        System.out.println("Can add/remove from beginning/end in constant time");
        System.out.println("");
        
        // Vector
        System.out.println("Vector");
        System.out.println("Used to be only choice, slower than ArrayList");
        System.out.println("");
        
        // Stack
        System.out.println("Stack");
        System.out.println("Adds and takes from the top");
        System.out.println("Old, slow, extends Vector");
        
        // Examples
        List<String> list = new ArrayList<>();
        
        // Add - returns boolean
        System.out.println(list.add("Hello"));
        System.out.println(list.add("world"));
        System.out.println(list);
        
        // Remove - returns boolean
        System.out.println(list.remove("Hello"));
        System.out.println(list);
        
        // isEmpty/size
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        
        // Clear
        // System.out.print(list.clear()); // Does not compile - void return type
        list.clear();
        System.out.println(list);
    
        // contains
        System.out.println(list.contains("Hello"));
        
        // Access element
        try {
            System.out.println(list.get(0)); // Throws IndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e);
        }
        list.add("Some element");
        System.out.println(list.get(0)); // No exception when element available
        
        // Add with index (overloaded method) - Remember index goes first!
        list.add(0, "First element");
        System.out.println(list);
        
        // Add identical elements
        list.add("A");
        list.add("A");
        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));
        
        // Remove by index
        System.out.println("Remove by index");
        System.out.println(list.remove(2));
        System.out.println(list);
        
        // Set
        System.out.println(list.set(2,"B")); // Returns original element
        System.out.println(list);
        
        System.out.println();

        // SET
        System.out.println("SET");
        System.out.println("The main thing to remember out sets is: No duplicate entries");
        System.out.println("HasSet, TreeSet");
        System.out.println("HashSet is not ordered, TreeSet is ordered");
        System.out.println("TreeSet also has the following methods: lower, floor, ceiling, higher");
        System.out.println("Because it implements the NavigableSet interface");
         
        // HashSet
        Set<Integer> set = new HashSet<>();
        set.add(66);
        set.add(10);
        set.add(66);
        set.add(8);
        for (Integer i : set) {
            System.out.println(i + " ");
        }
        
        // TreeSet
        set = new TreeSet<>();
        set.add(66);
        set.add(10);
        set.add(66);
        set.add(8);
        for (Integer i : set) {
            System.out.println(i + " ");
        }
        
        Set<String> wordSet = new TreeSet<>();
        wordSet.add("Hi");
        
        System.out.println();
        
        // Queque
        System.out.println("QUEUE");
        System.out.println("Focusses on order");
        System.out.println("LinkedList - ArrayDeque");
        System.out.println("Assume FIFO: First in > First out");
        System.out.println("Another option LIFO: Last in > first out");
        System.out.println("LinkedList is also a queue, with the special feature that elements can be added both at start and end");
        
        
    }
}
