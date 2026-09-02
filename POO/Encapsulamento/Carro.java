public class Carro {
    private String marca = "";
    private String modelo = "";
    private int quantidadePassageiros = 0;
    private float quilometragem = 0;
    private float velocidadeAtual = 0;
    private String placa = "";
    private boolean automatico = false;

    public Carro(String marca, String modelo, int quantidadePassageiros,
        String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadePassageiros = quantidadePassageiros;
        this.placa = placa;
    }

    // Método
    public void acelerar(){
        System.out.println("VRUMMMM");
    }
    // Sobrecarga do método acelerar()
    public void acelerar(float novaVelocidade){
        if(novaVelocidade < 220){
            // Format de String = %d(int), %f(float e double), %s(String)
            // %.2f = 2 casas decimais
            String velText = String.format("Velocidade anterior: %f km/h, Velocidade Nova: %.2f km/h",velocidadeAtual,novaVelocidade );
            velocidadeAtual = novaVelocidade;
            System.out.println(velText);
        }
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Placa: "+ placa);
        System.out.println("Passageiros: "+ quantidadePassageiros);
        System.out.println("Quilometragem: "+ quilometragem);
    }

    //Método Getter de marca
    public String getMarca(){
        return marca;
    }

    //Método Setter de marca
}
