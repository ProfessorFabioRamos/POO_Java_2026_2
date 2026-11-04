import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        EstruturaList estoque_principal = new EstruturaList();
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
                    System.out.print("Digite o nome do produto: ");
                    sc.nextLine();
                    String nome =  sc.nextLine();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade =  sc.nextInt();
                    System.out.print("Digite o preço do produto: ");
                    float valor =  sc.nextFloat();
                    Produto produto = new Produto(nome, quantidade, valor);
                    estoque_principal.adicionar(produto);
                    break;
                case 2:
                   // Listar todos os elementos da lista
                    break;
                case 3:
                     // Atualizar elemento da lista
                    break;
                case 4:
                    System.out.print("Digite o indice do produto a ser removido: ");
                    int index = sc.nextInt();
                    estoque_principal.remover(index);
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }

        }

        sc.close();
    }
}
