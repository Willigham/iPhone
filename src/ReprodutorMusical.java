import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class ReprodutorMusical {
    Scanner scanner = new Scanner(System.in);

    int musica = -1;
    int indice= 0;

    //Lista de Musicas
    String [] musicas = {"1 - The Lost Soul Down" , "2 - cardigan don toliver" , "3 - Rapture Interworld"};


    //Declarando Musicas Disponiveis
    public void selecionarMusica() {
       System.out.println("Selecione uma Musica:");
        for(int indice = 0; indice < musicas.length; indice++){
            System.out.println(musicas[indice]);
        }
    }


    //Tocando Musica Selecionada
    public void tocar() {
        musica = scanner.nextInt();
        switch (musica) {
            case 1 -> System.out.println("Tocando: " + (musicas[indice]));
            case 2 -> System.out.println("Tocando: " + (musicas[indice+1]));
            case 3 -> System.out.println("Tocando: " + (musicas[indice+2]));
        }
    }

    //Pausar musica ou selecionar outras opções
    public void pausar() {
        System.out.println("[1] Pausar Musica | [2] Outras Opções");
        int pausar = scanner.nextInt();
        if (pausar == 1) {
            System.out.println("Musica PAUSADA.");
        }
    }


}
