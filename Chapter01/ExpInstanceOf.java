package Chapter01;

class Animal2 { }
class Dino extends Animal2 { }
class NonRelated { }
interface MyInterface { }

public class ExpInstanceOf
{
    public static void main(String... args) {
        
        // Create instances
        Dino dino = new Dino();
        Animal2 animal = new Animal2();
        NonRelated nr = new NonRelated();
        
        // Compare related classes
        System.out.println(dino instanceof Animal2);
        System.out.println(animal instanceof Dino);
        
        // Compare classes directly
        // System.out.println(Dino instanceof Animal); // DOES NOT COMPILE
        
        // Compare unrelated classes
        // System.out.println(nr instanceof Animal); // DOES NON COMPILE
        
        // Compare to interface
        System.out.println(animal instanceof MyInterface);
        
        // Compare null in class
        System.out.println(null instanceof Animal2);
    }

}
