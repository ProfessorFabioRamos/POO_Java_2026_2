package veiculos;

public abstract class Veiculo {
    protected String nome;
    protected double velocidadeAtual;

    public Veiculo(String nome){
        this.nome = nome;
        this.velocidadeAtual = 0;
    }

    public void acelerar(double incremento){
        if(incremento > 0){
            velocidadeAtual += incremento;
        }
    }

    public void desacelerar(double decremento){
        if(decremento > 0){
            velocidadeAtual -= decremento;
            if(velocidadeAtual < 0){
                velocidadeAtual = 0;
            }
        }
    }
}
