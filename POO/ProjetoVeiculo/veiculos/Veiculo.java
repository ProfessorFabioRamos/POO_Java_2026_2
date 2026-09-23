package veiculos;

public abstract class Veiculo {
    public String nome;
    public double velocidadeAtual;

    public Veiculo(String nome){
        this.nome = nome;
        this.velocidadeAtual = 0;
    }
}
