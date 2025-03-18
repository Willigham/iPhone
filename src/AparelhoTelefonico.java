import java.util.Scanner;

public class AparelhoTelefonico {
    Scanner scanner = new Scanner(System.in);


    public void ligar() {
        System.out.println("Disque o numero de telefone:\nExemplo: 98765-4321");
        String telefone = scanner.next();
        System.out.println("Ligando para: " + telefone);
    }

    public void atender() {
        System.out.println("Chamada Atendida e Finalizada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Deixando Mensagem no correio de voz.");
    }
}
