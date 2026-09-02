public class Main {
    public static void main(String[] args){
        Carro carro_1 = new Carro("Honda", "Civic",
            "JGF6F90", 5);
        System.out.println(carro_1.marca);
        carro_1.placa = "JGE7F91";
        System.out.println(carro_1.placa);
        carro_1.acelerar();
        carro_1.acelerar(200.0f);
        carro_1.mostrarInfo();


        Carro carro_2 = new Carro("Jeep", "Commander",
            "MMH1K67", 7);
        System.out.println(carro_2.quantidadePassageiros);
    }
}
