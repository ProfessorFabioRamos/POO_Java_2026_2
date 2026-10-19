package veiculos.aereo;

public class JatoGuerra extends Aereo{
    protected int misseis;

    public JatoGuerra(String nome, int misseis){
        super(nome);
        this.misseis = misseis;
    }

    @Override
    public void mover(){
        System.out.printf("O Jato %s está se movendo com a velocidade de %.2f km/h a uma altitude de %.2f pés.",nome,velocidadeAtual,altitude);
    }

    @Override
    public void ganharAltitude(double incremento){
        if(incremento > 0) altitude += incremento;
    }

    @Override
    public void perderAltitude(double decremento){
        if(decremento > 0){
            altitude -= decremento;
            if (altitude <0) altitude = 0;
        }
    }

    public void atirarMissel(){
        misseis -=1;
        System.out.println("Míssel atirado.Misseis restantes"+misseis);
    }
    // Sobrecarga - Polimorfismo Estático
    public void atirarMissel(int quantidade){
        misseis -=quantidade;
        System.out.println("Mísseis atirados.Misseis restantes"+misseis);
    }
    // Sobrescrita - Polimorfismo Dinâmico
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Altitide: "+altitude);
        System.out.println("Mísseis: "+misseis);
    }
}
