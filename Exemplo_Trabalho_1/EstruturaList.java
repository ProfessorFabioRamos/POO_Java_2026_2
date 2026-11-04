import java.util.ArrayList;
import java.util.List;

public class EstruturaList {
    // Instanciar a lista, não precisa de tamanho fixo
    // e nem de contador manual
    public List<Produto> estoque = new ArrayList<>();

    public void adicionar(Produto p){
        estoque.add(p);
        System.out.println("Produto adicionado!");
    }

    public void remover(int indice){
        if(indice >=0 && indice < estoque.size()){
            estoque.remove(indice);
            System.out.println("Produto removido!");
        }
        else{
            System.out.println("Índice inválido!");
        }
    }
}   
