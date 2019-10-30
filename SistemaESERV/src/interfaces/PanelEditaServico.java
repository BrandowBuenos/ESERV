package interfaces;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import peoples.Funcionario;
import peoples.FuncionariosController;
import services.Servico;

import java.util.ArrayList;

/**
 * PanelGerenciamento
 */
public class PanelEditaServico extends JPanel implements ActionListener {

	private DefaultListModel lista = new DefaultListModel();
	ArrayList<Funcionario> funcionariosAptos = new ArrayList<Funcionario>();

	private JComboBox<String> jCFuncionarios;

	private JLabel lServico;

	private JLabel lConsultaCpf;
	private JTextField tConsultaCodigo;

	private JLabel lNome;
	private JTextField tNome;

	private JLabel lDescricao;
	private JTextField tDescricao;

	private JLabel lPreco;
	private JTextField tPreco;

	private JButton bEnviar;
	private JButton bLimpar;
	private JButton bLimpar1;

	private JButton bVoltar;

	private JButton bEditar;

	PanelEditaServico() {
		setBackground(Color.WHITE);
		setBounds(550, 0, 820, 768);
		setLayout(null);
		
		lServico = new JLabel("");
		lServico.setBounds(350, 130, 350, 60);
		lServico.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/productivity.png")));
		lServico.setForeground(new Color(70, 130, 180));
		add(lServico);

		lServico = new JLabel("Edição de Serviços");
		lServico.setBounds(250, 200, 350, 60);
		lServico.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lServico.setForeground(new Color(70, 130, 180));
		add(lServico);

		lConsultaCpf = new JLabel("  Código");
		lConsultaCpf.setBounds(180, 300, 350, 40);
		lConsultaCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		lConsultaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/edit.png")));
		lConsultaCpf.setForeground(new Color(128, 128, 128));
		add(lConsultaCpf);

		tConsultaCodigo = new JTextField("");
		tConsultaCodigo.setBounds(310, 300, 250, 40);
		tConsultaCodigo.setFont(new Font("Arial", Font.PLAIN, 20));
		tConsultaCodigo.setForeground(new Color(92, 92, 92));
		tConsultaCodigo.setDocument(new Tratamento());
		add(tConsultaCodigo);

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

		String codStg = tConsultaCodigo.getText();
		long consultaCodigo = Long.parseLong(codStg);

		Servico s = GerenciarServicos.consultarServico(consultaCodigo);

		lServico = new JLabel("Edição de serviço");
		lServico.setBounds(230, 20, 350, 60);
		lServico.setFont(new Font("Arial", Font.PLAIN, 30));
		lServico.setForeground(new Color(128, 128, 128));
		add(lServico);

		lServico = new JLabel("Identificação");
		lServico.setBounds(20, 90, 350, 60);
		lServico.setFont(new Font("Arial", Font.PLAIN, 25));
		lServico.setForeground(new Color(70, 130, 180));
		add(lServico);

		lNome = new JLabel("Nome");
		lNome.setBounds(20, 150, 350, 40);
		lNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lNome.setForeground(new Color(128, 128, 128));
		add(lNome);

		tNome = new JTextField(s.getNome());
		tNome.setBounds(20, 190, 320, 40);
		add(tNome);

		lDescricao = new JLabel("Descrição");
		lDescricao.setBounds(380, 150, 350, 40);
		lDescricao.setFont(new Font("Arial", Font.PLAIN, 20));
		lDescricao.setForeground(new Color(128, 128, 128));
		add(lDescricao);

		tDescricao = new JTextField(s.getDescricao());
		tDescricao.setBounds(380, 190, 320, 40);
		add(tDescricao);

		lServico = new JLabel("Opções");
		lServico.setBounds(20, 250, 350, 60);
		lServico.setFont(new Font("Arial", Font.PLAIN, 25));
		lServico.setForeground(new Color(70, 130, 180));
		add(lServico);

		lPreco = new JLabel("Preço do serviço");
		lPreco.setBounds(20, 310, 350, 40);
		lPreco.setFont(new Font("Arial", Font.PLAIN, 20));
		lPreco.setForeground(new Color(128, 128, 128));
		add(lPreco);

		float pFloat = s.getPreco();
		String preco = String.valueOf(pFloat);

		tPreco = new JTextField("");
		tPreco.setBounds(20, 350, 140, 40);
		tPreco.setDocument(new Tratamento());
		tPreco.setText(preco);
		add(tPreco);
		
		lPreco = new JLabel("Funcionário apto");
		lPreco.setBounds(300, 310, 350, 40);
		lPreco.setFont(new Font("Arial", Font.PLAIN, 20));
		lPreco.setForeground(new Color(128, 128, 128));
		add(lPreco);

		jCFuncionarios = new javax.swing.JComboBox<String>();
		jCFuncionarios.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Selecione" }));
		jCFuncionarios.setBounds(300, 350, 350, 40);
		add(jCFuncionarios);
		if (FuncionariosController.getListaFuncionarios().size() > 0) {
			for (int i = 0; i < FuncionariosController.getListaFuncionarios().size(); i++) {
				jCFuncionarios.addItem(FuncionariosController.getListaFuncionarios().get(i).getNome());
			}
		} else {
			jCFuncionarios.addItem("Nenhum funcionário cadastrado");
		}

		bEditar = new JButton("Enviar");
		bEditar.setBounds(530, 640, 180, 60);
		bEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEditar.addActionListener(this);
		bEditar.setForeground(new Color(0, 128, 128));
		add(bEditar);

		bLimpar1 = new JButton("Limpar");
		bLimpar1.setBounds(350, 640, 180, 60);
		bLimpar1.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar1.setForeground(new Color(205, 92, 92));
		bLimpar1.addActionListener(this);
		add(bLimpar1);

		repaint();

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == bEnviar) {

			String codStg = tConsultaCodigo.getText();
			long consultaCodigo = Long.parseLong(codStg);

			if (GerenciarServicos.existe(consultaCodigo) == false) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Nenhum serviço com este código foi encontrado! \nPor favor, tente outro código válido.", ":(",
						JOptionPane.ERROR_MESSAGE);
				tConsultaCodigo.setText("");

			} else {
				removeAll();
				PanelResultadoConsulta();
			}

		}

		if (ae.getSource() == bLimpar) {
			tConsultaCodigo.setText("");

		}

		if (ae.getSource() == bVoltar) {

			removeAll();
			PanelGerenciamento pGerenciamento = new PanelGerenciamento();
			setVisible(false);
			Inicio.panelInicio(pGerenciamento);
			pGerenciamento.setVisible(true);

		}

		if (ae.getSource() == bLimpar1) {
			tNome.setText("");
			tDescricao.setText("");
			tPreco.setText("");

		}

		if (ae.getSource() == bEditar) {

			try {
				String codStg = tConsultaCodigo.getText();
				long codigo = Long.parseLong(codStg);

				Servico servicoEditado = new Servico(codigo);

				String nome = tNome.getText();
				servicoEditado.setNome(nome);

				String precoStg = tPreco.getText();
				float preco = Float.parseFloat(precoStg);
				servicoEditado.setPreco(preco);

				String descricao = tDescricao.getText();
				servicoEditado.setDescricao(descricao);

				String nomeDoFuncionario = (String) jCFuncionarios.getSelectedItem();
				Funcionario f = (Funcionario) GerenciarFuncionarios.consultarFuncionario(nomeDoFuncionario);
				funcionariosAptos.add(f);

				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"O serviço " + nome + " de código " + codigo + " foi editado com sucesso! ", ":)",
						JOptionPane.INFORMATION_MESSAGE);

				servicoEditado.setListaDeFuncionariosAptos(funcionariosAptos);

				GerenciarServicos.editarServico(servicoEditado, codigo);

				removeAll();

				PanelGerenciamento pGerenciamento = new PanelGerenciamento();
				setVisible(false);
				Inicio.panelInicio(pGerenciamento);
				pGerenciamento.setVisible(true);

			} catch (Exception e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Ocorreu um erro ao tentar editar este serviço! \nPor favor, verifique todos os dados", ":(",
						JOptionPane.ERROR_MESSAGE);
			}

		}
	}

}