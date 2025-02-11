package introducao.EstruturaCondicionais;

////IF

public class EstruturaCondicionaisPt1 {
    public static void main(String[] args) {
       int idade = 20;
       if(idade >= 18){
           System.out.println("Autorizado a comprar bebida!");
       };

       int idade2 = 17;
       boolean isAutorizadoComprarBebida = idade2 >= 18;

       if(!isAutorizadoComprarBebida){
           System.out.println("Não autorizado a comprar bebida!");
       };
    }
}
