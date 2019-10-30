package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.*;
import services.ServicoPrestado;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelConsultaServicoPrestado extends JPanel implements ActionListener {

	Cliente novoCliente;

	private JLabel lClientes;

	private JLabel lConsultaCpf;
	private JTextField tConsultaCpf;

	private JLabel lNome;
	private JLabel lCpf;
	private JLabel lRg;
	private JLabel lEndereco;
	private JLabel lCep;
	private JLabel lTelefoneResidencial;
	private JLabel lTelefoneCelular;
	private JLabel lEmail;

	private JButton bEnviar;
	private JButton bLimpar;

	private JButton bVoltar;

	PanelConsultaServicoPrestado() {
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		

		lClientes = new JLabel("Consultar Serviços Prestados");
		lClientes.setBounds(220, 20, 550, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(128, 128, 128));
		add(lClientes);

		lConsultaCpf = new JLabel("Código");
		lConsultaCpf.setBounds(200, 120, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCpf = new JTextField("");
		tConsultaCpf.setBounds(300, 120, 280, 40);
		tConsultaCpf.setDocument(new Tratamento());
		add(tConsultaCpf);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		bEnviar = new JButton("Enviar");
		bEnviar.setBounds(200, 200, 180, 60);
		bEnviar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEnviar.addActionListener(this);
		bEnviar.setForeground(new Color(0, 128, 128));
		add(bEnviar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(400, 200, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);

	}

	void PanelResultadoConsulta() {

		String codigoStg = tConsultaCpf.getText();
		long codigo = Long.parseLong(codigoStg);

		ServicoPrestado sp = GerenciarServicosPrestados.consultarServicoPrestado(codigo);

		lClientes = new JLabel("Resultado");
		lClientes.setBounds(320, 280, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 30));
		lClientes.setForeground(new Color(128, 128, 128));
		add(lClientes);

		lClientes = new JLabel("Identificação");
		lClientes.setBounds(20, 320, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lNome = new JLabel("● Código: " + sp.getCodigoServicoPrestado());
		lNome.setBounds(20, 370, 600, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		lCpf = new JLabel("● Cliente: " + sp.getCliente());
		lCpf.setBounds(20, 400, 600, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);

		lRg = new JLabel("● Serviço: " + sp.getServico());
		lRg.setBounds(20, 430, 600, 40);
		lRg.setFont(new Font("Arial", Font.PLAIN, 20));
		lRg.setForeground(new Color(128, 128, 128));
		add(lRg);
		
		lEmail = new JLabel("● Funcionário: " + sp.getFuncionario());
		lEmail.setBounds(20, 460, 600, 40);
		lEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lEmail.setForeground(new Color(128, 128, 128));
		add(lEmail);

		lTelefoneResidencial = new JLabel("● Produtos utilizados: " + sp.getlistaDeProdutosUtilizados());
		lTelefoneResidencial.setBounds(20, 490, 600, 40);
		lTelefoneResidencial.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneResidencial.setForeground(new Color(128, 128, 128));
		add(lTelefoneResidencial);

		lTelefoneCelular = new JLabel("● Data: " + sp.getData());
		lTelefoneCelular.setBounds(20, 520, 600, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);

		
		lTelefoneCelular = new JLabel("● Hora Inicial: " + sp.gethoraInicial());
		lTelefoneCelular.setBounds(20, 560, 600, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);
		
		lTelefoneCelular = new JLabel("● Hora final: " + sp.gethoraFinal());
		lTelefoneCelular.setBounds(20, 590, 600, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);
	

		repaint(); 

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

			String cpfStg = tConsultaCpf.getText();
			long codigo = Long.parseLong(cpfStg);

			if (GerenciarServicosPrestados.existe(codigo) == false) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Nenhum serviço prestado com este código foi encontrado! \nPor favor, tente outro código válido.", ":(",
						JOptionPane.ERROR_MESSAGE);
				tConsultaCpf.setText("");

			} else {
				
				PanelResultadoConsulta();
			}

		}
		

		if (ae.getSource() == bLimpar) {
			tConsultaCpf.setText("");

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