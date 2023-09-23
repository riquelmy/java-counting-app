import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        Contador obj = new Contador();
        try {
            Contador.contar(parametroUm, parametroDois);

        }catch (Exception e) {
            System.out.println("O primeiro parâmetro é maior que o segundo parâmetro!");
        }

    }
}