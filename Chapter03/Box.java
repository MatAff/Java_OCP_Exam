package Chapter03;

public class Box<T> // <T> required to make T available, can be any symbol
{
   private T contents;
   public T getContents() {
       return contents;
   }
   public void setContents(T contents) {
       this.contents = contents;
   }
}

