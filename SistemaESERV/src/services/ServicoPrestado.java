package services;

import java.util.ArrayList;

import peoples.Cliente;
import peoples.Funcionario;
import stocks.Produto;
import services.Servico;

import java.time.LocalDateTime;
import java.util.Calendar;

public class ServicoPrestado {
	private static long nCodigoServico;
	private final long codigoServicoPrestado;

	private ArrayList<Produto> listaDeProdutosUtilizados;

	private Servico servico;
	private Cliente cliente;
	private Funcionario funcionario;
	private Calendar data;
	private LocalDateTime horaInicial;
	private LocalDateTime horaFinal;

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

	ServicoPrestado(long Codigo) {
		this.codigoServicoPrestado = Codigo;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public LocalDateTime gethoraInicial() {
		return horaInicial;
	}

	public void sethoraInicial(LocalDateTime horaInicial) {
		this.horaInicial = horaInicial;
	}

	public LocalDateTime gethoraFinal() {
		return horaFinal;
	}

	public void sethoraFinal(LocalDateTime horaFinal) {
		this.horaFinal = horaFinal;
	}

	public ArrayList<Produto> getlistaDeProdutosUtilizados() {
		return listaDeProdutosUtilizados;
	}

	public void setlistaDeProdutosUtilizados(ArrayList<Produto> listaDeProdutosUtilizados) {
		this.listaDeProdutosUtilizados = listaDeProdutosUtilizados;
	}

	public long getCodigoServicoPrestado() {
		return codigoServicoPrestado;
	}

	public String toString() {
		return "- Código: " + this.codigoServicoPrestado + " - Serviço: " + this.servico + " - Cliente: " + this.cliente
				+ " - Funcionário: " + this.funcionario + " - Produtos utilizados: " + listaDeProdutosUtilizados
				+ "- Data: " + data + " - Hora Inicial: " + horaInicial + " - Hora Final: " + horaFinal;
	}

}
