import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        for(int i = 100; i >= 0;i-=2){
            System.out.println(i);
        }
        System.out.println("Fim.");

        // Ir de 100 a 0 de 2 em 2
        */
       
        Scanner sc = new Scanner(System.in);
        double somatorio = 0;
        System.out.print("Digite quantos numeros quer somar: ");
        int repeticoes = sc.nextInt();
        int i = 0;

        for(i=0; i < repeticoes;i++){
            System.out.print("Digite o numero "+(i+1)+" : ");
            double num = sc.nextDouble();
            somatorio += num;
        }
        System.out.println("Somatório: "+somatorio);
        double media = somatorio/repeticoes;
        System.out.println("Média: "+media);
        //System.out.println("Média: "+(somatorio/repeticoes));
        sc.close();
    }
}
