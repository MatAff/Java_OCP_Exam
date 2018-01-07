package Chapter02;

public class ExpLambdas
{

    private static void print(Animal a, CheckIt c) {
        if(c.test(a)) {
            System.out.println(a.name + " has four legs");
            System.out.println(c.defaultMethod());
        }
    }
    
    public static void main(String... args) {
        
        // Start
        System.out.println("Start");
        
        // Create dog
        Animal dog = new Animal("Dog", 4);
        
        // Test using lambda
        print(dog, a -> a.hasFourLegs());     
        
        // Test different lambdas
        // print(dog, Animal a -> a.hasFourLegs()); // Does not compile: needs ()
        print(dog, (Animal a) -> a.hasFourLegs());
        print(dog, (a) -> a.hasFourLegs());
        // print(dog, (Animal a) -> { a.hasFourLegs(); }); // Does not compile: needs 'return'
        print(dog, (Animal a) -> { return a.hasFourLegs(); });
        print(dog, somethingTotallyDifferent -> somethingTotallyDifferent.hasFourLegs());
        // print(dog, a -> b.hasFourLegs()); // Does not compile: a and b don't match
    }
}

// Typically you would use an existing interface
@FunctionalInterface
interface CheckIt {
    boolean test(Animal a);
    
    // Default method
    default String defaultMethod() {
        return "CheckIn interface was used";
    }
}