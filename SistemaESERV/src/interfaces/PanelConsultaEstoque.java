package interfaces;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import stocks.*;

import java.awt.event.*;
import java.util.ArrayList;

/**
 * PanelGerenciamento
 */
public class PanelConsultaEstoque extends JPanel implements ActionListener {

	private JLabel lEstoque;

	ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	private JComboBox<String> jCFuncionarios;

	private JButton bVoltar;

	PanelConsultaEstoque() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lEstoque = new JLabel("Consultar Estoque");
		lEstoque.setBounds(240, 20, 350, 60);
		lEstoque.setFont(new Font("Arial", Font.PLAIN, 30));
		lEstoque.setForeground(new Color(128, 128, 128));
		add(lEstoque);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		String[] colunas = { "Produtos cadastrados" };

		if (GerenciarEstoques.ConsultarProduto() == "") {
			Object[][] dados = { { "Nenhum produto cadastrado ainda!" } };
			JTable tabela = new JTable(dados, colunas);
			add(tabela);
			JScrollPane barraRolagem = new JScrollPane(tabela);
			add(barraRolagem);

			barraRolagem.setBounds(40, 200, 650, 200);
		} else {
			String p = GerenciarEstoques.ConsultarProduto();
			Object[][] dados = { { p } };
			JTable tabela = new JTable(dados, colunas);
			add(tabela);
			JScrollPane barraRolagem = new JScrollPane(tabela);
			add(barraRolagem);

			barraRolagem.setBounds(40, 200, 650, 200);
		}

		jCFuncionarios = new javax.swing.JComboBox<String>();
		jCFuncionarios.setModel(
				new javax.swing.DefaultComboBoxModel<String>(new String[] { "Produtos do estoque cadastrado" }));
		jCFuncionarios.setBounds(40, 350, 650, 300);
		for (int i = 0; i < ProdutosController.getListaDeProdutos().size(); i++) {
			jCFuncionarios.addItem(ProdutosController.getListaDeProdutos().get(i).toString());
		}
		add(jCFuncionarios);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bVoltar) {

			removeAll();
			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		}
	}

}