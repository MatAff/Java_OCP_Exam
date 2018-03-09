
package Chapter04;

import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String []args) {
        Predicate<String> notNull =
            ((Predicate<String>)(arg -> arg == null)).negate(); // #1
        System.out.println(notNull.test(null));

        // Try another
        Predicate<Integer> aboveZero = ((Predicate<Integer>)(i -> i <=0)).negate();
        System.out.println(aboveZero.test(-5));

        // Try another
        Predicate<Integer> belowZero = i -> i < 0; 
        Predicate<Integer> above = belowZero.negate();
        System.out.println(belowZero.test(-2));
        System.out.println(above.test(-2));

        // Assign multiple
        Predicate<Integer> p1 = i -> i > 0, p2 = p1.negate();
        System.out.println(p2.test(5));

    }
}
