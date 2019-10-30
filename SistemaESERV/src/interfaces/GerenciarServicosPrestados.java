package interfaces;

import java.util.ArrayList;

import services.ServicosPrestadosController;
import services.ServicoPrestado;

public class GerenciarServicosPrestados {

	private static ServicosPrestadosController gerenciarServicosPrestados;

	public GerenciarServicosPrestados() {
		gerenciarServicosPrestados = new ServicosPrestadosController();
	}

	protected static void adicionarServicoPrestado(ServicoPrestado sp) {
		gerenciarServicosPrestados.add(sp);
	}

	protected static ServicoPrestado consultarServicoPrestado(long Codigo) {
		return gerenciarServicosPrestados.get(Codigo);
	}
	
	protected static void excluirServicoPrestado(long Codigo) {
		 gerenciarServicosPrestados.remove(Codigo);
	}
	
	protected static boolean existe(long codigo) {
		return gerenciarServicosPrestados.existe(codigo);

	}

}
