package introducao.Arrays;

/////Foreach

public class ArraysPt4 {
    public static void main(String[] args) {

        //////3 maneiras de definir Array
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5,6,7};
        int[] numeros3 = new int[]{1,2,3,4,5,6,7,8,9};

       // for ( int i = 0 ; i < numeros3.length ; i++ ){
        //    System.out.println(numeros3[i]);
        //}

        for(int num: numeros3){
            System.out.println(num);
        }

    }
}
