package introducao.Operadores;

////OR

public class OperadoresPt4_LogicoOr {
    public static void main(String[] args) {
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000;
        boolean IsPlayStationCincoCompravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupanca >= valorPlayStation;
        System.out.println(IsPlayStationCincoCompravel);
    }
}
