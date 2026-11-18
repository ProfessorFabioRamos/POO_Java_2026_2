import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPedido extends JFrame{
    public TelaPedido(){
        // Configurações da tela
        setTitle("Pizzaria Mario");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criar painel e os componentes
        JPanel painel = new JPanel();
        JButton botaoVerificarPedido = new JButton("Verificar Pedido");

        botaoVerificarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,
                    "Seu pedido é uma pizza grande de pepperoni");
            }
        });

        // Adicionar os componentes ao frame
        painel.add(botaoVerificarPedido);
        add(painel);
    }
}
