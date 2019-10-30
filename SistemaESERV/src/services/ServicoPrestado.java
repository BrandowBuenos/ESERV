package services;

import java.util.ArrayList;

import peoples.Cliente;
import peoples.Funcionario;
import stocks.Produto;
import services.Servico;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Classe ServicoPrestado
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 *
 */
public class ServicoPrestado {

	private static long nCodigoServico = 0;
	private final long codigoServicoPrestado;

	private ArrayList<Produto> listaDeProdutosUtilizados;

	private Servico servico;
	private Cliente cliente;
	private Funcionario funcionario;
	private Calendar data;
	private LocalDateTime horaInicial;
	private LocalDateTime horaFinal;

	/**
	 * Construtor da classe ServicoPrestado
	 * 
	 * @param servico
	 * @param cliente
	 * @param funcionario
	 * @param data
	 * @param horaInicial
	 * @param horaFinal
	 */
	public ServicoPrestado(Servico servico, Cliente cliente, Funcionario funcionario, Calendar data,
			LocalDateTime horaInicial, LocalDateTime horaFinal) {

		this.servico = servico;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.data = data;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;

		nCodigoServico++;
		codigoServicoPrestado = nCodigoServico;
	}

	/**
	 * Segundo construtor que evita que o código único do serviço prestado seja
	 * alterado ao se editar
	 * 
	 * @param Codigo
	 */
	public ServicoPrestado(long Codigo) {
		this.codigoServicoPrestado = Codigo;
	}

	/**
	 * Retorna o serviço vinculado
	 * 
	 * @return
	 */
	public Servico getServico() {
		return servico;
	}

	/**
	 * Modifica o serviço vinculadoo
	 * 
	 * @param servico
	 */
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	/**
	 * Retorna o cliente vinculado
	 * 
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Modifica o cliente vinculado
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Retorna o funcionário vinculado
	 * 
	 * @return
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * Modifica o funcionário vinculado
	 * 
	 * @param funcionario
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	/**
	 * Retorna a data do serviço prestado
	 * 
	 * @return
	 */
	public Calendar getData() {
		return data;
	}

	/**
	 * Modifica a data do serviço prestado
	 * 
	 * @param data
	 */
	public void setData(Calendar data) {
		this.data = data;
	}

	/**
	 * Retorna a hora inicial do serviço prestado
	 * 
	 * @return
	 */
	public LocalDateTime gethoraInicial() {
		return horaInicial;
	}

	/**
	 * Modifica a hora incial do serviço prestado
	 * 
	 * @param horaInicial
	 */
	public void sethoraInicial(LocalDateTime horaInicial) {
		this.horaInicial = horaInicial;
	}

	/**
	 * Retorna a hora final do serviço prestado
	 * 
	 * @return
	 */
	public LocalDateTime gethoraFinal() {
		return horaFinal;
	}

	/**
	 * Modifica a hora final do serviço prestado
	 * 
	 * @param horaFinal
	 */
	public void sethoraFinal(LocalDateTime horaFinal) {
		this.horaFinal = horaFinal;
	}

	/**
	 * Retorna a lista de produtos utilizados vinculado
	 * 
	 * @return
	 */
	public ArrayList<Produto> getlistaDeProdutosUtilizados() {
		return listaDeProdutosUtilizados;
	}

	/**
	 * Modifica a lista de produtos utilizados vinculado
	 * 
	 * @param listaDeProdutosUtilizados
	 */
	public void setlistaDeProdutosUtilizados(ArrayList<Produto> listaDeProdutosUtilizados) {
		this.listaDeProdutosUtilizados = listaDeProdutosUtilizados;
	}

	/**
	 * Retorna o código do serviço prestado
	 * 
	 * @return
	 */
	public long getCodigoServicoPrestado() {
		return codigoServicoPrestado;
	}

	/**
	 * Retorna um toString com informações do serviço prestado
	 */
	public String toString() {
		return "Código: " + this.codigoServicoPrestado + " - Serviço: " + this.servico + " - Cliente: " + this.cliente
				+ " - Funcionário: " + this.funcionario + " - Produtos utilizados: " + listaDeProdutosUtilizados
				+ "- Data: " + data + " - Hora Inicial: " + horaInicial + " - Hora Final: " + horaFinal;
	}

}
