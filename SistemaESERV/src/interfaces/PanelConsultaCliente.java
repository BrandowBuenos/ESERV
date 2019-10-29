package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.*;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelConsultaCliente extends JPanel implements ActionListener {

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

	PanelConsultaCliente() {
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lClientes = new JLabel("Consultar Cliente");
		lClientes.setBounds(240, 20, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 30));
		lClientes.setForeground(new Color(128, 128, 128));
		add(lClientes);

		lConsultaCpf = new JLabel("CPF");
		lConsultaCpf.setBounds(200, 120, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCpf = new JTextField("");
		tConsultaCpf.setBounds(300, 120, 280, 40);
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

		String cpfStg = tConsultaCpf.getText();
		long consultaCpf = Long.parseLong(cpfStg);

		Pessoa c = (Cliente) GerenciarClientes.ConsultarCliente(consultaCpf);

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

		lNome = new JLabel("● Nome: " + c.getNome());
		lNome.setBounds(20, 370, 600, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		lCpf = new JLabel("● CPF: " + c.getCpf());
		lCpf.setBounds(20, 400, 350, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);

		lRg = new JLabel("● RG: " + c.getRg());
		lRg.setBounds(20, 430, 350, 40);
		lRg.setFont(new Font("Arial", Font.PLAIN, 20));
		lRg.setForeground(new Color(128, 128, 128));
		add(lRg);

		lClientes = new JLabel("Endereço: ");
		lClientes.setBounds(20, 470, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lCep = new JLabel("● CEP: " + c.getCep()+ " - Endereço: " + c.getLogradouro() + ", Nº " + c.getNumero() + ", " + c.getComplemento());
		lCep.setBounds(20, 520, 650, 40);
		lCep.setFont(new Font("Arial", Font.PLAIN, 20));
		lCep.setForeground(new Color(128, 128, 128));
		add(lCep);

		lEndereco = new JLabel(c.getBairro() + ", " + c.getCidade() + " - " + c.getEstado());
		lEndereco.setBounds(20, 540, 600, 60);
		lEndereco.setFont(new Font("Arial", Font.PLAIN, 20));
		lEndereco.setForeground(new Color(128, 128, 128));
		add(lEndereco);

		lClientes = new JLabel("Contato");
		lClientes.setBounds(20, 600, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lEmail = new JLabel("● E-mail: " + c.getEmail());
		lEmail.setBounds(20, 650, 600, 40);
		lEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lEmail.setForeground(new Color(128, 128, 128));
		add(lEmail);

		lTelefoneResidencial = new JLabel("● Telefone: " + c.getTelefoneResidencial());
		lTelefoneResidencial.setBounds(20, 680, 350, 40);
		lTelefoneResidencial.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneResidencial.setForeground(new Color(128, 128, 128));
		add(lTelefoneResidencial);

		lTelefoneCelular = new JLabel("● Celular: " + c.getTelefoneCelular());
		lTelefoneCelular.setBounds(340, 680, 350, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);

		repaint(); // Repinta

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

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