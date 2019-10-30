package peoples;

/**
 * Classe Funcionário
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 */
public class Funcionario extends Pessoa {
	private static int nFuncionario = 0;
	private final int codigoFuncionario;

	private String cargo;
	private double valorHora;

	/**
	 * Construtor da classe funcionário
	 * 
	 * @param nome
	 * @param cpf
	 * @param cargo
	 * @param valorHora
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param estado
	 */
	public Funcionario(String nome, long cpf, String cargo, double valorHora, String logradouro, int numero,
			String bairro, String cidade, String estado) {
		super(nome, cpf, logradouro, numero, bairro, cidade, estado);
		this.cargo = cargo;
		this.valorHora = valorHora;
		nFuncionario++;
		this.codigoFuncionario = nFuncionario;
	}

	/**
	 * Segundo Construtor da Classe Funcionário para não alterar o código único ao
	 * ser editado
	 * 
	 * @param codigoFuncionario
	 */
	public Funcionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	/**
	 * Retorna o código único do funcionário
	 * 
	 * @return
	 */
	public int getCodigoFuncionario() {
		return this.codigoFuncionario;
	}

	/**
	 * Retorna o cargo do funcionário
	 * 
	 * @return
	 */
	public String getCargo() {
		return this.cargo;
	}

	/**
	 * Modifica o cargo do funcionário
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * Retorna o Valor Hora do funcionário
	 * 
	 * @return
	 */
	public double getValorHora() {
		return this.valorHora;
	}

	/**
	 * Modifica o Valor Hora do Funcionário
	 * 
	 * @param valorHora
	 */
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}