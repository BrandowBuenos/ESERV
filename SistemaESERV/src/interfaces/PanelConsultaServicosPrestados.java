package interfaces;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import services.ServicoPrestado;
import services.ServicosPrestadosController;
import stocks.*;

import java.awt.event.*;
import java.util.ArrayList;

/**
 * PanelGerenciamento
 */
public class PanelConsultaServicosPrestados extends JPanel implements ActionListener {

	private JLabel lEstoque;

	private JButton bEnviar;
	private JButton bLimpar;

	ArrayList<ServicoPrestado> listaDeServicosPrestados = new ArrayList<ServicoPrestado>();
	private JComboBox<String> jCFuncionarios;

	private JButton bVoltar;

	PanelConsultaServicosPrestados() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lEstoque = new JLabel("Consultar Serviços Prestados");
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

		jCFuncionarios = new javax.swing.JComboBox<String>();
		jCFuncionarios.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Estoque" }));
		jCFuncionarios.setBounds(20, 250, 400, 300);
		for (int i = 0; i < ServicosPrestadosController.getListaDeServicosPrestados().size(); i++) {
			jCFuncionarios.addItem(ServicosPrestadosController.getListaDeServicosPrestados().get(i).toString());
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