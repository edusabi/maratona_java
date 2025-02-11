package introducao.Tipos;

/////casting
//o casting é forçar por exemplo um tipo primitivo Long, caber em um tipo primitivo int
//exemplo abaixo:

public class TiposPrimitivosPart3 {
    public static void main(String[] args){
        int idade = (int) 100000000000L;
        System.out.println(idade);

        long numeroD = (long) 153.23;
        System.out.println(numeroD);

    }
}
