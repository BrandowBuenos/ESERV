package interfaces;

import java.awt.*;
import javax.swing.*;

import stock.Produto;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelCadastroEstoque extends JPanel implements ActionListener {

	private JLabel lProduto;

	private JLabel lNome;
	private JTextField tNome;

	private JLabel lDescricao;
	private JTextField tDescricao;

	private JLabel lQuantidade;
	private JTextField tQuantidade;

	private JLabel lPrecoUnitario;
	private JTextField tPrecoUnitario;

	private JButton bVoltar;
	private JButton bEnviar;

	private JButton bCadastrar;
	private JButton bLimpar;

	PanelCadastroEstoque() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		lProduto = new JLabel("Cadastro de estoque");
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
		
		lQuantidade = new JLabel("Quantidade");
		lQuantidade.setBounds(20, 310, 350, 40);
		lQuantidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lQuantidade.setForeground(new Color(128, 128, 128));
		add(lQuantidade);

		tQuantidade = new JTextField("");
		tQuantidade.setBounds(20, 350, 140, 40);
		add(tQuantidade);

		lPrecoUnitario = new JLabel("Preço Unitário");
		lPrecoUnitario.setBounds(200, 310, 350, 40);
		lPrecoUnitario.setFont(new Font("Arial", Font.PLAIN, 20));
		lPrecoUnitario.setForeground(new Color(128, 128, 128));
		add(lPrecoUnitario);

		tPrecoUnitario = new JTextField("");
		tPrecoUnitario.setBounds(200, 350, 290, 40);
		add(tPrecoUnitario);

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

			String quantidadeStg = tQuantidade.getText();
			int quantidade = Integer.parseInt(quantidadeStg);

			String precoStg = tPrecoUnitario.getText();
			float preco = Float.parseFloat(precoStg);
			
			Produto novoProduto = new Produto(nome, quantidade, preco);

			String descricao = tDescricao.getText();
			novoProduto.setDescricao(descricao);

			GerenciarEstoques.AdicionarProduto(novoProduto);

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