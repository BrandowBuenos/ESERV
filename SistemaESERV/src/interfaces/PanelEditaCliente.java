package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.*;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelEditaCliente extends JPanel implements ActionListener {

	Cliente novoCliente;

	private JLabel lClientes;

	private JLabel lConsultaCpf;
	private JTextField tConsultaCpf;

	private JLabel lNome;
	private JTextField tNome;

	private JLabel lCpf;
	private JTextField tCpf;

	private JLabel lRg;
	private JTextField tRg;

	private JLabel lLogradouro;
	private JTextField tLogradouro;

	private JLabel lNumero;
	private JTextField tNumero;

	private JLabel lComplemento;
	private JTextField tComplemento;

	private JLabel lCep;
	private JTextField tCep;

	private JLabel lBairro;
	private JTextField tBairro;

	private JLabel lCidade;
	private JTextField tCidade;

	private JLabel lEstado;
	private JTextField tEstado;

	private JLabel lTelefoneResidencial;
	private JTextField tTelefoneResidencial;

	private JLabel lTelefoneCelular;
	private JTextField tTelefoneCelular;

	private JLabel lEmail;
	private JTextField tEmail;

	private JLabel lEndereco;

	private JButton bEnviar;
	private JButton bLimpar;
	private JButton bLimpar1;

	private JButton bVoltar;

	private JButton bEditar;

	PanelEditaCliente() {
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		
		lClientes = new JLabel("");
		lClientes.setBounds(350, 130, 350, 60);
		lClientes.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/user.png")));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lClientes = new JLabel("Edição de Cliente");
		lClientes.setBounds(250, 200, 350, 60);
		lClientes.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lConsultaCpf = new JLabel("  CPF");
		lConsultaCpf.setBounds(180, 300, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCpf = new JTextField("");
		tConsultaCpf.setBounds(280, 300, 280, 40);
		tConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		tConsultaCpf.setForeground(new Color(92, 92, 92));
		tConsultaCpf.setDocument(new Tratamento());
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
		bEnviar.addActionListener(this);
		bEnviar.setForeground(new Color(0, 128, 128));
		add(bEnviar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(380, 400, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);

	}

	void PanelResultadoConsulta() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		String cpfStg = tConsultaCpf.getText();
		long consultaCpf = Long.parseLong(cpfStg);

		Pessoa c = (Cliente) GerenciarClientes.ConsultarCliente(consultaCpf);

		lClientes = new JLabel("Edição de cliente");
		lClientes.setBounds(230, 20, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 30));
		lClientes.setForeground(new Color(128, 128, 128));
		add(lClientes);

		lClientes = new JLabel("Identificação");
		lClientes.setBounds(20, 90, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lNome = new JLabel("Nome");
		lNome.setBounds(20, 160, 350, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		tNome = new JTextField("");
		tNome.setBounds(100, 160, 250, 40);
		tNome.setDocument(new Tratamento2());
		tNome.setText(c.getNome());
		add(tNome);

		lCpf = new JLabel("CPF");
		lCpf.setBounds(370, 160, 350, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);

		long cpfLon = c.getCpf();
		String cpf = String.valueOf(cpfLon);

		tCpf = new JTextField(cpf);
		tCpf.setBounds(430, 160, 120, 40);
		tCpf.setEditable(false);
		tCpf.setEnabled(false);
		add(tCpf);

		lRg = new JLabel("RG");
		lRg.setBounds(580, 160, 350, 40);
		lRg.setFont(new Font("Arial", Font.PLAIN, 20));
		lRg.setForeground(new Color(128, 128, 128));
		add(lRg);

		long rgLon = c.getRg();
		String rg = String.valueOf(rgLon);

		tRg = new JTextField("");
		tRg.setBounds(630, 160, 80, 40);
		tRg.setDocument(new Tratamento());
		tRg.setText(rg);
		add(tRg);

		lClientes = new JLabel("Endereço");
		lClientes.setBounds(20, 220, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lLogradouro = new JLabel("Logradouro");
		lLogradouro.setBounds(20, 280, 350, 40);
		lLogradouro.setFont(new Font("Arial", Font.PLAIN, 20));
		lLogradouro.setForeground(new Color(128, 128, 128));
		add(lLogradouro);

		tLogradouro = new JTextField(c.getLogradouro());
		tLogradouro.setBounds(20, 320, 290, 40);
		add(tLogradouro);

		lNumero = new JLabel("Nº");
		lNumero.setBounds(340, 280, 350, 40);
		lNumero.setFont(new Font("Arial", Font.PLAIN, 20));
		lNumero.setForeground(new Color(128, 128, 128));
		add(lNumero);

		long numLon = c.getNumero();
		String numero = String.valueOf(numLon);

		tNumero = new JTextField("");
		tNumero.setBounds(340, 320, 90, 40);
		tNumero.setDocument(new Tratamento());
		tNumero.setText(numero);
		add(tNumero);

		lComplemento = new JLabel("Complemento");
		lComplemento.setBounds(460, 280, 140, 40);
		lComplemento.setFont(new Font("Arial", Font.PLAIN, 20));
		lComplemento.setForeground(new Color(128, 128, 128));
		add(lComplemento);

		tComplemento = new JTextField("");
		tComplemento.setBounds(460, 320, 250, 40);
		tComplemento.setDocument(new Tratamento2());
		tComplemento.setText(c.getComplemento());
		add(tComplemento);

		lCep = new JLabel("CEP");
		lCep.setBounds(20, 370, 350, 40);
		lCep.setFont(new Font("Arial", Font.PLAIN, 20));
		lCep.setForeground(new Color(128, 128, 128));
		add(lCep);

		long cepLon = c.getCep();
		String cep = String.valueOf(cepLon);

		tCep = new JTextField("");
		tCep.setBounds(20, 410, 90, 40);
		tCep.setDocument(new Tratamento());
		tCep.setText(cep);
		add(tCep);

		lBairro = new JLabel("Bairro");
		lBairro.setBounds(140, 370, 350, 40);
		lBairro.setFont(new Font("Arial", Font.PLAIN, 20));
		lBairro.setForeground(new Color(128, 128, 128));
		add(lBairro);

		tBairro = new JTextField("");
		tBairro.setBounds(140, 410, 170, 40);
		tBairro.setDocument(new Tratamento2());
		tBairro.setText(c.getBairro());
		add(tBairro);

		lCidade = new JLabel("Cidade");
		lCidade.setBounds(340, 370, 350, 40);
		lCidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lCidade.setForeground(new Color(128, 128, 128));
		add(lCidade);

		tCidade = new JTextField("");
		tCidade.setDocument(new Tratamento2());
		tCidade.setText(c.getCidade());
		tCidade.setBounds(340, 410, 170, 40);
		add(tCidade);

		lEstado = new JLabel("Estado");
		lEstado.setBounds(540, 370, 140, 40);
		lEstado.setFont(new Font("Arial", Font.PLAIN, 20));
		lEstado.setForeground(new Color(128, 128, 128));
		add(lEstado);

		tEstado = new JTextField("");
		tEstado.setDocument(new Tratamento2());
		tEstado.setText(c.getEstado());
		tEstado.setBounds(540, 410, 170, 40);
		add(tEstado);

		lClientes = new JLabel("Contato");
		lClientes.setBounds(20, 460, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lEmail = new JLabel("E-mail");
		lEmail.setBounds(20, 520, 200, 40);
		lEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lEmail.setForeground(new Color(128, 128, 128));
		add(lEmail);

		tEmail = new JTextField(c.getEmail());
		tEmail.setBounds(20, 560, 290, 40);
		add(tEmail);

		long nrLon = c.getTelefoneResidencial();
		String telefoneResidencial = String.valueOf(nrLon);

		lTelefoneResidencial = new JLabel("Telefone");
		lTelefoneResidencial.setBounds(340, 520, 350, 40);
		lTelefoneResidencial.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneResidencial.setForeground(new Color(128, 128, 128));
		add(lTelefoneResidencial);

		tTelefoneResidencial = new JTextField("");
		tTelefoneResidencial.setBounds(340, 560, 170, 40);
		tTelefoneResidencial.setDocument(new Tratamento());
		tTelefoneResidencial.setText(telefoneResidencial);
		add(tTelefoneResidencial);

		lTelefoneCelular = new JLabel("Celular");
		lTelefoneCelular.setBounds(540, 520, 140, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);

		long ntLon = c.getTelefoneCelular();
		String telefoneCelular = String.valueOf(ntLon);

		tTelefoneCelular = new JTextField("");
		tTelefoneCelular.setBounds(540, 560, 170, 40);
		tTelefoneCelular.setDocument(new Tratamento());
		tTelefoneCelular.setText(telefoneCelular);
		add(tTelefoneCelular);

		bEditar = new JButton("Enviar");
		bEditar.setBounds(530, 640, 180, 60);
		bEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEditar.addActionListener(this);
		bEditar.setForeground(new Color(0, 128, 128));
		add(bEditar);

		bLimpar1 = new JButton("Limpar");
		bLimpar1.setBounds(330, 640, 180, 60);
		bLimpar1.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar1.setForeground(new Color(205, 92, 92));
		bLimpar1.addActionListener(this);
		add(bLimpar1);

		repaint();

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

			String cpfStg = tConsultaCpf.getText();
			long cpf = Long.parseLong(cpfStg);

			if (GerenciarClientes.existe(cpf) == false) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Nenhum cliente com este CPF foi encontrado! \nPor favor, tente outro cpf válido.", ":(",
						JOptionPane.ERROR_MESSAGE);
				tConsultaCpf.setText("");

			} else {
				removeAll();
				PanelResultadoConsulta();
			}

		}

		if (ae.getSource() == bLimpar) {
			tConsultaCpf.setText("");

		}

		if (ae.getSource() == bLimpar1) {
			tNome.setText("");
			tRg.setText("");
			tCep.setText("");
			tLogradouro.setText("");
			tComplemento.setText("");
			tBairro.setText("");
			tCidade.setText("");
			tEstado.setText("");
			tNumero.setText("");
			tEmail.setText("");
			tTelefoneCelular.setText("");
			tTelefoneResidencial.setText("");

		}

		if (ae.getSource() == bVoltar) {

			removeAll();
			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		}

		if (ae.getSource() == bEditar) {

			try {
				String cpfStg = tCpf.getText();
				long cpf = Long.parseLong(cpfStg);

				String nome = tNome.getText();

				String logradouro = tLogradouro.getText();

				String logStg = tNumero.getText();
				int numero = Integer.parseInt(logStg);

				String bairro = tBairro.getText();

				String cidade = tCidade.getText();

				String estado = tEstado.getText();

				Pessoa novoCliente = new Cliente(nome, cpf, logradouro, numero, bairro, cidade, estado);

				String rgStg = tRg.getText();
				long rg = Long.parseLong(rgStg);
				novoCliente.setRg(rg);

				String cepStg = tCep.getText();
				long cep = Long.parseLong(cepStg);
				novoCliente.setCep(cep);

				String complemento = tComplemento.getText();
				novoCliente.setComplemento(complemento);

				String telefoneResidencialStg = tTelefoneResidencial.getText();
				long telefoneResidencial = Long.parseLong(telefoneResidencialStg);
				novoCliente.setTelefoneResidencial(telefoneResidencial);

				String telefoneCelularStg = tTelefoneCelular.getText();
				long telefoneCelular = Long.parseLong(telefoneCelularStg);
				novoCliente.setTelefoneCelular(telefoneCelular);

				String email = tEmail.getText();
				novoCliente.setEmail(email);

				GerenciarClientes.editarCliente(cpf, novoCliente);
				
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "O cliente " + nome + " foi editado com sucesso! ", ":)",
						JOptionPane.INFORMATION_MESSAGE);

				PanelGerenciamento pGerenciamento = new PanelGerenciamento();
				setVisible(false);
				Inicio.panelInicio(pGerenciamento);
				pGerenciamento.setVisible(true);

			} catch (Exception e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Ocorreu um erro ao tentar editar este cliente! \nPor favor, verifique todos os dados", ":(",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
