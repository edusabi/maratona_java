package javaCore.AintroducaoClasses.test;

import javaCore.AintroducaoClasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();

        estudante01.nome = "Eduardo";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        //Se imprimir apenas a variavel estudante ele não vai pegar as caracteristicas e sim o lugar alocado da memoria
        System.out.println(estudante01);


    }
}
