package app;

//import veiculos.Veiculo;
//import veiculos.aereo.Aereo;
//import veiculos.aquatico.Aquatico;
//import veiculos.terrestre.Terrestre;
import veiculos.terrestre.Carro;
import veiculos.aereo.JatoGuerra;

public class Main {
    public static void main(String[] args){
        // Nenhuma classe abstrata pode ser instanciada

        //Veiculo veciculo_1 = new Veiculo("Moto");
        //Aereo aereo_1 = new Aereo("Drone");
        //Aquatico aquatico_1 = new Aquatico("Caravela",false);
        //Terrestre terrestre_1 = new Terrestre("Patinete",2);

        // Adicionar o maximo de passageiros ao instanciar
        // Embarcar o maximo de passageiros e ligar o carro
        // Manter todas as movimentações anteriores 
        // Desligar o carro de desembarcar todos os passsageiros
        Carro carro_1 = new Carro("Fuscão Preto", 4, "Gasolina",5);
        carro_1.embarcar(5);
        carro_1.ligarMotor();
        carro_1.acelerar(80);
        carro_1.mover();
        carro_1.desacelerar(20);
        carro_1.mover();
        carro_1.desacelerar(60);
        carro_1.mover();
        carro_1.mostrarInfo();
        carro_1.desligarMotor();
        carro_1.desembarcar(5);

        // JatoGuerra jatoGuerra_1 = new JatoGuerra("F-16", 20);
        // jatoGuerra_1.acelerar(2000);
        // jatoGuerra_1.ganharAltitude(50000);
        // jatoGuerra_1.mover();
        // for(int i=0; i < 10;i++){
        //     jatoGuerra_1.atirarMissel();
        // }
        // jatoGuerra_1.atirarMissel(10);
        // jatoGuerra_1.perderAltitude(50000);
        // jatoGuerra_1.desacelerar(2000);
        // jatoGuerra_1.mover();
        // jatoGuerra_1.mostrarInfo();
    }
}
