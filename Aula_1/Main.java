import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //System.out.print("Hello World");
        
        /* TIPOS BÁSICOS
        int idade = 27;
        float altura = 1.78f;
        double peso = 87.57;
        char categoria = 'B';
        String nome = "Carlos";
        boolean cadastroAtivo = true;
        */

        //int a = 3;
        //int b = 2;
        //boolean resultado;

        /*OPERADORES ARITMETICOS
        c = a + b; // ADIÇÃO
        c = a - b; // SUBTRAÇÃO
        c = a * b; // MULTIPLICAÇÃO
        c = a / b; // DIVISÃO
        c = a % b; // DIVISÃO RETORNANDO O RESTO

        System.out.print(c);
        */

        // OPERADORES RELACIONAIS
        // resultado = a > b; // MAIOR
        // resultado = a >= b; // MAIOR OU IGUAL
        // resultado = a < b; // MENOR
        // resultado = a <= b; // MENOR OU IGUAL
        // resultado = a == b; // IGUAL
        // resultado = a != b; // DIFERENTE

        // System.out.print("Resultado: "+resultado);

        a = 6;
        b = 7;
        // OPERADORES LÓGICOS
        //resultado = a > b && a > 0; // E = AND
        //resultado = a > b || a > 0; // OU = OR
        //resultado = a < b ^ a > 0; // EXCLUSIVO = XOR
        // resultado = a > b;
        // boolean resultadoInvertido = !resultado;  // NEGAÇÃO OU  CONTRÁRIO

        // System.out.println("Resultado: "+resultado);
        // System.out.print("Resultado Invertido: "+resultadoInvertido);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        float peso = sc.nextFloat();

        if(peso >= 120){
            System.out.println("Peso máximo excedido!");
        }
        else if(peso < 120 && peso >= 10){
            System.out.println("Tobogã Liberado!");
        }
        else if(peso < 10 && peso >= 0){
            System.out.println("Peso abaixo do permitido");
        }
        else{
            System.out.println("Peso inválido");
        }
        //Criar condição de peso negativo e peso abaixo de 10 kg
        sc.close();
    }
}
