package veiculos.terrestre;

// Classe Concreta
public class Carro extends Terrestre{
    protected String tipoCombustivel;
    protected int passageiros;

    public Carro(String nome, int numeroRodas, String tipoCombustivel){
        super(nome, numeroRodas);
        this.tipoCombustivel = tipoCombustivel;
        this.passageiros = 0;    
    }

    @Override
    public void mover(){
        // Atalho alt+z para quebrar a linha visualmente
        System.out.println(String.format("O carro %s está se movendo com velocidade de %.2f km/h.", nome, velocidadeAtual));
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de rodas: "+numeroRodas);
        System.out.println("Tipo de Combustível: "+tipoCombustivel);
    }
}
