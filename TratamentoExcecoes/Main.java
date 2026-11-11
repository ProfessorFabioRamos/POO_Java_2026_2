public class Main {
    public static void main(String[]args){
        // Exemplo tem try/catch (travamento)
        //int res = 9/0;
        //System.out.println(res);

        // Tratamento de divisão por 0
        Divisao div = new Divisao(9, 0);
        div.dividir();
    }
}
