package veiculos.aquatico;

import veiculos.Veiculo;

public abstract class Aquatico extends Veiculo{
    protected boolean possuiHelice;

    public Aquatico(String nome, boolean possuiHelice){
        super(nome);
        this.possuiHelice = possuiHelice;
    }
}
