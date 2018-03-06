// Class to compare availability of push and pop across different classes

package Chapter03;

import java.util.*;

public class PushCompare {

    public static void main(String[] args) {

        // ArrayDeque
        ArrayDeque adq = new ArrayDeque();
        adq.push(1);
        adq.push(1);
        //adq.pop(1); // Does not compile

        // ArrayDeque with generic String
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        System.out.println(greetings.pop());
       
        // ArrayDeque with generic Integer
        ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();
        numbers.push(1);
        numbers.push(1);
        numbers.push(1);
        System.out.println(numbers.pop());

    } 

} 
