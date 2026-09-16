// Classe Base ou Super
public class Animal {
    public String nome = "";
    public int idade = 0;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Método Genérico
    public void emitirSom(){
        System.out.println("Animal disse:"+nome);
    }

    public void mostrarInfo(){
        System.out.println("Nome:"+nome); 
        System.out.println("Idade:"+idade); 
    }
}
