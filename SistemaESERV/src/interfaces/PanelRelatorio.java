package interfaces;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * PanelRelatorio
 */
public class PanelRelatorio extends JPanel implements ActionListener {

    private JFrame frame;
    private JPanel panel;

    private JLabel lClientes;
    private JButton bCadastroCliente;
    private JButton bEditarCliente;
    private JButton bExcluirCliente;
    private JButton bConsultarCliente;

    private JLabel lFuncionarios;
    private JButton bCadastroFuncionario;
    private JButton bEditarFuncionario;
    private JButton bExcluirFuncionario;
    private JButton bConsultarFuncionario;

    private JLabel lEstoque;
    private JButton bCadastroEstoque;
    private JButton bEditarEstoque;
    private JButton bExcluirEstoque;
    private JButton bConsultarEstoque;

    private JLabel lServicos;
    private JButton bCadastroServico;
    private JButton bEditarServico;
    private JButton bExcluirServico;
    private JButton bConsultarServico;

    PanelRelatorio() {
        lClientes = new JLabel("Clientes");
        lClientes.setBounds(100, 60, 350, 60);
        lClientes.setFont(new Font("Arial", Font.PLAIN, 30));
        lClientes.setForeground(new Color(70, 130, 180));
        add(lClientes);

        bCadastroCliente = new JButton("Cadastro");
        // bGerenciamento.setIcon(defaultIcon);
        bCadastroCliente.setBounds(30, 130, 330, 30);
        bCadastroCliente.setFont(new Font("Arial", Font.PLAIN, 25));
        bCadastroCliente.setForeground(new Color(169, 169, 169));
        bCadastroCliente.setBorderPainted(false);
        bCadastroCliente.addActionListener(this);
        add(bCadastroCliente);

        bEditarCliente = new JButton("Editar");
        // bGerenciamento.setIcon(defaultIcon);
        bEditarCliente.setBounds(30, 180, 300, 30);
        bEditarCliente.setFont(new Font("Arial", Font.PLAIN, 25));
        bEditarCliente.setForeground(new Color(169, 169, 169));
        bEditarCliente.setBorderPainted(false);
        add(bEditarCliente);

        bExcluirCliente = new JButton("Excluir");
        // bGerenciamento.setIcon(defaultIcon);
        bExcluirCliente.setBounds(30, 230, 310, 30);
        bExcluirCliente.setFont(new Font("Arial", Font.PLAIN, 25));
        bExcluirCliente.setForeground(new Color(169, 169, 169));
        bExcluirCliente.setBorderPainted(false);
        add(bExcluirCliente);

        bConsultarCliente = new JButton("Consultar");
        // bGerenciamento.setIcon(defaultIcon);
        bConsultarCliente.setBounds(30, 280, 340, 30);
        bConsultarCliente.setFont(new Font("Arial", Font.PLAIN, 25));
        bConsultarCliente.setForeground(new Color(169, 169, 169));
        bConsultarCliente.setBorderPainted(false);
        add(bConsultarCliente);

        lFuncionarios = new JLabel("Funcionários");
        lFuncionarios.setBounds(420, 60, 300, 60);
        lFuncionarios.setFont(new Font("Arial", Font.PLAIN, 30));
        lFuncionarios.setForeground(new Color(70, 130, 180));
        add(lFuncionarios);

        bCadastroFuncionario = new JButton("Cadastro");
        bCadastroFuncionario.setBounds(355, 130, 330, 30);
        bCadastroFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
        bCadastroFuncionario.setForeground(new Color(169, 169, 169));
        bCadastroFuncionario.setBorderPainted(false);
        add(bCadastroFuncionario);

        bEditarFuncionario = new JButton("Editar");
        bEditarFuncionario.setBounds(355, 180, 300, 30);
        bEditarFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
        bEditarFuncionario.setForeground(new Color(169, 169, 169));
        bEditarFuncionario.setBorderPainted(false);
        add(bEditarFuncionario);

        bExcluirFuncionario = new JButton("Excluir");
        bExcluirFuncionario.setBounds(355, 230, 310, 30);
        bExcluirFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
        bExcluirFuncionario.setForeground(new Color(169, 169, 169));
        bExcluirFuncionario.setBorderPainted(false);
        add(bExcluirFuncionario);

        bConsultarFuncionario = new JButton("Consultar");
        bConsultarFuncionario.setBounds(355, 280, 340, 30);
        bConsultarFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
        bConsultarFuncionario.setForeground(new Color(169, 169, 169));
        bConsultarFuncionario.setBorderPainted(false);
        add(bConsultarFuncionario);

        lEstoque = new JLabel("Estoque");
        lEstoque.setBounds(100, 370, 300, 60);
        lEstoque.setFont(new Font("Arial", Font.PLAIN, 30));
        lEstoque.setForeground(new Color(70, 130, 180));
        add(lEstoque);

        bCadastroEstoque = new JButton("Cadastro");
        // bGerenciamento.setIcon(defaultIcon);
        bCadastroEstoque.setBounds(30, 440, 330, 30);
        bCadastroEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
        bCadastroEstoque.setForeground(new Color(169, 169, 169));
        bCadastroEstoque.setBorderPainted(false);
        add(bCadastroEstoque);

        bEditarEstoque = new JButton("Editar");
        // bGerenciamento.setIcon(defaultIcon);
        bEditarEstoque.setBounds(30, 490, 300, 30);
        bEditarEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
        bEditarEstoque.setForeground(new Color(169, 169, 169));
        bEditarEstoque.setBorderPainted(false);
        add(bEditarEstoque);

        bExcluirEstoque = new JButton("Excluir");
        // bGerenciamento.setIcon(defaultIcon);
        bExcluirEstoque.setBounds(30, 540, 310, 30);
        bExcluirEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
        bExcluirEstoque.setForeground(new Color(169, 169, 169));
        bExcluirEstoque.setBorderPainted(false);
        add(bExcluirEstoque);

        bConsultarEstoque = new JButton("Consultar");
        // bGerenciamento.setIcon(defaultIcon);
        bConsultarEstoque.setBounds(30, 590, 340, 30);
        bConsultarEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
        bConsultarEstoque.setForeground(new Color(169, 169, 169));
        bConsultarEstoque.setBorderPainted(false);
        add(bConsultarEstoque);

        lServicos = new JLabel("Serviços");
        lServicos.setBounds(420, 370, 300, 60);
        lServicos.setFont(new Font("Arial", Font.PLAIN, 30));
        lServicos.setForeground(new Color(70, 130, 180));
        add(lServicos);

        bCadastroServico = new JButton("Cadastro");
        // bGerenciamento.setIcon(defaultIcon);
        bCadastroServico.setBounds(355, 440, 330, 30);
        bCadastroServico.setFont(new Font("Arial", Font.PLAIN, 25));
        bCadastroServico.setForeground(new Color(169, 169, 169));
        bCadastroServico.setBorderPainted(false);
        add(bCadastroServico);

        bEditarServico = new JButton("Editar");
        // bGerenciamento.setIcon(defaultIcon);
        bEditarServico.setBounds(355, 490, 300, 30);
        bEditarServico.setFont(new Font("Arial", Font.PLAIN, 25));
        bEditarServico.setForeground(new Color(169, 169, 169));
        bEditarServico.setBorderPainted(false);
        add(bEditarServico);

        bExcluirServico = new JButton("Excluir");
        // bGerenciamento.setIcon(defaultIcon);
        bExcluirServico.setBounds(355, 540, 310, 30);
        bExcluirServico.setFont(new Font("Arial", Font.PLAIN, 25));
        bExcluirServico.setForeground(new Color(169, 169, 169));
        bExcluirServico.setBorderPainted(false);
        add(bExcluirServico);

        bConsultarServico = new JButton("Consultar");
        // bGerenciamento.setIcon(defaultIcon);
        bConsultarServico.setBounds(355, 590, 340, 30);
        bConsultarServico.setFont(new Font("Arial", Font.PLAIN, 25));
        bConsultarServico.setForeground(new Color(169, 169, 169));
        bConsultarServico.setBorderPainted(false);
        add(bConsultarServico);

        setBounds(550, 0, 820, 720);
        setLayout(null);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bCadastroCliente) {
            PanelCadastroCliente pcadastro = new PanelCadastroCliente();
            panel.setVisible(false); // o que fazer aqui

            frame.getContentPane().add(pcadastro);
            pcadastro.setVisible(true);
        }
    }
}