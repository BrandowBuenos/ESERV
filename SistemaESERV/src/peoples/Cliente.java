package peoples;

/**
 * A classe Cliente
 */
public class Cliente extends Pessoa {

	public Cliente(String nome, long cpf, String logradouro, int numero, String bairro, String cidade, String estado) {
		super(nome, cpf, logradouro, numero, bairro, cidade, estado);
	}

	public String toString() {

		return "\n- Nome: " + this.getNome() + "\n" + "- CPF: " + this.getCpf() + "\n";

	}
}