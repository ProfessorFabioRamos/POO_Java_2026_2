public class Main {
    public static void main(String[] args){
        //Animal animal_1 = new Animal("Ornitorrinco", 4);
        //animal_1.emitirSom();
        //animal_1.mostrarInfo();

        Cachorro cachorro_1 = new Cachorro("Totó", 3, "Labrador");
        cachorro_1.emitirSom();
        cachorro_1.mostrarInfo();
        cachorro_1.abanarCauda();
        //System.out.println("Raça:"+cachorro_1.raca);

        Gato gato_1 = new Gato("Garfield", 10);
        gato_1.emitirSom();
        gato_1.mostrarInfo();
    }
}
