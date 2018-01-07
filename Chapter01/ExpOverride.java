package Chapter01;

class Base {
    public void doSomething() {
        System.out.println("Base class");
    }
}

public class ExpOverride extends Base
{
    
    @Override
    public void doSomething() {
        System.out.println("Override class");
    }    
    
    // @Override // DOES NOT COMPILE
    public void newMethod() {
        System.out.println("Does not override");
    }
    
    public static void main(String... args) {
        Base myInstance = new ExpOverride();
        myInstance.doSomething();
        // myInstance.newMethod(); // DOES NOT COMPILE: Base does not have this method
        
        ExpOverride myExpClass = new ExpOverride();
        myExpClass.newMethod();
    }

}


