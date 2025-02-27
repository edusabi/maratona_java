package javaCore.BintroducaoClasses.test;

import javaCore.BintroducaoClasses.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        //MétodosPt3 - Retorno
    Calculadora calculadora = new Calculadora();

    double result = calculadora.divideNumeros(10,5);
        System.out.println(result);

        //caso eu coloque 0 no 2º numero ele retorna " infinity ", basta modificar na classe principal
        System.out.println(calculadora.divideNumeros(5,0));

        //métodosPt4 - Retorno
        System.out.println("-----------");
        calculadora.imprimeDivisaoDeDoisNumeros(50,0);

    }

}
