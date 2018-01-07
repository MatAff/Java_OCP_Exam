package Chapter01;

// Simple enum
enum Animal { ANT, BEAR, CAT } // ; Optional

// Complex enum using constructor
enum ComplexAnimal {
    ANT("Small"), BEAR("Big");
    private String value;
    private ComplexAnimal(String inValue) {
        value = inValue;
    }
    public void printValue() {
        System.out.println(value);
    }
}

// Complex enum using methods
enum MethodAnimal {
    ANT {
        public void printSize() { System.out.println("Tiny"); }
        public void printSound() { System.out.println("Lalala"); }
    }, 
    BEAR {
        public void printSize() { System.out.println("Big"); }
    }, 
    CAT;
    public void printSize() { System.out.println("Cat size"); }
    public void printSound() { System.out.println("Generic sound"); }
}

public class ExpEnum
{

    public static void main(String... args) {
        Animal myAnimal = Animal.CAT;

        // Print reference 
        System.out.println(Animal.values());
        
        // Print values
        for(Animal a : Animal.values()) {
            System.out.println(a.name() + " " + a.ordinal());
        }
        
        // Comparison to int
        // System.out.println(myAnimal == 2); // DOES NOT COMPILE: No comparison to integer
        
        // Complex enum using constructor
        ComplexAnimal complexAnimal = ComplexAnimal.ANT;
        complexAnimal.printValue();
        
        // Complex enum using methods
        MethodAnimal ant = MethodAnimal.ANT;
        MethodAnimal cat = MethodAnimal.CAT;
        ant.printSize();
        ant.printSound();
        cat.printSize();
        cat.printSound(); 
        
    }

}
