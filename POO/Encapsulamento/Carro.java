public class Carro{
    // Atributos
    private String marca = "";
    private String modelo = "";
    private String placa = "";
    private int quantidadePassageiros = 0;
    private float velocidadeAtual = 0;
    private float quilometragem = 0;
    private boolean automatico = false;

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

    // Método Getter
    public String getMarca(){
        String marcaUpper = maiuscula(marca);
        return marcaUpper;
    }

    // Método Setter
    public void setMarca(String novaMarca){
        if(novaMarca != null && !novaMarca.isEmpty()){
            marca = novaMarca;
        }
        else{
            System.out.println("Marca Inválida");
        }
    }
    // Método privado (encapsulado)
    private String maiuscula(String txt){
        return txt.toUpperCase();
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int novaQuantidade) {
        if(novaQuantidade >= 1 && novaQuantidade <= 7){
            quantidadePassageiros = novaQuantidade;
        }
        else{
            System.out.println("Quantidade Inválida");
        }
       
    }

    public String getModelo(boolean lowerCaseMode) {
        return lowerCaseMode? modelo.toLowerCase() : modelo;  // Operador Ternário
    }

    public void setModelo(String novoModelo) {
        if(novoModelo != null && !novoModelo.isEmpty() && novoModelo.length() <= 30){
            modelo = novoModelo;
        }
        else{
            System.out.println("Modelo Inválido");
        }
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Placa: "+ placa);
        System.out.println("Passageiros: "+ quantidadePassageiros);
        System.out.println("Quilometragem: "+ quilometragem);
        System.out.println("Velocidade Atual: "+ velocidadeAtual);
        System.out.println("Câmbio Manual: "+ automatico);
    }
}
