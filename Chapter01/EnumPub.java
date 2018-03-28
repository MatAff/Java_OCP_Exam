
package Chapter01;

public class EnumPub {

        enum Trees { T1, T2 }
        enum Plants { P1("p1"),
                      P2("p2");
        public String text;
        Plants(String s) { text = s; } // Can't be public or protected
        }

    public static void main(String[] args) {

        Trees t = Trees.T1;

        System.out.println(t);
 
        Plants p = Plants.P1;
        System.out.println(p.text);

    } 

}

