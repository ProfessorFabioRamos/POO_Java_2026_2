public class Main {
    public static void main(String[] args){
        Carro carro_1 = new Carro("Honda", "Civic",
         5, "JGF65F90");
        //System.out.println(carro_1.marca);
        //carro_1.placa = "JOE65F90";
        //System.out.println(carro_1.placa);

        System.out.println(carro_1.getMarca());
        carro_1.setMarca(null);
        carro_1.setMarca("");
        carro_1.setMarca("Toyota");
        System.out.println(carro_1.getMarca());

        System.out.println(carro_1.getQuantidadePassageiros());
        carro_1.setQuantidadePassageiros(0);
        carro_1.setQuantidadePassageiros(10);
        carro_1.setQuantidadePassageiros(7);
        System.out.println(carro_1.getQuantidadePassageiros());

        System.out.println(carro_1.getModelo(true));
        carro_1.setModelo(null);
        carro_1.setModelo("");
        carro_1.setModelo("jkdsfkjhadkjfhsadkjhfjkadshfhdsajkfhsdjk");
        carro_1.setModelo("Corolla");
        System.out.println(carro_1.getModelo(false));

        // Carro carro_2 = new Carro("Jeep", "Commander",
        //     "MMH1K67", 7);
        // System.out.println(carro_2.quantidadePassageiros);
    }
}
