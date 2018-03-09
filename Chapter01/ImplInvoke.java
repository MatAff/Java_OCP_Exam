
package Chapter01;

class ImplInvoke {

    public String toString() {
	return "Implicitly invoked!";
    }

    public static void main(String[] args) {

         ImplInvoke i = new ImplInvoke();
         System.out.println(i);

    } 
} 
