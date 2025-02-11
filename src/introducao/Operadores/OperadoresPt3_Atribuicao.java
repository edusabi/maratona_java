package introducao.Operadores;

/////Atribuição

public class OperadoresPt3_Atribuicao {
    public static void main(String[] args) {
        /// = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        /// ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);  /////primeiro executa dps incrementa
        System.out.println(++contador2);  /////primeiro incrementa dps executa
        System.out.println(contador2 );


    }
}
