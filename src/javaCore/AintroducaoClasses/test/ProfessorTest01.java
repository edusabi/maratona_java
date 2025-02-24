package javaCore.AintroducaoClasses.test;

import javaCore.AintroducaoClasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Eduardo";
        professor.idade = 20;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}

