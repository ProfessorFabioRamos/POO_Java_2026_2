public class Carro {
    public String marca = "";
    public String modelo = "";
    public int quantidadePassageiros = 0;
    public float quilometragem = 0;
    public String placa = "";
    public boolean automatico = false;

    public Carro(String marca, String modelo, int quantidadePassageiros,
        String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadePassageiros = quantidadePassageiros;
        this.placa = placa;
    }
}
