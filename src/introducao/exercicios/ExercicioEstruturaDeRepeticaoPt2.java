package introducao.exercicios;

public class ExercicioEstruturaDeRepeticaoPt2 {
    public static void main(String[] args) {

        double valorCarro = 50000;

        for(int parcela = 1; parcela <= valorCarro ;parcela++){

            double valorParcela = valorCarro / parcela;

            if(valorParcela < 1000){
            break;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }

    }
}
