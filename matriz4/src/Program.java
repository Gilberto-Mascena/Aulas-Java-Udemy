public class Program {

    public static void main(String[] args) {
        
        // Matriz bidimencional de Strngs.
        String[][] mat = new String[5][5];

        // Adcionando Strings automaticamente em todas as linha e colunas com for.
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){

                mat[i][j] = "Silva";

                System.out.println(mat[i][j]);
            }
        }
    }    
}
