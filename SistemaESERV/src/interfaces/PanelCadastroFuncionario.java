package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.Funcionario;
import peoples.Pessoa;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelCadastroFuncionario extends JPanel implements ActionListener {

	private JLabel lFuncionario;

	private JLabel lConsultaCpf;
	private JTextField tConsultaCpf;

	private JLabel lNome;
	private JTextField tNome;

	private JLabel lCpf;
	private JTextField tCpf;

	private JLabel lRg;
	private JTextField tRg;

	private JLabel lCargo;
	private JTextField tCargo;

	private JLabel lValorHora;
	private JTextField tValorHora;

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

	private JButton bEnviar;
	private JButton bLimpar;

	private JButton bCadastrar;

	private JButton bVoltar;

	PanelCadastroFuncionario() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lFuncionario = new JLabel("");
		lFuncionario.setBounds(350, 130, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/id-card-2.png")));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

		lFuncionario = new JLabel("Cadastro de Funcionário");
		lFuncionario.setBounds(200, 200, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

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

		lFuncionario = new JLabel("Cadastro de funcionário");
		lFuncionario.setBounds(220, 20, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.PLAIN, 30));
		lFuncionario.setForeground(new Color(128, 128, 128));
		add(lFuncionario);

		lFuncionario = new JLabel("Identificação");
		lFuncionario.setBounds(20, 90, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

		lNome = new JLabel("Nome");
		lNome.setBounds(20, 160, 350, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		tNome = new JTextField("");
		tNome.setBounds(100, 160, 250, 40);
		tNome.setDocument(new Tratamento2());
		add(tNome);

		lCpf = new JLabel("CPF");
		lCpf.setBounds(370, 160, 350, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);

		String cpf = tConsultaCpf.getText();

		tCpf = new JTextField(cpf);
		tCpf.setBounds(430, 160, 120, 40);
		tCpf.setEnabled(false);
		tCpf.setEditable(false);
		add(tCpf);

		lRg = new JLabel("RG");
		lRg.setBounds(580, 160, 350, 40);
		lRg.setFont(new Font("Arial", Font.PLAIN, 20));
		lRg.setForeground(new Color(128, 128, 128));
		add(lRg);

		tRg = new JTextField("");
		tRg.setBounds(630, 160, 80, 40);
		tRg.setDocument(new Tratamento());

		add(tRg);

		lCargo = new JLabel("Cargo");
		lCargo.setBounds(20, 210, 350, 40);
		lCargo.setFont(new Font("Arial", Font.PLAIN, 20));
		lCargo.setForeground(new Color(128, 128, 128));
		tNome.setDocument(new Tratamento2());
		add(lCargo);

		tCargo = new JTextField("");
		tCargo.setBounds(100, 210, 250, 40);
		add(tCargo);

		lValorHora = new JLabel("Valor Hora");
		lValorHora.setBounds(360, 210, 350, 40);
		lValorHora.setFont(new Font("Arial", Font.PLAIN, 20));
		lValorHora.setForeground(new Color(128, 128, 128));
		add(lValorHora);

		tValorHora = new JTextField("");
		tValorHora.setBounds(470, 210, 80, 40);
		tValorHora.setDocument(new Tratamento());
		add(tValorHora);

		lFuncionario = new JLabel("Endereço");
		lFuncionario.setBounds(20, 260, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

		lLogradouro = new JLabel("Logradouro");
		lLogradouro.setBounds(20, 320, 350, 40);
		lLogradouro.setFont(new Font("Arial", Font.PLAIN, 20));
		lLogradouro.setForeground(new Color(128, 128, 128));
		add(lLogradouro);

		tLogradouro = new JTextField("");
		tLogradouro.setBounds(20, 360, 290, 40);
		add(tLogradouro);

		lNumero = new JLabel("Nº");
		lNumero.setBounds(340, 320, 350, 40);
		lNumero.setFont(new Font("Arial", Font.PLAIN, 20));
		lNumero.setForeground(new Color(128, 128, 128));
		add(lNumero);

		tNumero = new JTextField("");
		tNumero.setBounds(340, 360, 90, 40);
		tNumero.setDocument(new Tratamento());
		add(tNumero);

		lComplemento = new JLabel("Complemento");
		lComplemento.setBounds(460, 320, 140, 40);
		lComplemento.setFont(new Font("Arial", Font.PLAIN, 20));
		lComplemento.setForeground(new Color(128, 128, 128));
		add(lComplemento);

		tComplemento = new JTextField("");
		tComplemento.setBounds(460, 360, 250, 40);
		tComplemento.setDocument(new Tratamento2());
		add(tComplemento);

		lCep = new JLabel("CEP");
		lCep.setBounds(20, 410, 350, 40);
		lCep.setFont(new Font("Arial", Font.PLAIN, 20));
		lCep.setForeground(new Color(128, 128, 128));
		add(lCep);

		tCep = new JTextField("");
		tCep.setBounds(20, 450, 90, 40);
		tCep.setDocument(new Tratamento());
		add(tCep);

		lBairro = new JLabel("Bairro");
		lBairro.setBounds(140, 410, 350, 40);
		lBairro.setFont(new Font("Arial", Font.PLAIN, 20));
		lBairro.setForeground(new Color(128, 128, 128));
		add(lBairro);

		tBairro = new JTextField("");
		tBairro.setBounds(140, 450, 170, 40);
		tBairro.setDocument(new Tratamento2());
		add(tBairro);

		lCidade = new JLabel("Cidade");
		lCidade.setBounds(340, 410, 350, 40);
		lCidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lCidade.setForeground(new Color(128, 128, 128));
		add(lCidade);

		tCidade = new JTextField("");
		tCidade.setBounds(340, 450, 170, 40);
		tCidade.setDocument(new Tratamento2());
		add(tCidade);

		lEstado = new JLabel("Estado");
		lEstado.setBounds(540, 410, 140, 40);
		lEstado.setFont(new Font("Arial", Font.PLAIN, 20));
		lEstado.setForeground(new Color(128, 128, 128));
		add(lEstado);

		tEstado = new JTextField("");
		tEstado.setBounds(540, 450, 170, 40);
		tEstado.setDocument(new Tratamento2());
		add(tEstado);

		lFuncionario = new JLabel("Contato");
		lFuncionario.setBounds(20, 500, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.PLAIN, 25));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

		lEmail = new JLabel("E-mail");
		lEmail.setBounds(20, 560, 200, 40);
		lEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lEmail.setForeground(new Color(128, 128, 128));
		add(lEmail);

		tEmail = new JTextField("");
		tEmail.setBounds(20, 600, 290, 40);
		add(tEmail);

		lTelefoneResidencial = new JLabel("Telefone");
		lTelefoneResidencial.setBounds(340, 560, 350, 40);
		lTelefoneResidencial.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneResidencial.setForeground(new Color(128, 128, 128));
		add(lTelefoneResidencial);

		tTelefoneResidencial = new JTextField("");
		tTelefoneResidencial.setBounds(340, 600, 170, 40);
		tTelefoneResidencial.setDocument(new Tratamento());
		add(tTelefoneResidencial);

		lTelefoneCelular = new JLabel("Celular");
		lTelefoneCelular.setBounds(540, 560, 140, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);

		tTelefoneCelular = new JTextField("");
		tTelefoneCelular.setBounds(540, 600, 170, 40);
		tTelefoneCelular.setDocument(new Tratamento());
		add(tTelefoneCelular);

		bCadastrar = new JButton("Enviar");
		bCadastrar.setBounds(530, 660, 180, 60);
		bCadastrar.setFont(new Font("Arial", Font.PLAIN, 20));
		bCadastrar.addActionListener(this);
		bCadastrar.setForeground(new Color(0, 128, 128));
		add(bCadastrar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(330, 660, 180, 60);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);

		repaint();

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

			String cpfStg = tConsultaCpf.getText();
			long cpf = Long.parseLong(cpfStg);

			if (GerenciarFuncionarios.existe(cpf) == true) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Este CPF já foi cadastrado! \nPor favor, tente outro cpf válido.", ":(",
						JOptionPane.ERROR_MESSAGE);
				tConsultaCpf.setText("");

			} else {
				removeAll();
				PanelResultadoConsulta();
			}

		}

		if (ae.getSource() == bCadastrar) {

			try {
				String cpfStg = tCpf.getText();
				long cpf = Long.parseLong(cpfStg);

				String nome = tNome.getText();

				String cargo = tCargo.getText();

				String valhStg = tValorHora.getText();
				int valorHora = Integer.parseInt(valhStg);

				String logradouro = tLogradouro.getText();

				String numStg = tNumero.getText();
				int numero = Integer.parseInt(numStg);

				String bairro = tBairro.getText();

				String cidade = tCidade.getText();

				String estado = tEstado.getText();

				Pessoa novoFuncionario = new Funcionario(nome, cpf, cargo, valorHora, logradouro, numero, bairro,
						cidade, estado);

				String rgStg = tRg.getText();
				long rg = Long.parseLong(rgStg);
				novoFuncionario.setRg(rg);

				String cepStg = tCep.getText();
				long cep = Long.parseLong(cepStg);
				novoFuncionario.setCep(cep);

				String complemento = tComplemento.getText();
				novoFuncionario.setComplemento(complemento);

				String telefoneResidencialStg = tTelefoneResidencial.getText();
				long telefoneResidencial = Long.parseLong(telefoneResidencialStg);
				novoFuncionario.setTelefoneResidencial(telefoneResidencial);

				String telefoneCelularStg = tTelefoneCelular.getText();
				long telefoneCelular = Long.parseLong(telefoneCelularStg);
				novoFuncionario.setTelefoneCelular(telefoneCelular);

				String email = tEmail.getText();
				novoFuncionario.setEmail(email);

				GerenciarFuncionarios.AdicionarFuncionario(novoFuncionario);

				Component frame = null;
				JOptionPane.showMessageDialog(frame, "O funcionário " + nome + " foi cadastrado com sucesso! ", ":)",
						JOptionPane.INFORMATION_MESSAGE);

				removeAll();

				PanelGerenciamento pGerenciamento = new PanelGerenciamento();
				setVisible(false);
				Inicio.panelInicio(pGerenciamento);
				pGerenciamento.setVisible(true);

			} catch (Exception e) {

				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Ocorreu um erro ao tentar cadastrar o funcionário! \nPor favor, verifique todos os dados",
						":(", JOptionPane.ERROR_MESSAGE);
			}

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