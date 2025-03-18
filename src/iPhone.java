import java.util.Scanner;

public class iPhone {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("==== iPhone Ligado ====");

        Scanner scanner = new Scanner(System.in);

        var option = -1;

        //Disponibilizando aplicativos utilizaveis
        do {
            System.out.println("-----------------------");
            System.out.println("Selecione um aplicativo:");
            System.out.println("[1] Reprodutor Musical");
            System.out.println("[2] Aparelho Telefônico");
            System.out.println("[3] Navegar na Internet");
            System.out.println("[0] Desligar iPhone");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> ReprodutorMusical();
                case 2 -> AparelhoTelefonico();
                case 3 -> NavegarInternet();
            }
        }while (option != 0);

        System.out.println("==== iPhone Desligou ====");
    }

    //Aplicativo Reprodutor Musical
    public static void ReprodutorMusical() {
        var sair = 0;
        System.out.println("== Reprodutor Musical Selecionado ==");
       do{
            ReprodutorMusical rp = new ReprodutorMusical();
            rp.selecionarMusica();
            rp.tocar();
            rp.pausar();
            System.out.println("[1] Selecionar outra musica \n[2] Sair do Reprodutor Musical");
            sair = scanner.nextInt();
       }while (sair != 2);
    }

    //Aplicativo Aparelho telefonico
    public static void AparelhoTelefonico() {
        Scanner scanner = new Scanner(System.in);
        var sair = 0;
        System.out.println("== Aparelho Telefonico Selecionado ==");
        do{
            AparelhoTelefonico at = new AparelhoTelefonico();
            at.ligar();
            System.out.println("Deseja atender essa ligação?\n[1] SIM\n[2] NÃO");
            int atendendo = scanner.nextInt();
            if(atendendo == 1){
                at.atender();
            }
            else if(atendendo == 2){
                at.iniciarCorreioVoz();
            }
            System.out.println("[1] Realizar outra ligação \n[2] Sair do Aparelho Telefonico");
            sair = scanner.nextInt();
        }while (sair != 2);
    }

    //Aplicativo Navegador Internet
    public static void NavegarInternet() {
        var sair = 0;
        int paginaAtualizar = 0;
        System.out.println("== Navegador Internet Selecionado ==");
        do{
            NavegadorInternet ni = new NavegadorInternet();
            ni.exibirPagina();
            System.out.println("[1] Atualizar Pagina\n[2] Abrir outra Pagina\n[3] Sair do Navegador Internet");
            sair = scanner.nextInt();
            if(sair == 1){
                do {
                    ni.atualizarPagina();
                    System.out.println("[1] Atualizar Pagina\n[2] Abrir outra Pagina\n[3] Sair do Navegador Internet");
                    paginaAtualizar = scanner.nextInt();
                    sair = paginaAtualizar;
                }while (paginaAtualizar == 1);
            }
            else if(sair == 2){
                ni.adicionarNovaAba();
                System.out.println("[1] Atualizar Pagina\n[2] Abrir outra Pagina\n[3] Sair do Navegador Internet");
            }
        }while (sair != 3);
    }

}
