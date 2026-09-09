public class Main {
    public static void main(String[] args){
        Carro carro_1 = new Carro("Honda", "Civic",
        "JGF6F90", 5);
        System.out.println(carro_1.getMarca());
        carro_1.setMarca("");
        carro_1.setMarca(null);
        carro_1.setMarca("Toyota");
        System.out.println(carro_1.getMarca());
        
        System.out.println(carro_1.getModelo(false));
        System.out.println(carro_1.getModelo(true));
        carro_1.setModelo("jhbfilawswswswswsdjkngvjksdbngjkawsenjkgawegwnggbf"); // Erro
        carro_1.setModelo("Corolla");
        System.out.println(carro_1.getModelo(false));
        carro_1.mostrarInfo();

        // Carro carro_2 = new Carro("Jeep", "Commander",
        //     "MMH1K67", 7);
        // System.out.println(carro_2.quantidadePassageiros);
    }
}
