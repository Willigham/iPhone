import java.util.Scanner;

public class NavegadorInternet {

    Scanner scanner = new Scanner(System.in);

    public void exibirPagina() {
        System.out.println("Informe a Url: \nExemplo: www.google.com");
        String url = scanner.nextLine();
        System.out.println("Você está na pagina: " + url);
    }

    public void atualizarPagina(){
        System.out.println("Atualizando Pagina...\nPagina Atualizada!");
    }

    public void adicionarNovaAba(){
        System.out.println("Abrindo uma Nova Aba...");
    }

}
