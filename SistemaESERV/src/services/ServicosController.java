package services;

import java.util.ArrayList;

import peoples.Funcionario;
import peoples.Pessoa;

/**
 * Classe ServicosController que gerencia a lista de serviços
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 *
 */
public class ServicosController {

	private static ArrayList<Servico> listaDeServicos;

	/**
	 * Construtor da classe que instancia um ArrayList
	 */
	public ServicosController() {
		listaDeServicos = new ArrayList<Servico>();

	}

	/**
	 * Adiciona um novo serviço e seu respectivo funcionario apto na lista de
	 * serviço
	 * 
	 * @param s
	 * @param funcionariosAptos
	 */
	public void add(Servico s, ArrayList<Funcionario> funcionariosAptos) {
		listaDeServicos.add(s);
		s.setListaDeFuncionariosAptos(funcionariosAptos);
	}

	/**
	 * Consulta e retorna um serviço cadastrado de acordo com o código consultado
	 * 
	 * @param cod
	 * @return
	 */
	public static Servico get(long cod) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getCodigoServico() == cod) {
				return listaDeServicos.get(i);
			}

		}
		return null;

	}

	/**
	 * Consulta e retorna um serviço cadastrado de acordo com o nome
	 * 
	 * @param name
	 * @return
	 */
	public static Servico get(String name) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getNome().equals(name)) {
				return listaDeServicos.get(i);
			}

		}
		return null;
	}

	/**
	 * Retorna informações de todos os serviços cadastrados
	 * 
	 * @return
	 */
	public String get() {
		String info = "";
		for (int i = 0; i < listaDeServicos.size(); i++) {
			info += listaDeServicos.get(i).toString();
		}
		return info;

	}

	/**
	 * Edita um serviço de acordo com o seu código
	 * 
	 * @param s
	 * @param cod
	 */

	public void set(Servico s, long cod) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getCodigoServico() == cod) {
				listaDeServicos.set(i, s);
			}

		}
	}

	/**
	 * Remove um serviço da lista de Serviços
	 * 
	 * @param cod
	 */
	public void remove(long cod) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getCodigoServico() == cod) {
				listaDeServicos.remove(i);
			}
		}

	}

	/**
	 * Verifica se o serviço já existe
	 * 
	 * @param CPF
	 * @return
	 */
	public boolean existe(long codigo) {
		Servico servico = get(codigo);
		return servico != null;

	}

	
	/**
	 * Retorna a lista de serviços cadastrados
	 * 
	 * @return
	 */
	public static ArrayList<Servico> getListaDeServicos() {
		return listaDeServicos;
	}

}
