package introducao.EstruturaCondicionais;

///else

public class EstruturaCondicionaisPt2 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado comprar!");
        }else{
            System.out.println("Não autorizado comprar!");
        };

        ////IF / ELSE / ELSE IF

        int suaIdade = 55;

        if(suaIdade < 15){
            System.out.println("Categoria infantil!");
        }else if(suaIdade >=15 && suaIdade < 18){
            System.out.println("Categoria juvenil!");
        }else{
            System.out.println("Categoria adulto!");
        }


    }
}
