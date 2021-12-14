public class Jogador {
    private String nome;
    private int vitoria, derrota, empate;

    public Jogador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria += vitoria;
    }
    
    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota += derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate += empate;
    }

    //Exibição do resultado
    @Override
    public String toString() {
        return "\nParabéns " + nome + ", fim de jogo, o resultado foi: " +
                "\nVitoria: " + vitoria +
                "\nEmpate: " + empate +
                "\nDerrota: " + derrota;
    }
}
