package introducao.Operadores;

////Relacionais

public class OperadoresPt2 {
    public static void main(String[] args) {
        //operador de resto
        // %
        int resto = 21 % 2;
        System.out.println(resto);

        //operadores lógicos , sempre retornam valores booleanos
        // < >  <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        boolean isDezIgualDez = 10 == 10;
        System.out.println("isDezIgualDez " + isDezIgualDez);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
    }
}
