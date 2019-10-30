package services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * 
 * Classe ServicosPrestadosController que gerencia a lista de serviços prestados
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 *
 */
public class ServicosPrestadosController {
	private static ArrayList<ServicoPrestado> listaDeServicosPrestados;

	/**
	 * Construtor da classe que instancia um ArrayList
	 */
	public ServicosPrestadosController() {
		listaDeServicosPrestados = new ArrayList<ServicoPrestado>();
	}

	/**
	 * Adiciona um novo serviço prestado na lista de serviços prestados
	 * 
	 * @param servicoprestado
	 */
	public void add(ServicoPrestado servicoprestado) {
		listaDeServicosPrestados.add(servicoprestado);
	}

	/**
	 * Consulta e retorna um serviço prestado de acordo com o código consultado
	 * 
	 * @param Codigo
	 * @return
	 */
	public ServicoPrestado get(long Codigo) {
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			if (listaDeServicosPrestados.get(i).getCodigoServicoPrestado() == Codigo) {
				return listaDeServicosPrestados.get(i);
			}
		}
		return null;
	}

	/**
	 * Retorna informações de todos o serviços prestados cadastrados
	 * 
	 * @return
	 */
	public String getInfo() {
		String info = "";
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			info += listaDeServicosPrestados.get(i).toString();
		}
		return info;
	}

	/**
	 * Edita um serviço prestado de acordo com o seu código
	 * 
	 * @param servicoPrestadoEditado
	 * @param Codigo
	 */
	public void set(ServicoPrestado servicoPrestadoEditado, long Codigo) {
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			if (listaDeServicosPrestados.get(i).getCodigoServicoPrestado() == Codigo) {
				listaDeServicosPrestados.set(i, servicoPrestadoEditado);
			}
		}
	}

	/**
	 * Remove um serviço prestado da lista de serviços prestados
	 * 
	 * @param Codigo
	 */
	public void remove(long Codigo) {
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			if (listaDeServicosPrestados.get(i).getCodigoServicoPrestado() == Codigo) {
				listaDeServicosPrestados.remove(i);
			}
		}
	}

	/**
	 * Retorna a lista de serviços prestados
	 * 
	 * @return
	 */
	public static ArrayList<ServicoPrestado> getListaDeServicosPrestados() {
		return listaDeServicosPrestados;
	}

	/**
	 * Retorna o relatório de serviços prestados
	 * 
	 * @param dataI
	 * @param dataF
	 * @return
	 */
	public static ArrayList<ServicoPrestado> relatorioServicos(Calendar dataI, Calendar dataF) {
		ArrayList<ServicoPrestado> s = new ArrayList<>();
		for (int i = 0; i < getListaDeServicosPrestados().size(); i++) {
			if (getListaDeServicosPrestados().get(i).getData().after(dataI)
					&& getListaDeServicosPrestados().get(i).getData().before(dataF)) {
				s.add(getListaDeServicosPrestados().get(i));
			}

		}
		return s;

	}
	
	public boolean existe(long codigo) {
		ServicoPrestado servicoprestado = get(codigo);
		return servicoprestado != null;

	}

	/**
	 * Retorna a duração do serviço prestado
	 * 
	 * @param i
	 * @param f
	 * @return
	 */
	public static long duracao(LocalDateTime i, LocalDateTime f) {
		Duration duration = Duration.between(i, f);
		return duration.toMinutes();

	}

}
