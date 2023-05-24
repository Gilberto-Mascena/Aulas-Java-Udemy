package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import entities.Product;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Set<Product> set = new HashSet<>();

    set.add(new Product("Tv", 9000.0));
    set.add(new Product("Notebook", 1200.0));
    set.add(new Product("Tablet", 400.0));

    Product prod = new Product("Notebook", 1200.0);
    
    /*
     * HashSet compara objetos palo quando o método equals & hashCode está implementado na classe, nesse caso aplicado na classe Product.
     */
    System.out.println(set.contains(prod));

    }    
}
