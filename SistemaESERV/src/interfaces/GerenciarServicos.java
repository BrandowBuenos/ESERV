package interfaces;

import peoples.Funcionario;
import java.util.ArrayList;

import services.ServicosController;
import services.Servico;

public class GerenciarServicos {

	private static ServicosController gerenciamentoDeServicos;

	public GerenciarServicos() {
		gerenciamentoDeServicos = new ServicosController();
	}

	protected static void adicionarServico(Servico s, ArrayList<Funcionario> funcionariosAptos) {
		gerenciamentoDeServicos.add(s, funcionariosAptos);
	}

	protected static Servico consultarServico(long codigo) {
		return gerenciamentoDeServicos.get(codigo);
	}

	protected static String consultarServico() {
		return gerenciamentoDeServicos.get();
	}

	protected static void editarServico(Servico s, long codigo) {
		gerenciamentoDeServicos.set(s, codigo);
	}

	protected static boolean existe(long codigo) {
		return gerenciamentoDeServicos.existe(codigo);

	}

	protected static void excluirServico(long codigo) {
		gerenciamentoDeServicos.remove(codigo);
	}

}
