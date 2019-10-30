package interfaces;

import java.awt.*;
import javax.swing.*;

import stocks.*;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelExcluiServico extends JPanel implements ActionListener {

	private JLabel lServicos;

	private JLabel lConsultaCodigo;
	private JTextField tConsultaCodigo;

	private JButton bEnviar;
	private JButton bLimpar;

	private JButton bVoltar;

	PanelExcluiServico() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lServicos = new JLabel("");
		lServicos.setBounds(350, 130, 350, 60);
		lServicos.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/productivity.png")));
		lServicos.setForeground(new Color(70, 130, 180));
		add(lServicos);

		lServicos = new JLabel("Remoção de Serviço");
		lServicos.setBounds(200, 200, 350, 60);
		lServicos.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lServicos.setForeground(new Color(70, 130, 180));
		add(lServicos);

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
			long codigo = Long.parseLong(codStg);

			if (GerenciarServicos.existe(codigo) == false) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Nenhum serviço com este código foi encontrado! \nPor favor, tente outro código válido.", ":(",
						JOptionPane.ERROR_MESSAGE);
				tConsultaCodigo.setText("");

			} else {
				try {
					GerenciarServicos.excluirServico(codigo);
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "O seviço foi removido com sucesso! ", ":)",
							JOptionPane.INFORMATION_MESSAGE);

					removeAll();
					PanelGerenciamento pGerenciamento = new PanelGerenciamento();
					setVisible(false);
					Inicio.panelInicio(pGerenciamento);
					pGerenciamento.setVisible(true);

				} catch (Exception e) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
							"Ocorreu um erro ao tentar remover este serviço! \nPor favor, verifique todos os dados",
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