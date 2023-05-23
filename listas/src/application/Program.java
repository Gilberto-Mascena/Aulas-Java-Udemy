package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Mouse");
        list.add("Teclado");
        list.add("Memória");
        list.add("Nvme");
        list.add("Notebook");
        list.add("Cooler");
        list.add("CPU");

        //list.remove(1);

        //System.out.println(list);

        /*
         * predicado.
         */
        list.removeIf(x -> x.length() < 4);
        
        for (String h : list) {
            System.out.println(h);
        }
    }
}
