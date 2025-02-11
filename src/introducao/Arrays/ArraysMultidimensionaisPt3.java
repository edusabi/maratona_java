package introducao.Arrays;

public class ArraysMultidimensionaisPt3 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        ///tem como fazer de outro forma do jeito q ta ai em cima, caso queira ver é só substituir no for
        int[][] arrayInt2 = { {0,1}, {0,1,2,}, {0,1,2,3,4} };

        ///pega o primeiro indice do array q é outro array e fala q ele vai ter 2 posições
        arrayInt[0] = new int[2];
        ///pega o segundo indice do array q é outro array e fala q ele vai ter 3 posições
        arrayInt[1] = new int[3];
        ///pega o terceiro indice do array q é outro array e fala q ele vai ter 5 posições
        arrayInt[2] = new int[]{1,2,3,4,5};

        for (int[] arrayBase: arrayInt){
                System.out.println("\n---------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }

    }
}
