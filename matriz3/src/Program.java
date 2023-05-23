public class Program {

    public static void main(String[] args) {
        
        // Matriz bidimencional
        int[][] mat = new int[5][5];

        // Adcionando automaticamente pelo for, o valor 10 na linha 0, nos 4 índces o valor 10.
        for(int i = 0; i < 5; i++){
            mat[0][i] = 10;

            System.out.println(mat[0][i]);
        }
    }    
}
