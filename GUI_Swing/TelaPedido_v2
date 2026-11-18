import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;

public class TelaPedido extends JFrame{
    private JTextField txtNome, txtSabor;
    private JLabel labelResumo;

    public TelaPedido(){
        // Configurações da tela
        setTitle("Pizzaria Mario");
        setSize(450,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10));

        // Criar painel e os componentes
        JPanel painel = new JPanel(new GridLayout(2,2,5,5));
        painel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        painel.add(new Label("Seu nome:"));
        txtNome = new JTextField();
        painel.add(txtNome);

        painel.add(new Label("Sabor da Pizza:"));
        txtSabor = new JTextField();
        painel.add(txtSabor);

        // Botão
        JButton botaoConfirmar = new JButton("Confirmar Pedido");
        botaoConfirmar.addActionListener(e-> processarPedido());

        // Resumo do pedido
        labelResumo = new JLabel("Aguardando pedido...",
        SwingConstants.CENTER);
        labelResumo.setForeground(Color.BLUE);
        labelResumo.setPreferredSize(new Dimension(0,50));

        // Adicionar os componentes ao frame
        add(painel, BorderLayout.CENTER);
        add(botaoConfirmar,BorderLayout.NORTH);
        add(labelResumo,BorderLayout.SOUTH);
    }

    public void processarPedido(){
        try{
            String nome = txtNome.getText().trim();
            String sabor = txtSabor.getText().trim();

            if(nome.isEmpty() || sabor.isEmpty()){
                throw new PedidoInvalidoException("Todos os campos devem ser preenchidos");
            }
            // Sucesso
            // TO DO
        }catch(PedidoInvalidoException e){

        }
    }
}

class PedidoInvalidoException extends Exception{
    public PedidoInvalidoException(String msg){
        super(msg);
    }
}
