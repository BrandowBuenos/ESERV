package interfaces;

import peoples.FuncionariosController;
import peoples.Pessoa;

public class GerenciarFuncionarios {

	Pessoa pessoa;

	static FuncionariosController gerenciamentoDeFuncionario;

	public GerenciarFuncionarios() {
		gerenciamentoDeFuncionario = new FuncionariosController();
	}

	protected static void AdicionarFuncionario(Pessoa p) {
		gerenciamentoDeFuncionario.add(p);

	}

	protected static Pessoa ConsultarFuncionario(long cpf) {
		return gerenciamentoDeFuncionario.get(cpf);
	}

	protected static String ConsultarFuncionario() {
		return gerenciamentoDeFuncionario.getInfo();
	}

	public static Pessoa consultarFuncionario(String nome) {
		return FuncionariosController.get(nome);
	}

	protected static void editarFuncionario(long cpf, Pessoa p) {
		gerenciamentoDeFuncionario.set(cpf, p);

	}

	protected static void RemoverFuncionario(long cpf) {
		gerenciamentoDeFuncionario.remove(cpf);
	}

}
