package peoples;

import java.util.ArrayList;

/**
 * Classe FuncionariosController que gerencia a Lista De Funcionários.
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 */
public class FuncionariosController {

	private static ArrayList<Pessoa> listaDeFuncionarios;

	/**
	 * Construtor que instancia um novo ArrayList
	 */
	public FuncionariosController() {
		listaDeFuncionarios = new ArrayList<Pessoa>();
	}

	/**
	 * Adiciona um funcionário na lista de Funcionarios
	 * 
	 * @param Pessoa
	 */
	public void add(Pessoa p) {
		listaDeFuncionarios.add(p);
	}

	/**
	 * Consulta um funcionário por CPF já estiver sido cadastrado
	 * 
	 * @param CPF
	 * @return
	 */
	public Pessoa get(long CPF) {
		for (int i = 0; i < listaDeFuncionarios.size(); i++) {
			if (listaDeFuncionarios.get(i).getCpf() == CPF) {
				return listaDeFuncionarios.get(i);
			}
		}
		return null;
	}

	/**
	 * Consulta um funcionário por nome e retorna um funcionário
	 * 
	 * @param nome
	 * @return
	 */
	public static Pessoa get(String nome) {
		for (int i = 0; i < listaDeFuncionarios.size(); i++) {
			if (listaDeFuncionarios.get(i).getNome().equals(nome)) {
				return listaDeFuncionarios.get(i);
			}
		}
		return null;
	}

	/**
	 * Lista informações sobre o Funcionario por CPF
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
	 * Lista informações sobre todos os Funcionarios
	 * 
	 * @return info
	 */

	public String getInfo() {
		String info = "";
		for (int i = 0; i < listaDeFuncionarios.size(); i++) {
			info += listaDeFuncionarios.get(i).toString();
		}
		return info;

	}

	/**
	 * Edita dados de funcionário já cadastrado
	 * 
	 * @param CPF
	 * @param FuncionarioEditado
	 * @return
	 */
	public boolean set(long CPF, Pessoa funcionarioEditado) {
		for (int i = 0; i < listaDeFuncionarios.size(); i++) {
			if (listaDeFuncionarios.get(i).getCpf() == CPF) {
				listaDeFuncionarios.set(i, funcionarioEditado);
				return true;
			}
		}
		return false;
	}

	/**
	 * Remove o funcionário por CPF
	 * 
	 * @param CPF
	 * @return
	 */
	public boolean remove(long CPF) {
		Pessoa p = get(CPF);
		if (p != null) {
			listaDeFuncionarios.remove(p);
			return true;
		}
		return false;
	}

	/**
	 * Verifica se o funcionário existe por CPF
	 * 
	 * @param CPF
	 * @return
	 */
	public boolean existe(long CPF) {
		Pessoa pessoa = get(CPF);
		return pessoa != null;

	}

	/**
	 * Retorna o Lista de funcionários
	 * 
	 * @return
	 */
	public static ArrayList<Pessoa> getListaFuncionarios() {
		return listaDeFuncionarios;
	}
}