package Chapter07;

import java.util.concurrent.*;

public class TestRunnable
{
    // Counter variable
    private static int counter = 0;
    private static int notYetCount =0;
    
    public static void main(String... args) throws InterruptedException, ExecutionException {

        // Set scores
        double[] scores = {1.0, 2.0, 3.0};
        
        // Create a new thread using class that implements Runnable and start
        (new Thread(new ImplementRunnable(scores))).start();
        
        // Create a new class that extends Thread
        (new ExtendThread()).start();
        
        // Implement runnable using lambda
        new Thread(() -> System.out.println("Lambda print statement")).start();
        
        // Use counter in lambda
        new Thread(() -> {
            for(int i=0; i < 500; i++) {
                TestRunnable.counter++;
            }
        }).start();
        
        // Checking with and without sleep (uncomment to see without)
        while(TestRunnable.counter<500) {
            TestRunnable.notYetCount++;
	        Thread.sleep(1000); // 1 Second
        }
        System.out.println("Not yet count: " + TestRunnable.notYetCount);
        
        // Executor service
        ExecutorService service = null;
        Future<?> f;
        try {
            service = Executors.newSingleThreadExecutor();
            service.execute(() -> System.out.println("Work done using ExecutorService"));
            
            // Using submit and a Future
            f = service.submit(() -> System.out.println("Submitting and returning a future"));
                        
        } finally {
            if(service != null) service.shutdown();
        }
        
        // Exploring future
        System.out.println(f.get());
        System.out.println(f.isDone());
        System.out.println(f);
        
    }

}
