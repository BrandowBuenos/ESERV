package interfaces;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import peoples.Funcionario;
import peoples.FuncionariosController;
import services.Servico;

import java.util.ArrayList;

/**
 * PanelGerenciamento
 */
public class PanelCadastroServico extends JPanel implements ActionListener {

	private DefaultListModel lista = new DefaultListModel();
	ArrayList<Funcionario> funcionariosAptos = new ArrayList<Funcionario>();

	private JComboBox<String> jCFuncionarios;

	private JLabel lProduto;

	private JLabel lNome;
	private JTextField tNome;

	private JLabel lDescricao;
	private JTextField tDescricao;

	private JLabel lPreco;
	private JTextField tPreco;

	private JButton bVoltar;

	private JButton bCadastrar;
	private JButton bLimpar;

	PanelCadastroServico() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		lProduto = new JLabel("Cadastro de serviço");
		lProduto.setBounds(230, 20, 350, 60);
		lProduto.setFont(new Font("Arial", Font.PLAIN, 30));
		lProduto.setForeground(new Color(128, 128, 128));
		add(lProduto);

		lProduto = new JLabel("Identificação");
		lProduto.setBounds(20, 90, 350, 60);
		lProduto.setFont(new Font("Arial", Font.PLAIN, 25));
		lProduto.setForeground(new Color(70, 130, 180));
		add(lProduto);

		lNome = new JLabel("Nome");
		lNome.setBounds(20, 150, 350, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		tNome = new JTextField("");
		tNome.setBounds(20, 190, 320, 40);
		add(tNome);

		lDescricao = new JLabel("Descrição");
		lDescricao.setBounds(380, 150, 350, 40);
		lDescricao.setFont(new Font("Arial", Font.PLAIN, 20));
		lDescricao.setForeground(new Color(128, 128, 128));
		add(lDescricao);

		tDescricao = new JTextField("");
		tDescricao.setBounds(380, 190, 320, 40);
		add(tDescricao);

		lProduto = new JLabel("Opções");
		lProduto.setBounds(20, 250, 350, 60);
		lProduto.setFont(new Font("Arial", Font.PLAIN, 25));
		lProduto.setForeground(new Color(70, 130, 180));
		add(lProduto);

		lPreco = new JLabel("Preço do serviço");
		lPreco.setBounds(20, 310, 350, 40);
		lPreco.setFont(new Font("Arial", Font.PLAIN, 20));
		lPreco.setForeground(new Color(128, 128, 128));
		add(lPreco);

		tPreco = new JTextField("");
		tPreco.setBounds(20, 350, 140, 40);
		add(tPreco);

		jCFuncionarios = new javax.swing.JComboBox<String>();
		jCFuncionarios.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Funcionários" }));
		jCFuncionarios.setBounds(20, 380, 350, 40);
		for (int i = 0; i < FuncionariosController.getListaFuncionarios().size(); i++) {
			jCFuncionarios.addItem(FuncionariosController.getListaFuncionarios().get(i).getNome());
		}
		add(jCFuncionarios);

		bCadastrar = new JButton("Enviar");
		bCadastrar.setBounds(530, 640, 180, 60);
		bCadastrar.setFont(new Font("Arial", Font.PLAIN, 20));
		bCadastrar.addActionListener(this);
		bCadastrar.setForeground(new Color(0, 128, 128));
		add(bCadastrar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(350, 640, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bCadastrar) {

			String nome = tNome.getText();

			String precoStg = tPreco.getText();
			float preco = Float.parseFloat(precoStg);

			String nomeDoFuncionario = (String) jCFuncionarios.getSelectedItem();

			Funcionario f = (Funcionario) GerenciarFuncionarios.consultarFuncionario(nomeDoFuncionario);

			Servico novoServico = new Servico(nome, preco);

			funcionariosAptos.add(f);

			String descricao = tDescricao.getText();
			novoServico.setDescricao(descricao);

			GerenciarServicos.adicionarServico(novoServico, funcionariosAptos);

			removeAll();

			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		}
		if (ae.getSource() == bLimpar) {

		}

		if (ae.getSource() == bVoltar) {

			removeAll();
			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		}

	}

}