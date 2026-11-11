import java.util.Scanner;
import java.util.InputMismatchException;

public class Idade {
    public int anoNascimento;
    public int anoAtual;

    public Idade(int anoAtual){
        this.anoAtual = anoAtual;
    }

    public void calcularIdade(){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Digite o ano de nascimento: ");
            anoNascimento = sc.nextInt();
            int idade = anoAtual - anoNascimento;
            System.out.printf("Em %d você terá %d anos de idade.",
                anoAtual,idade);
        }catch(InputMismatchException e){
            System.out.println("Erro de entrada, digite apenas numeros");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Erro inesperado"+e.getMessage());
        }
        sc.close();
    }
}
