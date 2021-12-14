import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //criador do jogador
        Jogador player = new Jogador();
        //criador do jogo
        Jogo game = new Jogo();

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Olá, seja bem vindo ao Jokenpo!\nAntes de iniciar o jogo, digite o seu nome: ");
        String nome = scan.next();

        //armazenamento do nome do usuário
        player.setNome(nome);
        
        //verificar se o usuário quer continuar jogando
        char resp = 's';
        while (resp == 's') {
            System.out.println("\n-------------------------------------\n");
            System.out.println("          " + player.getNome() + "   xXx   CPU\n");
            System.out.println("-------------------------------------\n");
            System.out.println("Digite um número correspondente a sua escolha para iniciar o jogo:");
            System.out.println("\n0 -> Pedra\n1 -> Papel\n2 -> Tesoura");
            int escolha = scan.nextInt();

            game.jogar(escolha, player);

            System.out.println("\nDeseja continuar? [s/n]");
            resp = scan.next().charAt(0);
        }

        System.out.println(player.toString());

    }
}
