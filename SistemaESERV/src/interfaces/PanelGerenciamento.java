package interfaces;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelGerenciamento extends JPanel implements ActionListener {

	private JLabel lClientes;
	private JButton bCadastroCliente;
	private JButton bConsultarCliente;
	private JButton bEditarCliente;
	private JButton bExcluirCliente;

	private JLabel lFuncionarios;
	private JButton bCadastroFuncionario;
	private JButton bConsultarFuncionario;
	private JButton bEditarFuncionario;
	private JButton bExcluirFuncionario;

	private JLabel lEstoque;
	private JButton bCadastroEstoque;
	private JButton bConsultarEstoque;
	private JButton bEditarEstoque;
	private JButton bExcluirEstoque;

	private JLabel lServicos;
	private JButton bCadastroServico;
	private JButton bConsultarServico;
	private JButton bEditarServico;
	private JButton bExcluirServico;

	private JButton bVoltar;

	PanelGerenciamento() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		lClientes = new JLabel("");
		lClientes.setBounds(140, 50, 350, 60);
		lClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/user.png")));
		add(lClientes);

		lClientes = new JLabel("Clientes");
		lClientes.setBounds(90, 100, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 30));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		bCadastroCliente = new JButton("  Cadastro");
		bCadastroCliente.setBounds(0, 170, 330, 30);
		bCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
		bCadastroCliente.setFont(new Font("Arial", Font.PLAIN, 25));
		bCadastroCliente.setForeground(new Color(169, 169, 169));
		bCadastroCliente.setBorderPainted(false);
		bCadastroCliente.addActionListener(this);
		add(bCadastroCliente);

		bConsultarCliente = new JButton("  Consultar");
		bConsultarCliente.setBounds(0, 220, 340, 30);
		bConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/search-2.png")));
		bConsultarCliente.setFont(new Font("Arial", Font.PLAIN, 25));
		bConsultarCliente.setForeground(new Color(169, 169, 169));
		bConsultarCliente.addActionListener(this);
		bConsultarCliente.setBorderPainted(false);
		add(bConsultarCliente);

		bEditarCliente = new JButton("  Editar");
		bEditarCliente.setBounds(0, 270, 300, 30);
		bEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		bEditarCliente.setFont(new Font("Arial", Font.PLAIN, 25));
		bEditarCliente.setForeground(new Color(169, 169, 169));
		bEditarCliente.addActionListener(this);
		bEditarCliente.setBorderPainted(false);
		add(bEditarCliente);

		bExcluirCliente = new JButton("  Excluir");
		bExcluirCliente.setBounds(0, 320, 310, 30);
		bExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/garbage.png")));
		bExcluirCliente.setFont(new Font("Arial", Font.PLAIN, 25));
		bExcluirCliente.setForeground(new Color(169, 169, 169));
		bExcluirCliente.addActionListener(this);
		bExcluirCliente.setBorderPainted(false);
		add(bExcluirCliente);

		lClientes = new JLabel("");
		lClientes.setBounds(490, 50, 350, 60);
		lClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/id-card-2.png")));
		add(lClientes);

		lFuncionarios = new JLabel("Funcionários");
		lFuncionarios.setBounds(420, 100, 300, 60);
		lFuncionarios.setFont(new Font("Arial", Font.PLAIN, 30));
		lFuncionarios.setForeground(new Color(70, 130, 180));
		add(lFuncionarios);

		bCadastroFuncionario = new JButton("  Cadastro");
		bCadastroFuncionario.setBounds(330, 170, 330, 30);
		bCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
		bCadastroFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
		bCadastroFuncionario.setForeground(new Color(169, 169, 169));
		bCadastroFuncionario.setBorderPainted(false);
		bCadastroFuncionario.addActionListener(this);
		add(bCadastroFuncionario);

		bConsultarFuncionario = new JButton("  Consultar");
		bConsultarFuncionario.setBounds(330, 220, 340, 30);
		bConsultarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/search-2.png")));
		bConsultarFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
		bConsultarFuncionario.setForeground(new Color(169, 169, 169));
		bConsultarFuncionario.setBorderPainted(false);
		bConsultarFuncionario.addActionListener(this);
		add(bConsultarFuncionario);

		bEditarFuncionario = new JButton("  Editar");
		bEditarFuncionario.setBounds(330, 270, 300, 30);
		bEditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		bEditarFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
		bEditarFuncionario.setForeground(new Color(169, 169, 169));
		bEditarFuncionario.setBorderPainted(false);
		bEditarFuncionario.addActionListener(this);
		add(bEditarFuncionario);

		bExcluirFuncionario = new JButton("  Excluir");
		bExcluirFuncionario.setBounds(330, 320, 310, 30);
		bExcluirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/garbage.png")));
		bExcluirFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
		bExcluirFuncionario.setForeground(new Color(169, 169, 169));
		bExcluirFuncionario.setBorderPainted(false);
		bExcluirFuncionario.addActionListener(this);
		add(bExcluirFuncionario);

		lClientes = new JLabel("");
		lClientes.setBounds(140, 380, 350, 60);
		lClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/barcode.png")));
		add(lClientes);

		lEstoque = new JLabel("Estoque");
		lEstoque.setBounds(90, 430, 300, 60);
		lEstoque.setFont(new Font("Arial", Font.PLAIN, 30));
		lEstoque.setForeground(new Color(70, 130, 180));
		add(lEstoque);

		bCadastroEstoque = new JButton("  Cadastro");
		bCadastroEstoque.setBounds(0, 500, 330, 30);
		bCadastroEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
		bCadastroEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
		bCadastroEstoque.setForeground(new Color(169, 169, 169));
		bCadastroEstoque.setBorderPainted(false);
		bCadastroEstoque.addActionListener(this);
		add(bCadastroEstoque);

		bConsultarEstoque = new JButton("  Consultar");
		bConsultarEstoque.setBounds(0, 550, 340, 30);
		bConsultarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/search-2.png")));
		bConsultarEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
		bConsultarEstoque.setForeground(new Color(169, 169, 169));
		bConsultarEstoque.setBorderPainted(false);
		bConsultarEstoque.addActionListener(this);
		add(bConsultarEstoque);

		bEditarEstoque = new JButton("  Editar");
		bEditarEstoque.setBounds(0, 600, 300, 30);
		bEditarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		bEditarEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
		bEditarEstoque.setForeground(new Color(169, 169, 169));
		bEditarEstoque.setBorderPainted(false);
		bEditarEstoque.addActionListener(this);
		add(bEditarEstoque);

		bExcluirEstoque = new JButton("  Excluir");
		bExcluirEstoque.setBounds(0, 650, 310, 30);
		bExcluirEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/garbage.png")));
		bExcluirEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
		bExcluirEstoque.setForeground(new Color(169, 169, 169));
		bExcluirEstoque.setBorderPainted(false);
		bExcluirEstoque.addActionListener(this);
		add(bExcluirEstoque);

		lClientes = new JLabel("");
		lClientes.setBounds(490, 380, 350, 60);
		lClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/productivity.png")));
		add(lClientes);

		lServicos = new JLabel("Serviços");
		lServicos.setBounds(420, 430, 300, 60);
		lServicos.setFont(new Font("Arial", Font.PLAIN, 30));
		lServicos.setForeground(new Color(70, 130, 180));
		add(lServicos);

		bCadastroServico = new JButton("  Cadastro");
		bCadastroServico.setBounds(330, 500, 330, 30);
		bCadastroServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
		bCadastroServico.setFont(new Font("Arial", Font.PLAIN, 25));
		bCadastroServico.setForeground(new Color(169, 169, 169));
		bCadastroServico.setBorderPainted(false);
		bCadastroServico.addActionListener(this);
		add(bCadastroServico);

		bConsultarServico = new JButton("  Consultar");
		bConsultarServico.setBounds(330, 550, 340, 30);
		bConsultarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/search-2.png")));
		bConsultarServico.setFont(new Font("Arial", Font.PLAIN, 25));
		bConsultarServico.setForeground(new Color(169, 169, 169));
		bConsultarServico.setBorderPainted(false);
		bConsultarServico.addActionListener(this);
		add(bConsultarServico);

		bEditarServico = new JButton("  Editar");
		bEditarServico.setBounds(330, 600, 300, 30);
		bEditarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		bEditarServico.setFont(new Font("Arial", Font.PLAIN, 25));
		bEditarServico.setForeground(new Color(169, 169, 169));
		bEditarServico.setBorderPainted(false);
		bEditarServico.addActionListener(this);
		add(bEditarServico);

		bExcluirServico = new JButton("  Excluir");
		bExcluirServico.setBounds(330, 650, 310, 30);
		bExcluirServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/garbage.png")));
		bExcluirServico.setFont(new Font("Arial", Font.PLAIN, 25));
		bExcluirServico.setForeground(new Color(169, 169, 169));
		bExcluirServico.setBorderPainted(false);
		bExcluirServico.addActionListener(this);
		add(bExcluirServico);

		setBounds(550, 00, 820, 768);
		setLayout(null);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bCadastroCliente) {

			PanelCadastroCliente pCadastroCliente = new PanelCadastroCliente();
			setVisible(false);
			Inicio.panelInicio(pCadastroCliente);
			pCadastroCliente.setVisible(true);
		}

		if (ae.getSource() == bConsultarCliente) {

			PanelConsultaCliente pConsultaCliente = new PanelConsultaCliente();
			setVisible(false);
			Inicio.panelInicio(pConsultaCliente);
			pConsultaCliente.setVisible(true);

		}

		if (ae.getSource() == bEditarCliente) {

			PanelEditaCliente pEditaCliente = new PanelEditaCliente();
			setVisible(false);
			Inicio.panelInicio(pEditaCliente);
			pEditaCliente.setVisible(true);
		}

		if (ae.getSource() == bExcluirCliente) {

			PanelExcluiCliente pExcluiCliente = new PanelExcluiCliente();
			setVisible(false);
			Inicio.panelInicio(pExcluiCliente);
			pExcluiCliente.setVisible(true);
		}

		if (ae.getSource() == bCadastroFuncionario) {

			PanelCadastroFuncionario pCadastroFuncionario = new PanelCadastroFuncionario();
			setVisible(false);
			Inicio.panelInicio(pCadastroFuncionario);
			pCadastroFuncionario.setVisible(true);
		}

		if (ae.getSource() == bConsultarFuncionario) {

			PanelConsultaFuncionario pConsultaFuncionario = new PanelConsultaFuncionario();
			setVisible(false);
			Inicio.panelInicio(pConsultaFuncionario);
			pConsultaFuncionario.setVisible(true);
		}

		if (ae.getSource() == bEditarFuncionario) {

			PanelEditaFuncionario pEditaFuncionario = new PanelEditaFuncionario();
			setVisible(false);
			Inicio.panelInicio(pEditaFuncionario);
			pEditaFuncionario.setVisible(true);
		}

		if (ae.getSource() == bExcluirFuncionario) {

			PanelExcluiFuncionario pExcluiFuncionario = new PanelExcluiFuncionario();
			setVisible(false);
			Inicio.panelInicio(pExcluiFuncionario);
			pExcluiFuncionario.setVisible(true);
		}

		if (ae.getSource() == bCadastroEstoque) {

			PanelCadastroEstoque pCadastroEstoque = new PanelCadastroEstoque();
			setVisible(false);
			Inicio.panelInicio(pCadastroEstoque);
			pCadastroEstoque.setVisible(true);
		}

		if (ae.getSource() == bConsultarEstoque) {

			PanelConsultaEstoque pConsultaEstoque = new PanelConsultaEstoque();
			setVisible(false);
			Inicio.panelInicio(pConsultaEstoque);
			pConsultaEstoque.setVisible(true);
		}

		if (ae.getSource() == bEditarEstoque) {

			PanelEditaEstoque pEditaEstoque = new PanelEditaEstoque();
			setVisible(false);
			Inicio.panelInicio(pEditaEstoque);
			pEditaEstoque.setVisible(true);
		}

		if (ae.getSource() == bExcluirEstoque) {

			PanelExcluiEstoque pExcluiEstoque = new PanelExcluiEstoque();
			setVisible(false);
			Inicio.panelInicio(pExcluiEstoque);
			pExcluiEstoque.setVisible(true);
		}

		if (ae.getSource() == bCadastroServico) {

			PanelCadastroServico pCadastroServico = new PanelCadastroServico();
			setVisible(false);
			Inicio.panelInicio(pCadastroServico);
			pCadastroServico.setVisible(true);
		}

		if (ae.getSource() == bConsultarServico) {

			PanelConsultaServico pConsultaServico = new PanelConsultaServico();
			setVisible(false);
			Inicio.panelInicio(pConsultaServico);
			pConsultaServico.setVisible(true);
		}

		if (ae.getSource() == bEditarServico) {

			PanelEditaServico pEditaServico = new PanelEditaServico();
			setVisible(false);
			Inicio.panelInicio(pEditaServico);
			pEditaServico.setVisible(true);
		}

		if (ae.getSource() == bExcluirServico) {

			PanelExcluiServico pExcluiServico = new PanelExcluiServico();
			setVisible(false);
			Inicio.panelInicio(pExcluiServico);
			pExcluiServico.setVisible(true);
		}

		if (ae.getSource() == bVoltar) {

			PanelPrestacaoConta pPrestacaoConta = new PanelPrestacaoConta();
			setVisible(false);
			Inicio.panelInicio(pPrestacaoConta);
			pPrestacaoConta.setVisible(true);
		}

	}

}