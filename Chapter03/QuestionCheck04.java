
package Chapter03;

import java.util.*;

class QuestionCheck04 {

    public static void main(String... args) {

        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null)
            System.out.println(greetings.pop());      

    }

}
