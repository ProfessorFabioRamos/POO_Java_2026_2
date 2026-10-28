package veiculos.terrestre;

import veiculos.interfaces.IMotorizado;
import veiculos.interfaces.ITripulavel;

// Não é necessário importar pois estão no mesmo package
//import veiculos.terrestre.Terrestre;

// Classe Concreta
public class Carro extends Terrestre implements IMotorizado, ITripulavel{
    protected String tipoCombustivel;
    protected int passageiros;
    protected int maximoPassageiros;
    protected boolean motorLigado;
    
    public Carro(String nome, int numeroRodas, String tipoCombustivel, int maximoPassageiros){
        super(nome, numeroRodas);
        this.tipoCombustivel = tipoCombustivel;
        this.passageiros = 0;
        this.maximoPassageiros = maximoPassageiros;
        this.motorLigado = false;
    }

    @Override
    public void mover(){
        // Alt+z para quebrar a linha visualmente
        System.out.println(String.format("O carro %s está se movendo a velocidade de %.2f km/h",nome, velocidadeAtual));
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de rodas: "+numeroRodas);
        System.out.println("Tipo de combustivel: "+tipoCombustivel);
    }

    @Override
    public void ligarMotor(){
        if(velocidadeAtual == 0 && !motorLigado){
            motorLigado = true;
            System.out.println("Motor está ligado.");
        }
    }

    @Override
    public void desligarMotor(){
        if(velocidadeAtual == 0 && motorLigado){
            motorLigado = false;
            System.out.println("Motor foi desligado.");
        }
    }

    @Override
    public void acelerar(double incremento){
        if(motorLigado){
            super.acelerar(incremento);
        }else{
            System.out.println("O motor está desligado. Não é possível acelerar");
        }
    }

    @Override 
    public void embarcar(int quantidade){
        if(passageiros < maximoPassageiros && velocidadeAtual == 0){
            passageiros += quantidade;
            if(passageiros > maximoPassageiros){
                passageiros = maximoPassageiros;
                System.out.println("Limite de passageiros excedido!");
            }
            System.out.println(passageiros+" passageiros no carro.");
        }
    }
    @Override
    public void desembarcar(int quantidade){
        if(passageiros > 0 && velocidadeAtual == 0){
            passageiros -= quantidade;
            if(passageiros < 0){
                passageiros = 0;
            }
            System.out.println(passageiros+" passageiros no carro.");
        }
    }
}
