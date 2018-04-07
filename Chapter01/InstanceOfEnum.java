
package Chapter01;

public class InstanceOfEnum {

    enum Drinks { TEA, COFFEE }

    public static void main(String[] args) {

        Drinks d = Drinks.TEA;

        System.out.println(d instanceof Enum);

    } 

}

