package interfaces;

import stocks.*;

public class GerenciarEstoques {

	Produto p;

	static ProdutosController gerenciamentoDeProdutos;

	public GerenciarEstoques() {
		gerenciamentoDeProdutos = new ProdutosController();
	}

	protected static void AdicionarProduto(Produto p) {
		gerenciamentoDeProdutos.add(p);

	}

	protected static Produto ConsultarProduto(int codigo) {
		return gerenciamentoDeProdutos.get(codigo);
	}

	protected static String ConsultarProduto() {
		return gerenciamentoDeProdutos.get();
	}

	protected static void EditarProduto(int codigo, Produto p) {
		gerenciamentoDeProdutos.set(codigo, p);

	}

	protected static void RemoverProduto(int codigo) {
		gerenciamentoDeProdutos.remove(codigo);
	}

}