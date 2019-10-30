package interfaces;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * PanelPrestacaoConta
 */
public class PanelPrestacaoConta extends JPanel implements ActionListener {

	private JLabel lServicosPrestados;
	private JButton bCadastroServicoPrestado;
	private JButton bEditarServicoPrestado;
	private JButton bExcluirServicoPrestado;
	private JButton bConsultarServicoPrestado;
	private JButton bVoltar;

	PanelPrestacaoConta() {
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		
		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		lServicosPrestados = new JLabel("");
		lServicosPrestados.setBounds(360, 50, 350, 60);
		lServicosPrestados.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/map.png")));
		add(lServicosPrestados);

		lServicosPrestados = new JLabel("Serviços prestados");
		lServicosPrestados.setBounds(250, 100, 350, 60);
		lServicosPrestados.setFont(new Font("Arial", Font.PLAIN, 30));
		lServicosPrestados.setForeground(new Color(70, 130, 180));
		add(lServicosPrestados);

		bCadastroServicoPrestado = new JButton("  Cadastro");
		bCadastroServicoPrestado.setBounds(0, 170, 200, 30);
		bCadastroServicoPrestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
		bCadastroServicoPrestado.setFont(new Font("Arial", Font.PLAIN, 25));
		bCadastroServicoPrestado.setForeground(new Color(169, 169, 169));
		bCadastroServicoPrestado.setBorderPainted(false);
		bCadastroServicoPrestado.addActionListener(this);
		add(bCadastroServicoPrestado);

		bConsultarServicoPrestado = new JButton("  Consultar");
		bConsultarServicoPrestado.setBounds(190, 170, 200, 30);
		bConsultarServicoPrestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/search-2.png")));
		bConsultarServicoPrestado.setFont(new Font("Arial", Font.PLAIN, 25));
		bConsultarServicoPrestado.setForeground(new Color(169, 169, 169));
		bConsultarServicoPrestado.addActionListener(this);
		bConsultarServicoPrestado.setBorderPainted(false);
		add(bConsultarServicoPrestado);

		bEditarServicoPrestado = new JButton("  Editar");
		bEditarServicoPrestado.setBounds(360, 170, 200, 30);
		bEditarServicoPrestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		bEditarServicoPrestado.setFont(new Font("Arial", Font.PLAIN, 25));
		bEditarServicoPrestado.setForeground(new Color(169, 169, 169));
		bEditarServicoPrestado.addActionListener(this);
		bEditarServicoPrestado.setBorderPainted(false);
		add(bEditarServicoPrestado);

		bExcluirServicoPrestado = new JButton("  Excluir");
		bExcluirServicoPrestado.setBounds(520, 170, 200, 30);
		bExcluirServicoPrestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/garbage.png")));
		bExcluirServicoPrestado.setFont(new Font("Arial", Font.PLAIN, 25));
		bExcluirServicoPrestado.setForeground(new Color(169, 169, 169));
		bExcluirServicoPrestado.addActionListener(this);
		bExcluirServicoPrestado.setBorderPainted(false);
		add(bExcluirServicoPrestado);

		setBounds(550, 00, 820, 768);
		setLayout(null);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bCadastroServicoPrestado) {

			PanelCadastroServicoPrestado pCadastroServicoPrestado = new PanelCadastroServicoPrestado();
			setVisible(false);
			Inicio.panelInicio(pCadastroServicoPrestado);
			pCadastroServicoPrestado.setVisible(true);
			
		}

		if (ae.getSource() == bConsultarServicoPrestado) {

			PanelConsultaServicoPrestado pConsultaServicoPrestado = new PanelConsultaServicoPrestado();
			setVisible(false);
			Inicio.panelInicio(pConsultaServicoPrestado);
			pConsultaServicoPrestado.setVisible(true);

		}

		if (ae.getSource() == bEditarServicoPrestado) {

			PanelEditaCliente pEditaCliente = new PanelEditaCliente();
			setVisible(false);
			Inicio.panelInicio(pEditaCliente);
			pEditaCliente.setVisible(true);
		}

		if (ae.getSource() == bExcluirServicoPrestado) {

			PanelExcluiServicoPrestado pExcluiServicoPrestado = new PanelExcluiServicoPrestado();
			setVisible(false);
			Inicio.panelInicio(pExcluiServicoPrestado);
			pExcluiServicoPrestado.setVisible(true);
		}
		
		if (ae.getSource() == bVoltar) {
			if (ae.getSource() == bVoltar) {

				PanelGerenciamento pGerenciamento = new PanelGerenciamento();
				setVisible(false);
				Inicio.panelInicio(pGerenciamento);
				pGerenciamento.setVisible(true);
			}

		}


	}
}