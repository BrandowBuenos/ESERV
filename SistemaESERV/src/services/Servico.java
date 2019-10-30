package services;

import java.util.ArrayList;

import peoples.Funcionario;

/**
 * Classe Servico
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 *
 */
public class Servico {

	private static long nServico = 0;
	private final long codigoServico;

	private String nome;
	private String descricao;
	private float preco;

	private ArrayList<Funcionario> listaDeFuncionariosAptos;

	/**
	 * Construtor da Servico
	 * 
	 * @param nome
	 * @param preco
	 */
	public Servico(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
		nServico++;
		this.codigoServico = nServico;

	}

	/**
	 * Segundo construtor da classe que evita a alteração do código único do serviço
	 * ao ser editado
	 * 
	 * @param codigoServico
	 */
	public Servico(long codigoServico) {
		this.codigoServico = codigoServico;
	}

	/**
	 * Retorna o código do serviço
	 * 
	 * @return
	 */
	public long getCodigoServico() {
		return this.codigoServico;
	}

	/**
	 * Retorna o nome do serviço
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Modifica o nome do serviço
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a descricao do serviço
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Modifica a descricao do serviço
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Retorna o preco do serviço
	 * 
	 * @return
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * Modifica o preco do serviço
	 * 
	 * @param preco
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}

	/**
	 * Retorna a lista de funcionarios aptos para o serviço
	 * 
	 * @return
	 */
	public ArrayList<Funcionario> getListaDeFuncionariosAptos() {
		return listaDeFuncionariosAptos;
	}

	/**
	 * Modifica a lista de de funcionários aptos para o serviço
	 * 
	 * @param listaDeFuncionariosAptos
	 */
	public void setListaDeFuncionariosAptos(ArrayList<Funcionario> listaDeFuncionariosAptos) {
		this.listaDeFuncionariosAptos = listaDeFuncionariosAptos;
	}

	/**
	 * Retorna um toString com informações osbre o serviço
	 */
	public String toString() {
		return "Código: " + this.codigoServico + " - Nome: " + this.nome + " - Descrição: " + this.descricao
				+ " - Preço: " + this.preco;
	}

}
