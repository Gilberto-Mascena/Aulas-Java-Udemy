public class Program {

    public static void main(String[] args) {
        
        // Matriz bidimencional.
        int[][] mat = new int[5][5]; 

        // Adcionando elementos na matriz manualmente.
        mat[0][2] = 5;
        mat[2][3] = 10;

        // Somando os elementos da matriz.
        int soma = mat[0][2] + mat[2][3];
        System.out.println("O resultado dos dois elementos da matriz é: " + soma);
    }   
}
