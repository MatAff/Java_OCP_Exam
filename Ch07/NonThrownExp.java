package Ch07;
public class NonThrownExp {
    public int play(String dogName) throws Exception {
    try {
        throw new RuntimeException(dogName);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }

    public void nonThrown() throws Exception { }

public static final void main(String[] ball) throws RuntimeException, Exception {
   new NonThrownExp().play("Webby");
   new NonThrownExp().play("Georgette");
   }
}
