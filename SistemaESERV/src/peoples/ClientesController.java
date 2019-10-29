package peoples;

import java.util.ArrayList;

/**
 * ClientesController
 */
public class ClientesController {

	static ArrayList<Pessoa> listaDeClientes;

	/**
	 * Construtor da classe que instancia um novo ArrayList
	 */
	public ClientesController() {
		listaDeClientes = new ArrayList<Pessoa>();
	}

	/**
	 * Adiciona o cliente na lista de clientes
	 * 
	 * @param c
	 */
	public void add(Pessoa p) {
		listaDeClientes.add(p);
	}

	/**
	 * Adiciona o cliente na lista de clientes
	 * 
	 * @param CPF
	 * @return
	 */
	public Pessoa get(long CPF) {
		for (int i = 0; i < listaDeClientes.size(); i++) {
			if (listaDeClientes.get(i).getCpf() == CPF) {
				return listaDeClientes.get(i);
			}
		}
		return null;
	}

	/**
	 * Retorna as informaçoes completas do cliente
	 * 
	 * @param CPF
	 * @return
	 */
	public String getInfo(long CPF) {
		Pessoa pessoa = get(CPF);
		if (pessoa != null) {

			return pessoa.toString();
		}
		return null;
	}

	/**
	 * Retorna as informaçoes completas de todos os cliente
	 * 
	 * @param CPF
	 * @return
	 */
	public String getInfo() {
		String info = "";
		for (int i = 0; i < listaDeClientes.size(); i++) {
			info += listaDeClientes.get(i).toString();
		}
		return info;
	}

	/**
	 * Altera o cliente com o cpf informado
	 * 
	 * @param CPF
	 * @param clienteEditado
	 * @return
	 */
	public boolean set(long CPF, Pessoa clienteEditado) {
		for (int i = 0; i < listaDeClientes.size(); i++) {
			if (listaDeClientes.get(i).getCpf() == CPF) {
				listaDeClientes.set(i, clienteEditado);
				return true;
			}
		}
		return false;
	}

	/**
	 * Remove o cliente conforme o cpf informado
	 * 
	 * @param CPF
	 * @return
	 */
	public boolean remove(long CPF) {
		Pessoa p = get(CPF);
		if (p != null) {
			listaDeClientes.remove(p);
			return true;
		}
		return false;

	}

	public boolean existe(long CPF) {
		Pessoa pessoa = get(CPF);
		return pessoa != null;

	}

}