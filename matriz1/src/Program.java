import javax.swing.JApplet;

public class Program {

    public static void main(String[] args) {
        
        
         //  Array(Arranjo), quando é bidimencional ou maior, chamamos de matriz.         
        int [][] mat = new int[5][5];

         /*
          * Para varrer uma matriz bidimencional, pracisamos de dois for aninhados.
          * 1º for que percorre as linhas da matriz.
          * 2º for que percorre as colunas d a matriz.
          */
        for(int i = 0; i < 5; i++){             
            for(int j = 0; j < 5; j++){
                
                // Imprime todas as posições da matriz.
                System.out.println("Posição " + i + "," + j);
            }
        }        
    }    
}