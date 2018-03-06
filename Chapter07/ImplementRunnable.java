package Chapter07;

// Test class to explore Runnable
public class ImplementRunnable implements Runnable
{
    private double[] scores;

    public ImplementRunnable(double[] scores) {
        this.scores = scores;
    }

    public ImplementRunnable() { }
    
    public void run() {
        System.out.println("Did work in ImplementRunnable");
    }
}
