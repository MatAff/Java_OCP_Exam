
package Chapter07;

import java.util.concurrent.*;

public class CallableImp implements Callable<String> {


    public String call() { 

        return "String from Callable";

    }


} 
