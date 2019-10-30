package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.*;

import java.awt.event.*;

/**
 * PanelGerenciamento
 */
public class PanelEditaFuncionario extends JPanel implements ActionListener {

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

	private JLabel lEndereco;

	private JButton bEnviar;
	private JButton bLimpar;
	private JButton bLimpar1;

	private JButton bVoltar;

	private JButton bEditar;

	private int codigo;

	PanelEditaFuncionario() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lFuncionario = new JLabel("");
		lFuncionario.setBounds(350, 130, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/id-card-2.png")));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

		lFuncionario = new JLabel("Edição de Funcionários");
		lFuncionario.setBounds(200, 200, 350, 60);
		lFuncionario.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lFuncionario.setForeground(new Color(70, 130, 180));
		add(lFuncionario);

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

		Pessoa f = (Funcionario) GerenciarFuncionarios.ConsultarFuncionario(consultaCpf);

		codigo = ((Funcionario) f).getCodigoFuncionario();

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		bVoltar = new JButton("<");
		bVoltar.setBounds(20, 20, 40, 40);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		bVoltar.setForeground(new Color(205, 92, 92));
		bVoltar.addActionListener(this);
		add(bVoltar);

		lFuncionario = new JLabel("Edição de funcionário");
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
		tNome.setText(f.getNome());
		add(tNome);

		lCpf = new JLabel("CPF");
		lCpf.setBounds(370, 160, 350, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);

		long cpfLon = f.getCpf();
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

		long rgLon = f.getRg();
		String rg = String.valueOf(rgLon);

		tRg = new JTextField("");
		tRg.setBounds(630, 160, 80, 40);
		tRg.setDocument(new Tratamento());
		tRg.setText(rg);
		add(tRg);

		lCargo = new JLabel("Cargo");
		lCargo.setBounds(20, 210, 350, 40);
		lCargo.setFont(new Font("Arial", Font.PLAIN, 20));
		lCargo.setForeground(new Color(128, 128, 128));
		add(lCargo);

		tCargo = new JTextField(((Funcionario) f).getCargo());
		tCargo.setBounds(100, 210, 250, 40);
		add(tCargo);

		lValorHora = new JLabel("Valor Hora");
		lValorHora.setBounds(360, 210, 350, 40);
		lValorHora.setFont(new Font("Arial", Font.PLAIN, 20));
		lValorHora.setForeground(new Color(128, 128, 128));
		add(lValorHora);

		double vhDou = ((Funcionario) f).getValorHora();
		String valorHora = String.valueOf(vhDou);

		tValorHora = new JTextField("");
		tValorHora.setBounds(470, 210, 80, 40);
		tValorHora.setDocument(new Tratamento());
		tValorHora.setText(valorHora);
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

		tLogradouro = new JTextField(f.getLogradouro());
		tLogradouro.setBounds(20, 360, 290, 40);
		add(tLogradouro);

		lNumero = new JLabel("Nº");
		lNumero.setBounds(340, 320, 350, 40);
		lNumero.setFont(new Font("Arial", Font.PLAIN, 20));
		lNumero.setForeground(new Color(128, 128, 128));
		add(lNumero);

		long numLon = f.getNumero();
		String numero = String.valueOf(numLon);

		tNumero = new JTextField("");
		tNumero.setBounds(340, 360, 90, 40);
		tNumero.setDocument(new Tratamento());
		tNumero.setText(numero);
		add(tNumero);

		lComplemento = new JLabel("Complemento");
		lComplemento.setBounds(460, 320, 140, 40);
		lComplemento.setFont(new Font("Arial", Font.PLAIN, 20));
		lComplemento.setForeground(new Color(128, 128, 128));
		add(lComplemento);

		tComplemento = new JTextField("");
		tComplemento.setBounds(460, 360, 250, 40);
		tComplemento.setDocument(new Tratamento2());
		tComplemento.setText(f.getComplemento());
		add(tComplemento);

		lCep = new JLabel("CEP");
		lCep.setBounds(20, 410, 350, 40);
		lCep.setFont(new Font("Arial", Font.PLAIN, 20));
		lCep.setForeground(new Color(128, 128, 128));
		add(lCep);

		long cepLon = f.getCep();
		String cep = String.valueOf(cepLon);

		tCep = new JTextField("");
		tCep.setBounds(20, 450, 90, 40);
		tCep.setDocument(new Tratamento());
		tCep.setText(cep);
		add(tCep);

		lBairro = new JLabel("Bairro");
		lBairro.setBounds(140, 410, 350, 40);
		lBairro.setFont(new Font("Arial", Font.PLAIN, 20));
		lBairro.setForeground(new Color(128, 128, 128));
		add(lBairro);

		tBairro = new JTextField("");
		tBairro.setBounds(140, 450, 170, 40);
		tBairro.setDocument(new Tratamento2());
		tBairro.setText(f.getBairro());
		add(tBairro);

		lCidade = new JLabel("Cidade");
		lCidade.setBounds(340, 410, 350, 40);
		lCidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lCidade.setForeground(new Color(128, 128, 128));
		add(lCidade);

		tCidade = new JTextField("");
		tCidade.setBounds(340, 450, 170, 40);
		tCidade.setDocument(new Tratamento2());
		tCidade.setText(f.getCidade());
		add(tCidade);

		lEstado = new JLabel("Estado");
		lEstado.setBounds(540, 410, 140, 40);
		lEstado.setFont(new Font("Arial", Font.PLAIN, 20));
		lEstado.setForeground(new Color(128, 128, 128));
		add(lEstado);

		tEstado = new JTextField("");
		tEstado.setBounds(540, 450, 170, 40);
		tEstado.setDocument(new Tratamento2());
		tEstado.setText(f.getEstado());
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

		tEmail = new JTextField(f.getEmail());
		tEmail.setBounds(20, 600, 290, 40);
		add(tEmail);

		lTelefoneResidencial = new JLabel("Telefone");
		lTelefoneResidencial.setBounds(340, 560, 350, 40);
		lTelefoneResidencial.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneResidencial.setForeground(new Color(128, 128, 128));
		add(lTelefoneResidencial);

		long nrLon = f.getTelefoneResidencial();
		String telefoneResidencial = String.valueOf(nrLon);

		tTelefoneResidencial = new JTextField("");
		tTelefoneResidencial.setBounds(340, 600, 170, 40);
		tTelefoneResidencial.setDocument(new Tratamento());
		tTelefoneResidencial.setText(telefoneResidencial);
		add(tTelefoneResidencial);

		lTelefoneCelular = new JLabel("Celular");
		lTelefoneCelular.setBounds(540, 560, 140, 40);
		lTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lTelefoneCelular.setForeground(new Color(128, 128, 128));
		add(lTelefoneCelular);

		Long ntLon = f.getTelefoneCelular();
		String telefoneCelular = String.valueOf(ntLon);

		tTelefoneCelular = new JTextField("");
		tTelefoneCelular.setBounds(540, 600, 170, 40);
		tTelefoneCelular.setDocument(new Tratamento());
		tTelefoneCelular.setText(telefoneCelular);
		add(tTelefoneCelular);

		bEditar = new JButton("Enviar");
		bEditar.setBounds(530, 660, 180, 60);
		bEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEditar.addActionListener(this);
		bEditar.setForeground(new Color(0, 128, 128));
		add(bEditar);

		bLimpar1 = new JButton("Limpar");
		bLimpar1.setBounds(330, 660, 180, 60);
		bLimpar1.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar1.setForeground(new Color(205, 92, 92));
		bLimpar1.addActionListener(this);
		add(bLimpar1);

		repaint();

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

			removeAll();
			PanelResultadoConsulta();

		}

		if (ae.getSource() == bLimpar) {
			tConsultaCpf.setText("");

		}

		if (ae.getSource() == bLimpar1) {
			tNome.setText("");
			tRg.setText("");
			tCargo.setText("");
			tValorHora.setText("");
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
				Pessoa funcionarioEditado = new Funcionario(codigo);

				String cpfStg = tCpf.getText();
				long cpf = Long.parseLong(cpfStg);
				funcionarioEditado.setCpf(cpf);

				String nome = tNome.getText();
				funcionarioEditado.setNome(nome);

				String cargo = tCargo.getText();
				((Funcionario) funcionarioEditado).setCargo(cargo);

				String vhgStg = tValorHora.getText();
				double valorHora = Double.parseDouble(vhgStg);
				((Funcionario) funcionarioEditado).setValorHora(valorHora);

				String logradouro = tLogradouro.getText();
				funcionarioEditado.setLogradouro(logradouro);

				String logStg = tNumero.getText();
				int numero = Integer.parseInt(logStg);
				funcionarioEditado.setNumero(numero);

				String bairro = tBairro.getText();
				funcionarioEditado.setBairro(bairro);

				String cidade = tCidade.getText();
				funcionarioEditado.setCidade(cidade);

				String estado = tEstado.getText();
				funcionarioEditado.setEstado(estado);

				String rgStg = tRg.getText();
				long rg = Long.parseLong(rgStg);
				funcionarioEditado.setRg(rg);

				String cepStg = tCep.getText();
				long cep = Long.parseLong(cepStg);
				funcionarioEditado.setCep(cep);

				String complemento = tComplemento.getText();
				funcionarioEditado.setComplemento(complemento);

				String telefoneResidencialStg = tTelefoneResidencial.getText();
				long telefoneResidencial = Long.parseLong(telefoneResidencialStg);
				funcionarioEditado.setTelefoneResidencial(telefoneResidencial);

				String telefoneCelularStg = tTelefoneCelular.getText();
				long telefoneCelular = Long.parseLong(telefoneCelularStg);
				funcionarioEditado.setTelefoneCelular(telefoneCelular);

				String email = tEmail.getText();
				funcionarioEditado.setEmail(email);

				GerenciarFuncionarios.editarFuncionario(cpf, funcionarioEditado);

				Component frame = null;
				JOptionPane.showMessageDialog(frame, "O funcionário " + nome + " foi editado com sucesso! ", ":)",
						JOptionPane.INFORMATION_MESSAGE);

				PanelGerenciamento pGerenciamento = new PanelGerenciamento();
				setVisible(false);
				Inicio.panelInicio(pGerenciamento);
				pGerenciamento.setVisible(true);

			} catch (Exception e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Ocorreu um erro ao tentar editar este funcionário! \nPor favor, verifique todos os dados",
						":(", JOptionPane.ERROR_MESSAGE);
			}

		}
	}

}