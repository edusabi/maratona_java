package introducao.EstruturaDeRepeticao;

public class EstruturaDeRepeticaoPt3 {
    public static void main(String[] args) {

        //int valorMax = 50;
        //for(int i = 0; i < valorMax ; i++){
            //if(i > 25){
              //  continue;   ///Ignora tudo que tem abaixo
            //}
           // System.out.println(i);
        //}

        double valorCarro = 50000;

        for(int parcela = (int) valorCarro; parcela >= 1 ;parcela--){

            double valorParcela = valorCarro / parcela;

            if(valorParcela < 1000){
                continue;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }

    }
}
