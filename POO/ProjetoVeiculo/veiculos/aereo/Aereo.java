package veiculos.aereo;

import veiculos.Veiculo;

public abstract class Aereo extends Veiculo{
    protected double altitude;

    public Aereo(String nome){
        super(nome);
        this.altitude = 0;
    }
    // Metodos abstratos
    public abstract void ganharAltitude(double incremento);
    public abstract void perderAltitude(double decremento);
}
