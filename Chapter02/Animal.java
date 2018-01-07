package Chapter02;

public class Animal
{
    protected String name;
    protected int nrLegs;
    
    public Animal(String name, int nrLegs) {
        this.name = name;
        this.nrLegs = nrLegs;
    }    
    
    public boolean hasFourLegs() { return nrLegs==4; }
}
