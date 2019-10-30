package peoples;

/**
 * Classe abstrata Pessoa
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 */
public abstract class Pessoa {

	protected long cpf;
	protected String nome;
	protected long rg;
	protected String logradouro;
	protected int numero;
	protected String complemento;
	protected String bairro;
	protected String cidade;
	protected String estado;
	protected long cep;
	protected long telefoneResidencial;
	protected long telefoneCelular;
	protected String email;

	/**
	 * Construtor da classe Pessoa
	 * 
	 * @param nome
	 * @param cpf
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param estado
	 */
	public Pessoa(String nome, long cpf, String logradouro, int numero, String bairro, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	/**
	 * Construtor vazio da classe Pessoa
	 */
	public Pessoa() {
	};

	/**
	 * Retorna o CPF da Pessoa
	 * 
	 * @return cpf
	 */
	public long getCpf() {
		return this.cpf;
	}

	/**
	 * Modifica o cpf
	 * 
	 * @param cpf
	 */
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	/**
	 * Retorna o nome da Pessoa
	 * 
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Modifica o nome da Pessoa
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o RG da pessoa
	 * 
	 * @return rg
	 */
	public long getRg() {
		return this.rg;
	}

	/**
	 * Modifica o rg da pessoa
	 * 
	 * @param rg
	 */
	public void setRg(long rg) {
		this.rg = rg;
	}

	/**
	 * Retorna o logradouro da pessoa
	 * 
	 * @return logradouro
	 */
	public String getLogradouro() {
		return this.logradouro;
	}

	/**
	 * Modifica o logradouro da Pessoa
	 * 
	 * @param logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * Retorna o numero da pessoa
	 * 
	 * @return numero
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * Modifica o numero da Pessoa
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Retorna o complemento da pessoa
	 * 
	 * @return complemento
	 */
	public String getComplemento() {
		return this.complemento;
	}

	/**
	 * Modifica o complemento da Pessoa
	 * 
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Retora o bairro da pessoa
	 * 
	 * @return bairro
	 */
	public String getBairro() {
		return this.bairro;
	}

	/**
	 * Modifica o bairro da Pessoa
	 * 
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Retorna a cidade da pessoa
	 * 
	 * @return cidade
	 */
	public String getCidade() {
		return this.cidade;
	}

	/**
	 * Modifica a cidade da Pessoa
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Retorna o estado da pessoa
	 * 
	 * @return estado
	 */
	public String getEstado() {
		return this.estado;
	}

	/**
	 * Modifica o estado da Pessoa
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Retorna o CEP da pessoa
	 * 
	 * @return cep
	 */
	public long getCep() {
		return this.cep;
	}

	/**
	 * Modifica o cep da Pessoa
	 * 
	 * @param cep
	 */
	public void setCep(long cep) {
		this.cep = cep;
	}

	/**
	 * Retorna o telefone residencial da pessoa
	 * 
	 * @return telefoneResidencial
	 */
	public Long getTelefoneResidencial() {
		return this.telefoneResidencial;
	}

	/**
	 * Modifica o telefone residencial da Pessoa
	 * 
	 * @param nome
	 */
	public void setTelefoneResidencial(Long telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	/**
	 * Retorna o telefone celular da pessoa
	 * 
	 * @return telefoneCelular
	 */
	public Long getTelefoneCelular() {
		return this.telefoneCelular;
	}

	/**
	 * Modifica o telefone celular da Pessoa
	 * 
	 * @param nome
	 */
	public void setTelefoneCelular(Long telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	/**
	 * Retorna o email da pessoa
	 * 
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Modifica o email da Pessoa
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}