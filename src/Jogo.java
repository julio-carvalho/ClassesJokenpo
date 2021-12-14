import java.util.Random;

class Jogo {
    public Jogo() {

    }   
    
    public void jogar(int jogada, Jogador player) {
        //Número random da jogada da CPU
        int cpu = (int) (Math.random() * ((2 - 0) + 1)) + 0;

        System.out.println("\nNúmero da cpu: " + cpu);

        switch (jogada) {
            //Usuário escolhe 0 = pedra
            case 0:
                switch (cpu) {
                    case 0:
                        System.out.println("\n" + player.getNome() + (" - Pedra xXx Pedra - CPU"));
                        System.out.println("\nEmpate! Tente novamente " + player.getNome());
                        player.setEmpate(1);
                        break;
                    case 1:
                        System.out.println("\n" + player.getNome() + (" - Pedra xXx Papel - CPU"));
                        System.out.println("\nDerrota! Tente novamente " + player.getNome());
                        player.setDerrota(1);
                        break;                   
                    case 2:
                        System.out.println("\n" + player.getNome() + (" - Pedra xXx Tesoura - CPU"));
                        System.out.println("\nVitória! Parabéns " + player.getNome());
                        player.setVitoria(1);
                        break;
                    default:
                        System.out.println("\nNúmero inválido! Você deve escolher um número entre 0 a 2");
                }
            break;
            //Usuário escolhe 1 = papel
            case 1:
                switch (cpu) {
                    case 0:
                        System.out.println("\n" + player.getNome() + (" - Papel xXx Pedra - CPU"));
                        System.out.println("\nVitória! Parabéns " + player.getNome());
                        player.setVitoria(1);
                        break;
                    case 1:
                        System.out.println("\n" + player.getNome() + (" - Papel xXx Papel - CPU"));
                        System.out.println("\nEmpate! Tente novamente " + player.getNome());
                        player.setDerrota(1);
                        break;                   
                    case 2:
                        System.out.println("\n" + player.getNome() + (" - Papel xXx Tesoura - CPU"));
                        System.out.println("\nDerrota! Tente novamente " + player.getNome());
                        player.setDerrota(1);
                        break;   
                    default:
                        System.out.println("\nNúmero inválido! Você deve escolher um número entre 0 a 2");
                }                    
            break;
            //Usuário escolhe 2 = tesoura
            case 2:
                switch (cpu) {
                    case 0:
                        System.out.println("\n" + player.getNome() + (" - Tesoura xXx Pedra - CPU"));
                        System.out.println("\nDerrota! Tente novamente " + player.getNome());
                        player.setDerrota(1);
                        break;   
                    case 1:
                        System.out.println("\n" + player.getNome() + (" - Tesoura xXx Papel - CPU"));
                        System.out.println("\nVitória! Parabéns " + player.getNome());
                        player.setVitoria(1);
                        break;             
                    case 2:
                        System.out.println("\n" + player.getNome() + (" - Tesoura xXx Tesoura - CPU"));
                        System.out.println("\nEmpate! Tente novamente " + player.getNome());
                        player.setDerrota(1);
                        break;   
                    default:
                        System.out.println("\nNúmero inválido! Você deve escolher um número entre 0 a 2");
            }
            break; 
            default:
                System.out.println("\nNúmero inválido! Você deve escolher um número entre 0 a 2");
        }
    }
}
