package services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class ServicosPrestadosController {
	private static ArrayList<ServicoPrestado> listaDeServicosPrestados;

	public ServicosPrestadosController() {
		listaDeServicosPrestados = new ArrayList<ServicoPrestado>();
	}

	public void add(ServicoPrestado servicoprestado) {
		listaDeServicosPrestados.add(servicoprestado);
	}

	public ServicoPrestado get(long Codigo) {
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			if (listaDeServicosPrestados.get(i).getCodigoServicoPrestado() == Codigo) {
				return listaDeServicosPrestados.get(i);
			}
		}
		return null;
	}

	public String consultarInf() {
		String info = "";
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			info += listaDeServicosPrestados.get(i).toString();
		}
		return info;
	}

	public void set(ServicoPrestado servicoPrestadoEditado, long Codigo) {
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			if (listaDeServicosPrestados.get(i).getCodigoServicoPrestado() == Codigo) {
				listaDeServicosPrestados.set(i, servicoPrestadoEditado);
			}
		}
	}

	public void remove(long Codigo) {
		for (int i = 0; i < listaDeServicosPrestados.size(); i++) {
			if (listaDeServicosPrestados.get(i).getCodigoServicoPrestado() == Codigo) {
				listaDeServicosPrestados.remove(i);
			}
		}
	}

	public static ArrayList<ServicoPrestado> getListaDeServicosPrestados() {
		return listaDeServicosPrestados;
	}

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

	public static long duracao(LocalDateTime i, LocalDateTime f) {
		Duration duration = Duration.between(i, f);
		return duration.toMinutes();

	}

}
