package peoples;

import java.util.ArrayList;

/**
 * FuncionariosController
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
	 * Adiciona a locacao na lista de Funcionarios
	 * 
	 * @param l
	 */
	public void add(Pessoa p) {
		listaDeFuncionarios.add(p);
	}

	/**
	 * Retorna uma locação
	 * 
	 * @param codigo
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

	public static Pessoa get(String nome) {
		for (int i = 0; i < listaDeFuncionarios.size(); i++) {
			if (listaDeFuncionarios.get(i).getNome().equals(nome)) {
				return listaDeFuncionarios.get(i);
			}
		}
		return null;
	}

	/**
	 * Lista todas as Funcionarios com o codigo inserido
	 * 
	 * @param codigo
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
	 * Lista todos as Funcionarios
	 * 
	 * @return
	 */

	public String getInfo() {
		String info = "";
		for (int i = 0; i < listaDeFuncionarios.size(); i++) {
			info += listaDeFuncionarios.get(i).toString();
		}
		return info;

	}

	/**
	 * Edita dados de funcionário
	 * 
	 * @param codigo
	 * @param locacaoEditada
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
	 * Remove o funcionário conforme seu cpf
	 * 
	 * @param codigo
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
	 * Verifica se o funcinário existe conforme seu cpf
	 * 
	 * @param codigo
	 * @return
	 */
	public boolean existe(long CPF) {
		Pessoa pessoa = get(CPF);
		return pessoa != null;

	}

	
	 public static ArrayList<Pessoa> getListaFuncionarios() {
	        return listaDeFuncionarios;
	    }
}