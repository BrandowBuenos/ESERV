package stocks;

import java.util.ArrayList;

import peoples.Pessoa;

/**
 * ProdutosController
 */
public class ProdutosController {

	private static ArrayList<Produto> listaDeProdutos;

	public ProdutosController() {
		listaDeProdutos = new ArrayList<Produto>();
	}

	public void add(Produto p) {
		listaDeProdutos.add(p);
	}

	public Produto get(int Codigo) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (listaDeProdutos.get(i).getCodigoProduto() == Codigo) {
				return listaDeProdutos.get(i);
			}
		}
		return null;
	}

	public String get() {
		String info = "";
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			info += listaDeProdutos.get(i).toString();
		}
		return info;

	}

	public boolean set(int Codigo, Produto produtoEditado) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (listaDeProdutos.get(i).getCodigoProduto() == Codigo) {
				listaDeProdutos.set(i, produtoEditado);
				return true;
			}
		}
		return false;
	}

	public boolean remove(int Codigo) {
		for (Produto produto : listaDeProdutos) {
			if (produto.getCodigoProduto() == Codigo) {
				listaDeProdutos.remove(produto);
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

}