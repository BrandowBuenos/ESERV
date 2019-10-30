package peoples;

/**
 * Classe Cliente
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 */
public class Cliente extends Pessoa {

	/**
	 * Construtor da classe Cliente
	 * 
	 * @param nome
	 * @param cpf
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param estado
	 */
	public Cliente(String nome, long cpf, String logradouro, int numero, String bairro, String cidade, String estado) {
		super(nome, cpf, logradouro, numero, bairro, cidade, estado);
	}

	/**
	 * Retorna um to String
	 */
	public String toString() {

		return "\n- Nome: " + this.getNome() + "\n" + "- CPF: " + this.getCpf() + "\n";

	}
}