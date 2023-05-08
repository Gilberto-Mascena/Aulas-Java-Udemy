package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
    
    public static void main(String[] args) {
        
        /*
         * LinkedHashSet, matém a ordem dos elementos.
         */
        Set<String> set = new LinkedHashSet<>();

        set.add("Notebook");
        set.add("Tv");
        set.add("Tablet");

        set.remove("Tablet");        
        set.removeIf(x -> x.charAt(0) == 'T');
        /*
         * Acima, um exemplo de predicado que remove um elemento com base no indice do caracter.
         */
        //set.removeIf(x -> x.length() >= 3);
        /*
         * Acima, um exemplo de predicado que remove um elemento com base no tamanho de caracteres.
         */

        System.out.println(set.contains("Tv"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}