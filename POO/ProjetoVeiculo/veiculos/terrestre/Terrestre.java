package veiculos.terrestre;

import veiculos.Veiculo;

public abstract class Terrestre extends Veiculo{
    protected int numeroRodas;

    public Terrestre(String nome,int numeroRodas){
        super(nome);
        this.numeroRodas = numeroRodas;
    }
}
