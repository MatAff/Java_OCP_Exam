package Chapter03;

import java.util.*;

// Define class structure
class A { @Override public String toString() {return "A"; } }
class B extends A { @Override public String toString() {return "B"; } }
class C extends B { @Override public String toString() {return "C"; } }

public class ExpBounds
{
    
   public static void printUnbound(List<?> list) {
       for (Object o : list) {
           System.out.println(o);
       }
   }
   
   public static void printUpper(List<? extends B> list) {
       for (Object o : list) {
           System.out.println(o);
       }
   }
   
    public static void printSuper(List<? super B> list) {
       for (Object o : list) {
           System.out.println(o);
       }
   }
    
   public static void main(String... args) {
   
       // Assign arrays - not smart throws exception
       Integer[] numbers = { new Integer(42) };
       Object[] objects = numbers;  // Does compile
       try {
           objects[0] = "Nope"; // Throws ArrayStroreException
       } catch(Exception e) {
            System.out.println(e);
       }
        
       // Assign ArrayList - smart does not compile
       List<Integer> list = new ArrayList<>();
       list.add(new Integer(42));
       // List<Object> listOb = list; // Does not compile
       
       // Unbound - Can assign to this! And even print it
       List<?> unbound = list;
       printUnbound(unbound);
       
       // Unbound - try number list
       List<Integer> numList = new ArrayList<>();
       numList.add(new Integer(1));
       numList.add(new Integer(2));
       numList.add(new Integer(3));
       unbound = numList;
       printUnbound(unbound);
       
       // Unbound - 42 shows up as unbound and numlist refer to same instance
       numList.add(new Integer(42));
       printUnbound(unbound);

       // Unbound - Cannot add directly to unbound
       // unbound.add(new Integer(42)); Does not compile
       
       // Create list using A, B, and C
       List<A> a = Arrays.asList(new A());
       List<B> b = Arrays.asList(new B());
       List<C> c = Arrays.asList(new C());
       
       // Unbound - Can take any
       printUnbound(a);
       printUnbound(b);
       printUnbound(c);
       
       // Upper - Can take B and extension
       // printUpper(a);
       printUpper(b);
       printUpper(c);
       
       // Super - Can take and super classes 
       // Confusingly Super has a lower bound...
       printSuper(a);
       printSuper(b);
       // printSuper(c);       
       
   }
}
