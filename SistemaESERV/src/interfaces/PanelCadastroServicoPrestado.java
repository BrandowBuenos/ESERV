package interfaces;

import java.awt.*;
import javax.swing.*;

import peoples.Cliente;
import peoples.Funcionario;
import peoples.Pessoa;
import services.Servico;
import services.ServicoPrestado;
import services.ServicosController;
import stocks.Produto;
import stocks.ProdutosController;

import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * PanelGerenciamento
 */
public class PanelCadastroServicoPrestado extends JPanel implements ActionListener {

	ArrayList<Servico> listaDeServicos = new ArrayList<Servico>();
	private JComboBox<String> jCServicos;

	ArrayList<ServicoPrestado> listaDeFuncionarios = new ArrayList<ServicoPrestado>();
	private JComboBox<String> jCFuncionariosAptos;

	ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	private JComboBox<String> jCFuncionarios;

	DefaultListModel lm = new DefaultListModel();
	JList list;

	private JLabel lClientes;

	private JLabel lConsultaCpf;
	private JTextField tConsultaCpf;

	private JTextField tConsultaServico;

	private JLabel lNome;
	private JTextField tNome;

	private JLabel lCpf;
	private JTextField tCpf;

	private JLabel lDia;
	private JTextField tDia;

	private JLabel lMes;
	private JTextField tMes;

	private JLabel lAno;
	private JTextField tAno;

	private JLabel lHoraInicial;
	private JTextField tHoraInicial;

	private JLabel lMinutoInicial;
	private JTextField tMinutoInicial;

	private JLabel lHoraFinal;
	private JTextField tHoraFinal;

	private JLabel lMinutoFinal;
	private JTextField tMinutoFinal;

	private JButton bCadastrar;
	private JButton bEnviar;
	private JButton bLimpar;

	private JButton bVoltar;

	private DefaultListModel lista = new DefaultListModel();
	private Component frame;

	PanelCadastroServicoPrestado() {

		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);

		lClientes = new JLabel("");
		lClientes.setBounds(350, 130, 350, 60);
		lClientes.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/map.png")));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lClientes = new JLabel("Cadastro de Serviço Prestado");
		lClientes.setBounds(180, 200, 500, 60);
		lClientes.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lConsultaCpf = new JLabel("  Código Serviço");
		lConsultaCpf.setBounds(180, 280, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaServico = new JTextField("");
		tConsultaServico.setDocument(new Tratamento());
		tConsultaServico.setBounds(380, 280, 180, 40);
		tConsultaServico.setFont(new Font("Arial", Font.PLAIN, 20));
		tConsultaServico.setForeground(new Color(92, 92, 92));
		add(tConsultaServico);

		lConsultaCpf = new JLabel("  CPF do cliente");
		lConsultaCpf.setBounds(180, 330, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-2.png")));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCpf = new JTextField("");
		tConsultaCpf.setDocument(new Tratamento());
		tConsultaCpf.setBounds(380, 330, 180, 40);
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

		lClientes = new JLabel("Cadastro de Serviço Prestado");
		lClientes.setBounds(230, 20, 500, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 30));
		lClientes.setForeground(new Color(128, 128, 128));
		add(lClientes);

		lClientes = new JLabel("Cliente");
		lClientes.setBounds(20, 90, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		String cpfStg = tConsultaCpf.getText();
		long consultaCpf = Long.parseLong(cpfStg);

		Pessoa c = (Cliente) GerenciarClientes.ConsultarCliente(consultaCpf);

		String codStg = tConsultaServico.getText();
		long codigo = Long.parseLong(cpfStg);

		Servico s = GerenciarServicos.consultarServico(codigo);

		lNome = new JLabel("Nome");
		lNome.setBounds(20, 160, 350, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		tNome = new JTextField("");
		tNome.setDocument(new Tratamento2());
		tNome.setBounds(100, 160, 250, 40);
		tNome.setText(c.getNome());
		tNome.setEditable(false);
		tNome.setEnabled(false);
		add(tNome);

		lCpf = new JLabel("CPF");
		lCpf.setBounds(380, 160, 350, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);

		String cpf = tConsultaCpf.getText();

		tCpf = new JTextField("");
		tCpf.setDocument(new Tratamento());
		tCpf.setBounds(460, 160, 250, 40);
		tCpf.setText(cpf);
		tCpf.setEditable(false);
		tCpf.setEnabled(false);
		add(tCpf);

		lClientes = new JLabel("Serviço");
		lClientes.setBounds(20, 220, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		lCpf = new JLabel(s.toString());
		lCpf.setBounds(20, 270, 660, 40);
		lCpf.setFont(new Font("Arial", Font.PLAIN, 15));
		lCpf.setForeground(new Color(128, 128, 128));
		add(lCpf);

		lClientes = new JLabel("Funcionário");
		lClientes.setBounds(20, 320, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		Servico funcionariosAptos = ServicosController.get(codigo);

		jCFuncionariosAptos = new javax.swing.JComboBox<String>();
		jCFuncionariosAptos
				.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Selecione o funcionário" }));
		jCFuncionariosAptos.setBounds(20, 370, 350, 40);
		add(jCFuncionariosAptos);
		if (s.getListaDeFuncionariosAptos().size() > 0) {
			for (int i = 0; i < s.getListaDeFuncionariosAptos().size(); i++) {
				jCFuncionariosAptos.addItem(s.getListaDeFuncionariosAptos().get(i).getNome());
			}
		} else {
			jCFuncionariosAptos.addItem("Nenhum Funcionario Habilitado");
		}

		add(jCFuncionariosAptos);

		lClientes = new JLabel("Produtos");
		lClientes.setBounds(20, 400, 350, 60);
		lClientes.setFont(new Font("Arial", Font.PLAIN, 25));
		lClientes.setForeground(new Color(70, 130, 180));
		add(lClientes);

		list = new JList(lm);

		list.setBounds(20, 450, 600, 60);
	
		for (int i = 0; i < ProdutosController.getListaDeProdutos().size(); i++) {
			lm.addElement(ProdutosController.getListaDeProdutos().get(i).toString());
		}
		add(list);

		lDia = new JLabel("Data do serviço");
		lDia.setBounds(20, 520, 20, 40);
		lDia.setFont(new Font("Arial", Font.PLAIN, 20));
		lDia.setForeground(new Color(128, 128, 128));
		add(lDia);

		tDia = new JTextField("");
		tDia.setDocument(new Tratamento());
		tDia.setBounds(20, 560, 40, 40);
		add(tDia);

		tMes = new JTextField("");
		tMes.setDocument(new Tratamento());
		tMes.setBounds(60, 560, 40, 40);
		add(tMes);

		tAno = new JTextField("");
		tAno.setDocument(new Tratamento());
		tAno.setBounds(100, 560, 60, 40);
		add(tAno);

		lHoraInicial = new JLabel("Hora Inicial");
		lHoraInicial.setBounds(340, 520, 350, 40);
		lHoraInicial.setFont(new Font("Arial", Font.PLAIN, 20));
		lHoraInicial.setForeground(new Color(128, 128, 128));
		add(lHoraInicial);

		tHoraInicial = new JTextField("");
		tHoraInicial.setDocument(new Tratamento());
		tHoraInicial.setBounds(340, 560, 40, 40);
		add(tHoraInicial);

		tMinutoInicial = new JTextField("");
		tMinutoInicial.setDocument(new Tratamento());
		tMinutoInicial.setBounds(380, 560, 40, 40);
		add(tMinutoInicial);

		lHoraFinal = new JLabel("Hora Final");
		lHoraFinal.setBounds(560, 520, 350, 40);
		lHoraFinal.setFont(new Font("Arial", Font.PLAIN, 20));
		lHoraFinal.setForeground(new Color(128, 128, 128));
		add(lHoraFinal);

		tHoraFinal = new JTextField("");
		tHoraFinal.setDocument(new Tratamento());
		tHoraFinal.setBounds(560, 560, 40, 40);
		add(tHoraFinal);

		tMinutoFinal = new JTextField("");
		tMinutoFinal.setDocument(new Tratamento());
		tMinutoFinal.setBounds(600, 560, 40, 40);
		add(tMinutoFinal);

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

			try {

				String cpfStg = tConsultaCpf.getText();
				long consultaCpf = Long.parseLong(cpfStg);

				Pessoa c = (Cliente) GerenciarClientes.ConsultarCliente(consultaCpf);

				String codStg = tConsultaServico.getText();
				long codigo = Long.parseLong(cpfStg);

				Servico s = GerenciarServicos.consultarServico(codigo);

				removeAll();
				PanelResultadoConsulta();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(frame, "CPF ou numero do serviço inválido", ":(",
						JOptionPane.ERROR_MESSAGE);
			}

		}

		if (ae.getSource() == bCadastrar) {

			try {
				String codStg = tConsultaServico.getText();
				long codigo = Long.parseLong(codStg);

				Servico s = GerenciarServicos.consultarServico(codigo);

				String cpfStg = tConsultaCpf.getText();
				long consultaCpf = Long.parseLong(cpfStg);

				Pessoa c = (Cliente) GerenciarClientes.ConsultarCliente(consultaCpf);

				String nomeDoFuncionario = (String) jCFuncionariosAptos.getSelectedItem();

				Funcionario f = (Funcionario) GerenciarFuncionarios.consultarFuncionario(nomeDoFuncionario);

				Calendar cI = Calendar.getInstance();
				String diaIStg = tDia.getText();

				int diaI = Integer.parseInt(diaIStg);
				String mesIStg = tMes.getText();

				int mesI = Integer.parseInt(mesIStg);
				String anoIStg = tAno.getText();

				int anoI = Integer.parseInt(anoIStg);

				cI.set(anoI, mesI, diaI, 0, 0, 0);
				String horaIStg = tHoraInicial.getText();

				int horaI = Integer.parseInt(horaIStg);
				String minutoIStg = tMinutoInicial.getText();

				int minutoI = Integer.parseInt(minutoIStg);
				String horaFStg = tHoraFinal.getText();

				int horaF = Integer.parseInt(horaFStg);
				String minutoFStg = tMinutoFinal.getText();

				int minutoF = Integer.parseInt(minutoFStg);

				LocalDateTime hI = LocalDateTime.of(2015, Month.MARCH, 02, horaI, minutoI);

				LocalDateTime hF = LocalDateTime.of(2015, Month.MARCH, 02, horaF, minutoF);

				ServicoPrestado novoServicoPrestado = new ServicoPrestado(s, (Cliente) c, (Funcionario) f, cI, hI, hF);

				GerenciarServicosPrestados.adicionarServicoPrestado(novoServicoPrestado);
				
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "O serviço prestado foi cadastrado com sucesso! ", ":)",
						JOptionPane.INFORMATION_MESSAGE);

				removeAll();

				PanelGerenciamento pGerenciamento = new PanelGerenciamento();
				setVisible(false);
				Inicio.panelInicio(pGerenciamento);
				pGerenciamento.setVisible(true);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(frame, "Não foi possivel cadastrar o servico prestado", ":(",
						JOptionPane.ERROR_MESSAGE);
			}

		}

		if (ae.getSource() == bLimpar) {

		}

		if (ae.getSource() == bVoltar) {

			removeAll();
			PanelPrestacaoConta pPrestacaoConta = new PanelPrestacaoConta();
			setVisible(false);
			Inicio.panelInicio(pPrestacaoConta);
			pPrestacaoConta.setVisible(true);

		}

	}

}