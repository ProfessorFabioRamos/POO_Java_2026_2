import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Bem vindo ao sistema de cadastro, digite a opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produtos");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Encerrar");

            int opcao = sc.nextInt();
            if(opcao == 0){
                break;
            }
            switch (opcao) {
                case 1:
                   // Adicionar elemento na lista
                    System.out.println("Digite o nome do produto:");
                    String nome =  sc.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    int quantidade =  sc.nextInt();
                    System.out.println("Digite o preço do produto:");
                    float valor =  sc.nextFloat();
                    Produto produto_1 = new Produto(nome, quantidade, valor);
                    // Adicionar na lista
                    
                    break;
                case 2:
                   // Listar todos os elementos da lista
                    break;
                case 3:
                     // Atualizar elemento da lista
                    break;
                case 4:
                    // Remover elemento da lista
                    break;
                default:
                    break;
            }

        }

        sc.close();
    }
}
