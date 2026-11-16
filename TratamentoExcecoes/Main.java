public class Main{
    public static void main(String[] args){
        //Divisao div = new Divisao(9, 0);
        //div.dividir();

        //Idade idade = new Idade(2026);
        //idade.calcularIdade();

        Apresentar apr = null;

        try {
            apr.apresentacao("Manuel");            
        }catch(NullPointerException e){
            System.out.println("Erro crítico: Objeto ou atributo nulo");
            System.out.println(e.getMessage());
        }
    }
}
