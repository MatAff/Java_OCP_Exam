package Chapter01;

public class ExpHashCode
{
    public int code = 555;
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ExpHashCode)) return false;
        ExpHashCode otherExpHashCode = (ExpHashCode) obj;
        return this.code == otherExpHashCode.code;
    }
    
    @Override
    public int hashCode() {
        return code;
    }
    
    public static void main(String... args) {
        ExpHashCode i1 = new ExpHashCode();
        ExpHashCode i2 = new ExpHashCode();
        System.out.println(i1.equals(i2));
        
        // Print hash codes
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
    }
}
