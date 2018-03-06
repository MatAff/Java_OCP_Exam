
package Chapter07;

import java.util.*;
import java.util.concurrent.*;

public class ExServExp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        new ImplementRunnable().run();

        // Create service
        ExecutorService service = Executors.newSingleThreadExecutor();

        // Execute
        service.execute(System.out::println); 
        service.execute(() -> System.out.println("HI")); 
        service.execute(() -> new ImplementRunnable().run()); 
        service.execute(() -> { for(int i = 0; i < 10; i++) { System.out.println(i); }});

        // Submit with Runnable
        System.out.println("Submit with Runnable");
        Future<?> f = service.submit(new ImplementRunnable());
        System.out.println(f);
        System.out.println(f.get());
        System.out.println(f.isDone());

        // Submit with Callable
        System.out.println("Submit with Callable");
        Future<?> f2 = service.submit(new CallableImp());
        System.out.println(f2);
        System.out.println(f2.get());
        System.out.println(f2.isDone());
  
        // Invoke all
        System.out.println("Invoke all task in collection of callables");
        List<? extends Callable<String>> l = new ArrayList<>();
        Callable<String> c = new CallableImp();
        //l.add(c); // Does not compile
        System.out.println("Can't seem to get a list of Callable created");

        // Shutdown
        service.shutdown();
    } 

} 
