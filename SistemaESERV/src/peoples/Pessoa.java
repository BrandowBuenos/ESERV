package peoples;

/**
 * Pessoa
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

	public Pessoa(String nome, long cpf, String logradouro, int numero, String bairro, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Pessoa() {
	};

	public long getCpf() {
		return this.cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getRg() {
		return this.rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getCep() {
		return this.cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public Long getTelefoneResidencial() {
		return this.telefoneResidencial;
	}

	public void setTelefoneResidencial(Long telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public Long getTelefoneCelular() {
		return this.telefoneCelular;
	}

	public void setTelefoneCelular(Long telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}