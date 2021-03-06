package interfaces;

import java.awt.*;
import javax.swing.*;

import stocks.*;

import java.awt.event.*;
import java.util.Scanner;

/**
 * PanelGerenciamento
 */
public class PanelExcluiEstoque extends JPanel implements ActionListener {

	Produto novoProduto;

	private JLabel lEstoque;

	private JLabel lConsultaCodigo;
	private JTextField tConsultaCodigo;

	private JButton bEnviar;
	private JButton bLimpar;

	private JButton bVoltar;

	PanelExcluiEstoque() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lEstoque = new JLabel("");
		lEstoque.setBounds(350, 130, 350, 60);
		lEstoque.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/barcode.png")));
		lEstoque.setForeground(new Color(70, 130, 180));
		add(lEstoque);

		lEstoque = new JLabel("Remoção de Produto");
		lEstoque.setBounds(200, 200, 350, 60);
		lEstoque.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lEstoque.setForeground(new Color(70, 130, 180));
		add(lEstoque);

		lConsultaCodigo = new JLabel("  Código");
		lConsultaCodigo.setBounds(180, 300, 350, 40);
		lConsultaCodigo.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/garbage.png")));
		lConsultaCodigo.setForeground(new Color(128, 128, 128));
		add(lConsultaCodigo);

		tConsultaCodigo = new JTextField("");
		tConsultaCodigo.setBounds(310, 300, 250, 40);
		tConsultaCodigo.setFont(new Font("Arial", Font.PLAIN, 20));
		tConsultaCodigo.setForeground(new Color(92, 92, 92));
		tConsultaCodigo.setDocument(new Tratamento());
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
		bEnviar.setForeground(new Color(0, 128, 128));
		bEnviar.addActionListener(this);
		add(bEnviar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(380, 400, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

			String codStg = tConsultaCodigo.getText();
			int codigo = Integer.parseInt(codStg);

			if (GerenciarEstoques.existe(codigo) == false) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Nenhum produto com este código foi encontrado! \nPor favor, tente outro código válido.", ":(",
						JOptionPane.ERROR_MESSAGE);
				tConsultaCodigo.setText("");

			} else {
				try {
					GerenciarEstoques.RemoverProduto(codigo);
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "O produto foi removido com sucesso! ", ":)",
							JOptionPane.INFORMATION_MESSAGE);

					removeAll();
					PanelGerenciamento pGerenciamento = new PanelGerenciamento();
					setVisible(false);
					Inicio.panelInicio(pGerenciamento);
					pGerenciamento.setVisible(true);

				} catch (Exception e) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
							"Ocorreu um erro ao tentar remover este produto! \nPor favor, verifique todos os dados",
							":(", JOptionPane.ERROR_MESSAGE);
				}
			}

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