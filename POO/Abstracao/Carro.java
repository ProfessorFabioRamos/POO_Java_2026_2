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

    public void acelerar(){
        System.out.println("VRUMMMM");
    }

    public void acelerar(float novaVelocidade){
        if(novaVelocidade < 220){
            velocidadeAtual = novaVelocidade;
            System.out.println("Velocidade: "+velocidadeAtual);
        }
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Placa: "+ placa);
        System.out.println("Passageros: "+ quantidadePassageiros);
        System.out.println("Quilometragem: "+ quilometragem);
        System.out.println("Velocidade Atual: "+ velocidadeAtual);
        System.out.println("Câmbio Manual: "+ automatico);
    }
}
