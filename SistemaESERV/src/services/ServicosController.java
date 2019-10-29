package services;

import java.util.ArrayList;

import peoples.Funcionario;

public class ServicosController {

	private static ArrayList<Servico> listaDeServicos;

	public ServicosController() {
		listaDeServicos = new ArrayList<Servico>();

	}

	public void add(Servico s, ArrayList<Funcionario> funcionariosAptos) {
		listaDeServicos.add(s);
		s.setListaDeFuncionariosAptos(funcionariosAptos);
	}

	public Servico get(long cod) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getCodigoServico() == cod) {
				return listaDeServicos.get(i);
			}

		}
		return null;

	}

	public static Servico getInfo(String name) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getNome().equals(name)) {
				return listaDeServicos.get(i);
			}

		}
		return null;
	}

	public String get() {
		String info = "";
		for (int i = 0; i < listaDeServicos.size(); i++) {
			info += listaDeServicos.get(i).toString();
		}
		return info;

	}

	public void set(Servico s, long cod) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getCodigoServico() == cod) {
				listaDeServicos.set(i, s);
			}

		}
	}

	public void remove(long cod) {
		for (int i = 0; i < listaDeServicos.size(); i++) {
			if (listaDeServicos.get(i).getCodigoServico() == cod) {
				listaDeServicos.remove(i);
			}
		}

	}

	public static ArrayList<Servico> getListaDeServicos() {
		return listaDeServicos;
	}

}
