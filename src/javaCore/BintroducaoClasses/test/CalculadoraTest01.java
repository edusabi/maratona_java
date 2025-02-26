package javaCore.BintroducaoClasses.test;

import javaCore.BintroducaoClasses.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        //métodosPt1
        Calculadora calc = new Calculadora();

        System.out.println("Soma:");
        calc.somaNumero();

        System.out.println("\nSubtração:");
        calc.subtraiNumero();


        //métodosPt1
        System.out.println("\nMultiplicacao:");
        calc.multiplicaNumero(5,5);


    }

}
