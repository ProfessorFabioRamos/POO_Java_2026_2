package veiculos.aereo;

public class JatoGuerra extends Aereo{
    protected int misseis;

    public JatoGuerra(String nome, int misseis){
        super(nome);
        this.misseis = misseis;
    }

    @Override
    public void mover(){
        System.out.printf("O Jato %s está se movendo a uma velocidade de %.2f km/h a uma altitude de %.2f pés de altitude.\n",nome,velocidadeAtual,altitude);
    }

    @Override
    public void ganharAltitude(double incremento){
        if(incremento > 0) altitude += incremento;
    }    

    @Override
    public void perderAltitude(double decremento){
        if(decremento > 0){
            altitude -= decremento;
            if(altitude < 0) altitude = 0;
        }
    }

    public void atirarMissel(){
        misseis -= 1;
        if(misseis < 0){
            misseis = 0;
            System.out.println("Não há mais mísseis!");
        }else{
            System.out.println("Míssel Atirado. Mísseis restantes: "+misseis);
        }
    }
    // Sobrecarga - Polimorfismo Estático (Overload)
    public void atirarMissel(int quantidade){
        misseis -= quantidade;
        if(misseis < 0){
            misseis = 0;
            System.out.println("Não há mais mísseis!");
        }else{
            System.out.println("Mísseis Atirados. Mísseis restantes: "+misseis);
        }
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Altitude: "+altitude);
        System.out.println("Mísseis: "+misseis);
    }
}
