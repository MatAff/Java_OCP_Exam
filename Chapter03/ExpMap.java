package Chapter03;

import java.util.*;

public class ExpMap
{

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            map.put(i, i * i);
        }
        System.out.println(map.get(4));
    }
}
