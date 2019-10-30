package stocks;

import java.util.ArrayList;

import peoples.Pessoa;

/**
 * Classe ProdutosController que gerencia a Lista De Produtos.
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 */
public class ProdutosController {

	private static ArrayList<Produto> listaDeProdutos;

	/**
	 * Constutor da classe que instancia um novo ArrayList
	 */
	public ProdutosController() {
		listaDeProdutos = new ArrayList<Produto>();
	}

	/**
	 * Adiciona um produto a lista de produtos
	 * 
	 * @param p
	 */
	public void add(Produto p) {
		listaDeProdutos.add(p);
	}

	/**
	 * Consulta e retorna um produto de acordo com o código consultado
	 * 
	 * @param Codigo
	 * @return produto or listaDeProdutos
	 */
	public Produto get(int Codigo) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (listaDeProdutos.get(i).getCodigoProduto() == Codigo) {
				return listaDeProdutos.get(i);
			}
		}
		return null;
	}

	/**
	 * Retorna todos os produtos cadastrados
	 * 
	 * @return info
	 */
	public String get() {
		String info = "";
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			info += listaDeProdutos.get(i).toString();
		}
		return info;

	}

	/**
	 * Edita um produto já existente
	 * 
	 * @param Codigo
	 * @param produtoEditado
	 * @return boolean
	 */
	public boolean set(int Codigo, Produto produtoEditado) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (listaDeProdutos.get(i).getCodigoProduto() == Codigo) {
				listaDeProdutos.set(i, produtoEditado);
				return true;
			}
		}
		return false;
	}

	/**
	 * Remove um produto da lista de produtos
	 * 
	 * @param Codigo
	 * @return boolean
	 */
	public boolean remove(int Codigo) {
		for (Produto produto : listaDeProdutos) {
			if (produto.getCodigoProduto() == Codigo) {
				listaDeProdutos.remove(produto);
				return true;
			}
		}
		return false;
	}

	/**
	 * Verifica se produto já existe
	 * 
	 * @param Código
	 * @return
	 */
	public boolean existe(int Codigo) {
		Produto produto = get(Codigo);
		return produto != null;

	}

	/**
	 * Retorna a lista de produtos cadastrados
	 * 
	 * @return listaDeProdutos
	 */
	public static ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

}