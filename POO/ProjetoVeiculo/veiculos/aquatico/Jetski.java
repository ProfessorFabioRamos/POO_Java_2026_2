package veiculos.aquatico;

public class Jetski extends Aquatico{
    protected int tripulantes;

    public Jetski(String nome, boolean possuiHelice, int tripulantes){
        super(nome,possuiHelice);
        this.tripulantes = tripulantes;
    }

    @Override
    public void mover(){
        System.out.println(String.format("O Jetski %s está se movendo na água com a velocidade %.2f km/h com %d pessoas à bordo.", nome, velocidade, tripulantes));
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Possui Hélice: "+possuiHelice);
        System.out.println("Tripulantes: "+tripulantes);
    }
}
