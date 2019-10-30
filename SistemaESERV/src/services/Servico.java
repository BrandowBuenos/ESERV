package services;

import java.util.ArrayList;

import peoples.Funcionario;

public class Servico {

	private static long nServico = 0;
	private final long codigoServico;

	private String nome;
	private String descricao;
	private float preco;

	private ArrayList<Funcionario> listaDeFuncionariosAptos;

	public Servico(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
		nServico++;
		this.codigoServico = nServico;

	}

	public Servico(long codigoServico) {
		this.codigoServico = codigoServico;
	}

	public long getCodigoServico() {
		return this.codigoServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public ArrayList<Funcionario> getListaDeFuncionariosAptos() {
		return listaDeFuncionariosAptos;
	}

	
	
	public void setListaDeFuncionariosAptos(ArrayList<Funcionario> listaDeFuncionariosAptos) {
		this.listaDeFuncionariosAptos = listaDeFuncionariosAptos;
	}

	public String toString() {
		return "- Código: " + this.codigoServico + " - Nome: " + this.nome + " - Descrição: " + this.descricao + " - Preço: "
				+ this.preco;
	}

}
