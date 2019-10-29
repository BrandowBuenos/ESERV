package interfaces;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelConsultaServico extends JPanel implements ActionListener {

	private JLabel lEstoque;

	private JButton bEnviar;
	private JButton bLimpar;

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

		String[] colunas = { "Nome" };

		
		String s = GerenciarServicos.consultarServico();
		
		Object[][] dados = { { s }};

		JTable tabela = new JTable(dados, colunas);
		add(tabela);
		
		JScrollPane barraRolagem = new JScrollPane(tabela);
		add(barraRolagem);
		
		barraRolagem.setBounds(40, 200, 650, 200);

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