package interfaces;

import peoples.ClientesController;
import peoples.Pessoa;

public class GerenciarClientes {

	Pessoa pessoa;

	static ClientesController gerenciamentoDeClientes;

	public GerenciarClientes() {
		gerenciamentoDeClientes = new ClientesController();
	}

	protected static void AdicionarCliente(Pessoa p) {
		gerenciamentoDeClientes.add(p);

	}

	protected static Pessoa ConsultarCliente(long cpf) {
		return gerenciamentoDeClientes.get(cpf);
	}

	protected static String ConsultarCliente() {
		return gerenciamentoDeClientes.getInfo();
	}

	protected static void editarCliente(long cpf, Pessoa p) {
		gerenciamentoDeClientes.set(cpf, p);

	}

	protected static boolean existe(long cpf) {
		return gerenciamentoDeClientes.existe(cpf);

	}

	protected static void RemoverCliente(long cpf) {
		gerenciamentoDeClientes.remove(cpf);
	}

}
