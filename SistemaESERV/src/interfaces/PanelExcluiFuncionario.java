package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.*;

import java.awt.event.*;
import java.util.Scanner;

/**
 * PanelGerenciamento
 */
public class PanelExcluiFuncionario extends JPanel implements ActionListener {

	Cliente novoCliente;

	private JLabel lFuncionario;

	private JLabel lConsultaCpf;
	private JTextField tConsultaCpf;

	private JButton bEnviar;
	private JButton bLimpar;

	private JButton bVoltar;

	PanelExcluiFuncionario() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		
		lFuncionario = new JLabel("");
		lFuncionario.setBounds(350, 130, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/id-card-2.png")));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

		lFuncionario = new JLabel("Remoção de Funcionário");
		lFuncionario.setBounds(200, 200, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

		lConsultaCpf = new JLabel("  CPF");
		lConsultaCpf.setBounds(180, 300, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/garbage.png")));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCpf = new JTextField("");
		tConsultaCpf.setBounds(280, 300, 280, 40);
		tConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		tConsultaCpf.setForeground(new Color(92, 92, 92));
		add(tConsultaCpf);

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

	void PainelResultadoConsulta() {
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		
		lFuncionario = new JLabel("Excluir Funcionario");
		lFuncionario.setBounds(280, 20, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.PLAIN, 30));
		lFuncionario.setForeground(new Color(128, 128, 128));
		add(lFuncionario);

		lConsultaCpf = new JLabel("CPF");
		lConsultaCpf.setBounds(200, 130, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCpf = new JTextField("");
		tConsultaCpf.setBounds(300, 130, 200, 40);
		add(tConsultaCpf);

		bEnviar = new JButton("Remover");
		bEnviar.setBounds(200, 200, 180, 60);
		bEnviar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEnviar.addActionListener(this);
		bEnviar.setForeground(new Color(0, 128, 128));
		add(bEnviar);

	}

	void PanelResultadoConsulta() {

		String cpfStg = tConsultaCpf.getText();
		long consultaCpf = Long.parseLong(cpfStg);

		GerenciarFuncionarios.RemoverFuncionario(consultaCpf);

		lFuncionario = new JLabel("Resultado: ");
		lFuncionario.setBounds(20, 280, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.PLAIN, 20));
		lFuncionario.setForeground(new Color(128, 128, 128));
		add(lFuncionario);

		bVoltar = new JButton("Voltar");
		bVoltar.setBounds(400, 600, 180, 60);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

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
	}

}