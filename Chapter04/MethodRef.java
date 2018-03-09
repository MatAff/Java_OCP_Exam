
package Chapter04;

import java.util.function.*;

public class MethodRef {

    public static void main(String[] args) {
    
        Consumer<String> prt = System.out::println;
        prt.accept("Hello world!");

    } 

} 
