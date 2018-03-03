
package Chapter03;

import java.util.*;

public class StackExp {

    public static void main(String... args) {

        Stack s = new Stack();
 
        // Push
        s.push(0);
        s.push(1);
        s.push(2);

        // Pop
        System.out.println("Pop " + s.pop());
    }

}
