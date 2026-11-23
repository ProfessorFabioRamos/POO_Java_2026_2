import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox; // Dropdown
import javax.swing.JCheckBox;
//import javax.swing.*;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class TelaPedido extends JFrame{
    private JTextField txtNome;
    private JLabel labelResumo;
    private JComboBox<String> cbSabor;
    private JCheckBox checkBorda;

    public TelaPedido(){
        // Configurações básicas da janela
        setTitle("Pizzaria Mario");
        setSize(600,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        // Criar painel e os componentes
        JPanel painelPedido = new JPanel(new GridLayout(3,2,5,15));
        painelPedido.setBorder(BorderFactory.createEmptyBorder(20,20,10,20));

        painelPedido.add(new Label("Seu nome:"));
        txtNome = new JTextField();
        painelPedido.add(txtNome);

        // ComboBox Dropdown
        painelPedido.add(new Label("Sabor da pizza:"));
        String[] opcoesSabor = {"Selecione um sabor", "Pepperoni","Calabresa","Marguerita","Frango com Catupiry"};
        cbSabor = new JComboBox<>(opcoesSabor);
        painelPedido.add(cbSabor);

        // Borda
        painelPedido.add(new JLabel("Adicionais:"));
        checkBorda = new JCheckBox("Borda Recheada?");
        painelPedido.add(checkBorda);

        // Painel Botão
        JPanel painelBotao = new JPanel(new FlowLayout());
        JButton botaoConfirmar = new JButton("Confirmar Pedido");
        botaoConfirmar.addActionListener(e -> processarPedido());
        painelBotao.add(botaoConfirmar);

        // Agrupando painéis
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        painelPrincipal.add(painelPedido, BorderLayout.NORTH);
        painelPrincipal.add(painelBotao, BorderLayout.CENTER);

        labelResumo = new JLabel("Aguardando pedido...", SwingConstants.CENTER);
        labelResumo.setForeground(new Color(166, 35, 155)); // 0 a 255
        labelResumo.setBorder(BorderFactory.createEmptyBorder(10,10,20,10));
        
        // Janela Final
       add(painelPrincipal, BorderLayout.CENTER);
       add(labelResumo, BorderLayout.SOUTH);
       setLocationRelativeTo(null);
    }

    public void processarPedido(){
        try{
            String nome = txtNome.getText().trim();
            String sabor = (String) cbSabor.getSelectedItem();
            boolean borda = checkBorda.isSelected();

            if(nome.isEmpty()){
                throw new PedidoInvalidoException("O nome deve ser preenchido.");
            }
            if(sabor == null || sabor == "Selecione um sabor"){
                throw new PedidoInvalidoException("O sabor deve ser selecionado.");
            }
            // Sucesso
            String textBorda = borda ? "COM borda recheada" : "SEM borda recheada";
            String msg = "Pedido de "+nome+" | Pizza de "+sabor+" ("+textBorda+")";

            JOptionPane.showMessageDialog(this, "Pedido enviado com sucesso!");
            labelResumo.setText("Último pedido | "+msg);
        }catch(PedidoInvalidoException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro no pedido",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro nos dados",JOptionPane.ERROR_MESSAGE);
        }
    }
}

class PedidoInvalidoException extends Exception{
    public PedidoInvalidoException(String msg){
        super(msg);
    }
}
