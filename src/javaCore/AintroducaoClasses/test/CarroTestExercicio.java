package javaCore.AintroducaoClasses.test;


import javaCore.AintroducaoClasses.domain.CarroExercicio;

public class CarroTestExercicio {
    public static void main(String[] args) {

        CarroExercicio carro1 = new CarroExercicio();
        CarroExercicio carro2 = new CarroExercicio();



        carro1.nome = "Palio";
        carro1.ano = 2010;
        carro1.modelo = "2005";

        carro2.nome = "Fusca";
        carro2.ano = 1970;
        carro2.modelo = "Sport";

        //Referência de objetos
        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println( carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);





    }

}
