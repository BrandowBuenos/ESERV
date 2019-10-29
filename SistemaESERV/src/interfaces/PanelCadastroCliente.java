package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.Cliente;
import peoples.Pessoa;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelCadastroCliente extends JPanel implements ActionListener {

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

	private JButton bCadastrar;
	private JButton bEnviar;
	private JButton bLimpar;
	
	private JButton bVoltar;
	
	

	PanelCadastroCliente() {
		
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		
		lClientes = new JLabel("Cadastro de Cliente");
		lClientes.setBounds(240, 200, 350, 60);
		lClientes.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lConsultaCpf = new JLabel("  CPF");
		lConsultaCpf.setBounds(180, 300, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
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
	
	void PanelResultadoConsulta() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		
		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		lClientes = new JLabel("Cadastro de clientes");
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
		add(tNome);

		lCpf = new JLabel("CPF");
		lCpf.setBounds(370, 160, 350, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);
		
		String cpf = tConsultaCpf.getText();

		tCpf = new JTextField(cpf);
		tCpf.setBounds(430, 160, 120, 40);
		add(tCpf);

		lRg = new JLabel("RG");
		lRg.setBounds(580, 160, 350, 40);
		lRg.setFont(new Font("Arial", Font.PLAIN, 20));
		lRg.setForeground(new Color(128, 128, 128));
		add(lRg);

		tRg = new JTextField("");
		tRg.setBounds(630, 160, 80, 40);
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

		tLogradouro = new JTextField("");
		tLogradouro.setBounds(20, 320, 290, 40);
		add(tLogradouro);

		lNumero = new JLabel("Nº");
		lNumero.setBounds(340, 280, 350, 40);
		lNumero.setFont(new Font("Arial", Font.PLAIN, 20));
		lNumero.setForeground(new Color(128, 128, 128));
		add(lNumero);

		tNumero = new JTextField("");
		tNumero.setBounds(340, 320, 90, 40);
		add(tNumero);

		lComplemento = new JLabel("Complemento");
		lComplemento.setBounds(460, 280, 140, 40);
		lComplemento.setFont(new Font("Arial", Font.PLAIN, 20));
		lComplemento.setForeground(new Color(128, 128, 128));
		add(lComplemento);

		tComplemento = new JTextField("");
		tComplemento.setBounds(460, 320, 250, 40);
		add(tComplemento);

		lCep = new JLabel("CEP");
		lCep.setBounds(20, 370, 350, 40);
		lCep.setFont(new Font("Arial", Font.PLAIN, 20));
		lCep.setForeground(new Color(128, 128, 128));
		add(lCep);

		tCep = new JTextField("");
		tCep.setBounds(20, 410, 90, 40);
		add(tCep);

		lBairro = new JLabel("Bairro");
		lBairro.setBounds(140, 370, 350, 40);
		lBairro.setFont(new Font("Arial", Font.PLAIN, 20));
		lBairro.setForeground(new Color(128, 128, 128));
		add(lBairro);

		tBairro = new JTextField("");
		tBairro.setBounds(140, 410, 170, 40);
		add(tBairro);

		lCidade = new JLabel("Cidade");
		lCidade.setBounds(340, 370, 350, 40);
		lCidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lCidade.setForeground(new Color(128, 128, 128));
		add(lCidade);

		tCidade = new JTextField("");
		tCidade.setBounds(340, 410, 170, 40);
		add(tCidade);

		lEstado = new JLabel("Estado");
		lEstado.setBounds(540, 370, 140, 40);
		lEstado.setFont(new Font("Arial", Font.PLAIN, 20));
		lEstado.setForeground(new Color(128, 128, 128));
		add(lEstado);

		tEstado = new JTextField("");
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

		tEmail = new JTextField("");
		tEmail.setBounds(20, 560, 290, 40);
		add(tEmail);

		lTelefoneResidencial = new JLabel("Telefone");
		lTelefoneResidencial.setBounds(340, 520, 350, 40);
		lTelefoneResidencial.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneResidencial.setForeground(new Color(128, 128, 128));
		add(lTelefoneResidencial);

		tTelefoneResidencial = new JTextField("");
		tTelefoneResidencial.setBounds(340, 560, 170, 40);
		add(tTelefoneResidencial);

		lTelefoneCelular = new JLabel("Celular");
		lTelefoneCelular.setBounds(540, 520, 140, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);

		tTelefoneCelular = new JTextField("");
		tTelefoneCelular.setBounds(540, 560, 170, 40);
		add(tTelefoneCelular);

		bCadastrar = new JButton("Cadastrar");
		bCadastrar.setBounds(530, 640, 180, 60);
		bCadastrar.setFont(new Font("Arial", Font.PLAIN, 20));
		bCadastrar.addActionListener(this);
		bCadastrar.setForeground(new Color(0, 128, 128));
		add(bCadastrar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(330, 640, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);
		

		repaint(); 

	}

	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == bEnviar) {

			removeAll();
			PanelResultadoConsulta();

		}

		if (ae.getSource() == bCadastrar) {

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

			GerenciarClientes.AdicionarCliente(novoCliente);
			
			removeAll();
			
			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		
		}

		if (ae.getSource() == bLimpar) {

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