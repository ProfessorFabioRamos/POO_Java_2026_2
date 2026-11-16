public class Divisao {
    public float numerador;
    public float demominador;
    public Divisao(float n, float d){
        numerador = n;
        demominador = d;
    }
    public void dividir(){
        System.out.println("Iniciando a operação.");
        try {
            float resultado = numerador/demominador;
            System.out.println("O resultado é: "+resultado);
        }catch(ArithmeticException e) {
            System.out.println("Erro, não é possível dividir o número por zero");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Operação finalizada");
        }
        System.out.println("Finalizando o programa");
    }
}
