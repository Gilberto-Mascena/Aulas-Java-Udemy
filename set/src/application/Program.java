package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        
        /*
         * HashSet.
         */
        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");
        /*
         * A implementação HashSet é extremamente rápida, porém não garante a ordem dos elementos.
         */

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}