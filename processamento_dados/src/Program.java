public class Program {
    
    public static void main(String[] args) {

        /*
         * Calculo de um trapézio.
         * 
         * Base superior + base inferior / 2 * altura.
         */
        
        double b, B, h, area;
        
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.printf("O resultado do cálculo do trapézio e: %.2f metros quadrados.%n", area);
    }
}
