package services;

import java.util.ArrayList;

/**
 * ServicosPrestadosController
 */
public class ServicosPrestadosController {
	
	private static ArrayList<ServicoPrestado> listaDeServicosPrestados;

    public ServicosPrestadosController() {
        ArrayList listaDeServicosPrestados = new ArrayList();
    }


    public void add(ServicoPrestado sp) {
        listaDeServicosPrestados.add(sp);
    }

    public String consultar(int codigo) {
        ServicoPrestado servicoPrestado = get(codigo);
        if (servicoPrestado != null) {
            return servicoPrestado.toString();
        }
        return null; 
    }

    public boolean editar(int codigo, ServicoPrestado prestadoEditado) {
        for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
            if (listaDeServicosPrestados.get(i).getCodigo().equals(codigo)) {
                listaDeServicosPrestados.set(i, prestadoEditado);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int codigo) {
        for (ServicoPrestado servicoPrestado : listaDeServicosPrestados) {
            if (servicoPrestado.getCodigo().equals(codigo)) {
                listaDeServicosPrestados.remove(servicoPrestado);
                return true;
            }
        }
        return false;
    }
}