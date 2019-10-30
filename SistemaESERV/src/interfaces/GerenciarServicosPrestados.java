package interfaces;

import java.util.ArrayList;

import services.ServicosPrestadosController;
import services.ServicoPrestado;

public class GerenciarServicosPrestados {

	private static ServicosPrestadosController gSp;

	public GerenciarServicosPrestados() {
		gSp = new ServicosPrestadosController();
	}

	protected static void adicionarServicoPrestado(ServicoPrestado sp) {
		gSp.add(sp);
	}

	protected static ServicoPrestado consultarServicoPrestado(long Codigo) {
		return gSp.get(Codigo);
	}

}
