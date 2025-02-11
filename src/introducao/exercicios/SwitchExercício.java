package introducao.exercicios;

public class SwitchExercício {
    public static void main(String[] args) {

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Dom |" + " Final de semana");
                break;
            case 2:
                System.out.println("Seg |" + " Dia util");
                break;
            case 3:
                System.out.println("Ter |" + " Dia util");
                break;
            case 4:
                System.out.println("Qua |" + " Dia util");
                break;
            case 5:
                System.out.println("Qui |" + " Dia util");
                break;
            case 6:
                System.out.println("Sex |" + " Dia util");
                break;
            case 7:
                System.out.println("Sab |" + " Final de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
