public class EstruturaArray {
    // É necessário definir um tamanho máximo
    public Produto[] estoque = new Produto[100];
    // Contador manual para o indice
    public int contador = 0;

    public void adicionar(Produto p){
        if(contador < estoque.length){
            estoque[contador] = p;
            contador++;
            System.out.println("Produto adicionado!");
        }else{
            System.out.println("Lista de produtos está cheia!");
        }
    }

    public void remover(int indice){
        if(indice >=0 && indice < contador){
            // Deslocar todos os itens para a esquerda 
            // para preencher o elemento removido
            for(int i = indice;i < contador;i++){
                estoque[i] = estoque[i+1];
            }
            // Limpa a ultima posição que ficou duplicada
            estoque[contador-1] = null;
            contador--;
            System.out.println("Produto removido!");
        }
        else{
            System.out.println("Índice inválido!");
        }
    }
}
