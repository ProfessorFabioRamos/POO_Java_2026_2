public class Main{
    public static void main(String[] args){
        Carro carro_1 = new Carro("Honda", "Civic",
         5, "JGF65F90");
        //System.out.println(carro_1.marca);
        //carro_1.placa = "JOE65F90";
        //System.out.println(carro_1.placa);

        System.out.println(carro_1.getMarca());
        carro_1.acelerar();
        carro_1.acelerar(80.0f);

        carro_1.mostrarInfo();
    } 
}
