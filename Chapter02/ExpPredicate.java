package Chapter02;

import java.util.function.Predicate;

public class ExpPredicate
{
    static void print(Animal a, Predicate<Animal> trait) {
        if (trait.test(a)) {
            System.out.println(a.name);
        }
    }
    
    public static void main(String... args) {
        
        Animal dog = new Animal("Dog", 4);
        
        print(dog, a -> a.hasFourLegs());
    }
}
