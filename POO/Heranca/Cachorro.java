public class Cachorro extends Animal{
    public String raca;
    
    public Cachorro(String nome, int idade, String raca){
        // Faz referência ao método construtor da classe super
        super(nome, idade);
        this.raca = raca;
    }

    // Sobrescrita (Polimorfismo)
    @Override 
    public void emitirSom(){
        System.out.println("Au Au");
    }

    @Override 
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raça:"+raca);
    }

    //Método próprio da classe Cachorro
    public void abanarCauda(){
        System.out.println(nome+" está abanando a cauda!");
    }
}
