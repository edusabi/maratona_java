package introducao.Operadores;

////// && (AND)

public class OperadoresPt3_LogicoAnd {
    public static void main(String[] args) {
        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println("isDentroDaLeiMaiorQueTrinta, " + isDentroDaLeiMaiorQueTrinta);

        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta, "  + isDentroDaLeiMenorQueTrinta);

    }
}
