package introducao.Arrays;

/////Arrays multidimensionais

public class ArraysMultidimensionaisPt1_2 {
    public static void main(String[] args) {

        int[][] dias = new int[3][3];

        /////o array base é o da esquerda, array que possui os numeros é o da direita
        ////posição do array 0 na posição 0
        dias[0][0] = 31;
        ////posição do array 0 na posição 1
        dias[0][1] = 30;
        ////posição do array 0 na posição 2
        dias[0][2] = 29;

        ////posição do  array 1 na posição 0
        dias[1][0] = 28;
        ////posição do  array 1 na posição 1
        dias[1][1] = 27;
        ////posição do array 1 na posição 2
        dias[1][2] = 26;

        ////posição do array 2 na posição 0,1,2 == 0

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + "   ");
            }
        }

        System.out.println("________SEPARANDO OS ARRAYS________");
        System.out.println("__________________");
        /////AULA PARTE 2 USANDO Foreach
        for (int[] arrayBase: dias){
            for (int num: arrayBase){
                System.out.println(num);
            }
        }

    }
}
