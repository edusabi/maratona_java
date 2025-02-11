package introducao.EstruturaDeRepeticao;

/////while , do while, for

public class EstruturaDeRepeticaoPt1 {
    public static void main(String[] args) {

        ///WHILE
        int count = 0;
        while(count <= 10){
            System.out.println(count++);
        }

        ///DO WHILE
        do{
            System.out.println("Dentro do < Do while >");
        }while(count < 10);

        ///FOR
        for(int i = 0 ; i<10 ; i++){
            System.out.println("FOR " +i);
        }

    }
}
