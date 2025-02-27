package javaCore.BintroducaoClasses.dominio;

public class Calculadora {
    //métodosPt1
    public void somaNumero(){
        System.out.println(10 + 10);
    }

    public void subtraiNumero(){
        System.out.println(20 - 10);
    }

    ///métodosPt2
    public void multiplicaNumero(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //métodosPt3 - Retorno
    public double divideNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }

        return num1/num2;
    }

    //métodosPt4 - Retorno
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);


    }


}
