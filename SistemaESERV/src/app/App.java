package app;

import interfaces.*;

/**
 * Classe App, main do projeto
 */
public class App {

	public static void main(String[] args) {
		GerenciarClientes gerenciamentoDeClientes = new GerenciarClientes();
		GerenciarFuncionarios gerenciamentoDeFuncionarios = new GerenciarFuncionarios();
		GerenciarEstoques gerenciamentoDeEstoque = new GerenciarEstoques();
		GerenciarServicos gerenciamentoDeServicos = new GerenciarServicos();
		GerenciarServicosPrestados gerenciamentoDeServicosPrestados = new GerenciarServicosPrestados();

		Inicio in = new Inicio();
	}
}