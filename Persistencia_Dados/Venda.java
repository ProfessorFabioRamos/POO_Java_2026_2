import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Locale;
import java.nio.charset.StandardCharsets;

public class Venda {
    public void processarVenda(){
        String cliente = "João Pereira";
        float venda = 400.45f;
        boolean entregaGratis = true;

        System.out.println("Iniciando o salvamento de dados...");

        // 1. TXT com modo append e histórico
        try(FileWriter fw = new FileWriter("historico_vendas.txt",
        StandardCharsets.UTF_8,true);
            PrintWriter out = new PrintWriter(fw)){
            out.println("Cliente: "+cliente+" | Venda: "+venda+" | Entrega Gratis:"+entregaGratis);
            System.out.println("Arquivo txt atualizado com sucesso!");
        }catch(IOException e){
            System.out.println("Erro ao salvar txt: "+e.getMessage());
        }

        // 2. JSON modo sobrescrita/ultima venda (append falso)
        //Montar a estrutura com format e aspas triplas
        String json = """
                {
                    "cliente": "%s",
                    "venda": %.2f,
                    "entregaGratis": %b
                }
                """;
        String json_format = String.format(Locale.US, json, cliente, venda, entregaGratis);

        try(FileWriter fw2 = new FileWriter("ultimo_pedido.json",
        StandardCharsets.UTF_8,false);
            PrintWriter out2 = new PrintWriter(fw2)){
                out2.print(json_format);
                System.out.println("Arquivo JSON gerado com sucesso!");
        }catch(IOException e){
            System.out.println("Erro ao gerar o  JSON: "+e.getMessage());
        }
    }
}
