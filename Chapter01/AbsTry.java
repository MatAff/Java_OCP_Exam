
package Chapter01;

// Try to extend concrete class into abstract class

// Concrete class
class B {
    public void print() {
        System.out.println("Base:print");
    }
}

// Abstract class
public abstract class AbsTry extends B {
    public static void main(String[] args) {
	B obj = new B();
        obj.print();

    }
}
