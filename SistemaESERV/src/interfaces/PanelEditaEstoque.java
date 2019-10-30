package interfaces;

import java.awt.*;
import javax.swing.*;

import stocks.*;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelEditaEstoque extends JPanel implements ActionListener {

	private JLabel lEstoque;

	private JLabel lConsultaCpf;
	private JTextField tConsultaCodigo;

	private JLabel lNome;
	private JTextField tNome;

	private JLabel lDescricao;
	private JTextField tDescricao;

	private JLabel lQuantidade;
	private JTextField tQuantidade;

	private JLabel lPrecoUnitario;
	private JTextField tPrecoUnitario;

	private JButton bEnviar;
	private JButton bLimpar;

	private JButton bVoltar;

	private JButton bEditar;

	PanelEditaEstoque() {
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lEstoque = new JLabel("Edição de Estoque");
		lEstoque.setBounds(250, 200, 350, 60);
		lEstoque.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lEstoque.setForeground(new Color(70, 130, 180));
		add(lEstoque);

		lConsultaCpf = new JLabel("  Código");
		lConsultaCpf.setBounds(180, 300, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCodigo = new JTextField("");
		tConsultaCodigo.setBounds(310, 300, 250, 40);
		tConsultaCodigo.setFont(new Font("Arial", Font.PLAIN, 20));
		tConsultaCodigo.setForeground(new Color(92, 92, 92));
		add(tConsultaCodigo);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		bEnviar = new JButton("Enviar");
		bEnviar.setBounds(180, 400, 180, 60);
		bEnviar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEnviar.addActionListener(this);
		bEnviar.setForeground(new Color(0, 128, 128));
		add(bEnviar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(380, 400, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);

	}

	void PanelResultadoConsulta() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		String codStg = tConsultaCodigo.getText();
		int consultaCodigo = Integer.parseInt(codStg);

		Produto p = GerenciarEstoques.ConsultarProduto(consultaCodigo);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		lEstoque = new JLabel("Cadastro de estoque");
		lEstoque.setBounds(230, 20, 350, 60);
		lEstoque.setFont(new Font("Arial", Font.PLAIN, 30));
		lEstoque.setForeground(new Color(128, 128, 128));
		add(lEstoque);

		lEstoque = new JLabel("Identificação");
		lEstoque.setBounds(20, 90, 350, 60);
		lEstoque.setFont(new Font("Arial", Font.PLAIN, 25));
		lEstoque.setForeground(new Color(70, 130, 180));
		add(lEstoque);

		lNome = new JLabel("Nome");
		lNome.setBounds(20, 150, 350, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		tNome = new JTextField(p.getNome());
		tNome.setBounds(20, 190, 320, 40);
		add(tNome);

		lDescricao = new JLabel("Descrição");
		lDescricao.setBounds(380, 150, 350, 40);
		lDescricao.setFont(new Font("Arial", Font.PLAIN, 20));
		lDescricao.setForeground(new Color(128, 128, 128));
		add(lDescricao);

		tDescricao = new JTextField(p.getDescricao());
		tDescricao.setBounds(380, 190, 320, 40);
		add(tDescricao);

		lDescricao = new JLabel("Opções");
		lDescricao.setBounds(20, 250, 350, 60);
		lDescricao.setFont(new Font("Arial", Font.PLAIN, 25));
		lDescricao.setForeground(new Color(70, 130, 180));
		add(lDescricao);

		lQuantidade = new JLabel("Quantidade");
		lQuantidade.setBounds(20, 310, 350, 40);
		lQuantidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lQuantidade.setForeground(new Color(128, 128, 128));
		add(lQuantidade);

		int qtdInt = p.getQuantidade();
		String quantidade = String.valueOf(qtdInt);

		tQuantidade = new JTextField(quantidade);
		tQuantidade.setBounds(20, 350, 140, 40);
		add(tQuantidade);

		lPrecoUnitario = new JLabel("Preço Unitário");
		lPrecoUnitario.setBounds(200, 310, 350, 40);
		lPrecoUnitario.setFont(new Font("Arial", Font.PLAIN, 20));
		lPrecoUnitario.setForeground(new Color(128, 128, 128));
		add(lPrecoUnitario);

		float pUFloat = p.getPrecoUnitario();
		String precoUnitario = String.valueOf(pUFloat);

		tPrecoUnitario = new JTextField(precoUnitario);
		tPrecoUnitario.setBounds(200, 350, 290, 40);
		add(tPrecoUnitario);

		bEditar = new JButton("Enviar");
		bEditar.setBounds(530, 640, 180, 60);
		bEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEditar.addActionListener(this);
		bEditar.setForeground(new Color(0, 128, 128));
		add(bEditar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(350, 640, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);

		repaint();

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

			removeAll();
			PanelResultadoConsulta();

		}

		if (ae.getSource() == bVoltar) {

			removeAll();
			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		}

		if (ae.getSource() == bEditar) {

			String codStg = tConsultaCodigo.getText();
			int codigo = Integer.parseInt(codStg);

			Produto produtoEditado = new Produto(codigo);

			String nome = tNome.getText();
			produtoEditado.setNome(nome);

			String quantidadeStg = tQuantidade.getText();
			int quantidade = Integer.parseInt(quantidadeStg);
			produtoEditado.setQuantidade(quantidade);

			String precoStg = tPrecoUnitario.getText();
			float precoUnitario = Float.parseFloat(precoStg);
			produtoEditado.setPrecoUnitario(precoUnitario);

			String descricao = tDescricao.getText();
			produtoEditado.setDescricao(descricao);

			GerenciarEstoques.EditarProduto(codigo, produtoEditado);

			removeAll();

			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		}
	}

}