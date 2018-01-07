package Chapter01;

public class ExpMemberInnerClass
{
    
    private class Inner {
        public void printSomething() {
            System.out.println("Inner class");
        }
    }
    
    public static void main(String... args) {
        ExpMemberInnerClass myClass = new ExpMemberInnerClass();
        Inner myInner = myClass.new Inner();
        myInner.printSomething();
    }
}
