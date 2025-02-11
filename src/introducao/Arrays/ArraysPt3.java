package introducao.Arrays;

public class ArraysPt3 {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Zoro";
        nomes[3] = "Naruto";
        nomes[4] = "Ichigo";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
