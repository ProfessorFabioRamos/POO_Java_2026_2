public class Carro{
    // Atributos
    public String marca = "";
    public String modelo = "";
    public String placa = "";
    public int quantidadePassageiros = 0;
    public float velocidadeAtual = 0;
    public float quilometragem = 0;
    public boolean automatico = false;

    // Métodos
    // Método Construtor
    public Carro(String marca, String modelo, String placa,
        int quantidadePassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.quantidadePassageiros = quantidadePassageiros;
    }
}
