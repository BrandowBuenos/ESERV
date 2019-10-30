package interfaces;

import java.awt.*;
import javax.swing.*;

import services.ServicosController;
import stocks.ProdutosController;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelConsultaServico extends JPanel implements ActionListener {

	private JLabel lEstoque;

	private JComboBox<String> jCServicos;

	private JButton bVoltar;

	PanelConsultaServico() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lEstoque = new JLabel("Consultar Servico");
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

		String[] colunas = { "Serviços cadastrados" };

		if (GerenciarServicos.consultarServico() == "") {
			Object[][] dados = { { "Nenhum serviço cadastrado ainda!" } };
			JTable tabela = new JTable(dados, colunas);
			add(tabela);
			JScrollPane barraRolagem = new JScrollPane(tabela);
			add(barraRolagem);

			barraRolagem.setBounds(40, 200, 650, 200);
		} else {
			String s = GerenciarServicos.consultarServico();
			Object[][] dados = { { s } };
			JTable tabela = new JTable(dados, colunas);
			add(tabela);
			JScrollPane barraRolagem = new JScrollPane(tabela);
			add(barraRolagem);

			barraRolagem.setBounds(40, 200, 650, 200);
		}

		jCServicos = new javax.swing.JComboBox<String>();
		jCServicos.setModel(
				new javax.swing.DefaultComboBoxModel<String>(new String[] { "Serviços cadastrado" }));
		jCServicos.setBounds(40, 350, 650, 300);
		for (int i = 0; i < ServicosController.getListaDeServicos().size(); i++) {
			jCServicos.addItem(ServicosController.getListaDeServicos().get(i).toString());
		}
		add(jCServicos);
		
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