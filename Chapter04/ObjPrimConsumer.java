

package Chapter04;

import java.util.function.*;
 
public class ObjPrimConsumer {

    public static void main(String[] args) {

        ObjIntConsumer<Integer> doSometh = (I, i) -> System.out.println(I * i);
        doSometh.accept(5, 4); 

    } 

} 
