package Chapter01;

public class ExpEquals
{
    private String name = "Lion";
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ExpEquals)) return false;
        ExpEquals otherExpEquals = (ExpEquals) obj;
        return this.name.equals(otherExpEquals.name);
    }
    
    public static void main(String... args) {
        ExpEquals i1 = new ExpEquals();
        ExpEquals i2 = new ExpEquals();
        System.out.println(i1.equals(i2));
    }
}
