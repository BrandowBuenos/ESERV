package peoples;

/**
 * Funcionario
 */
public class Funcionario extends Pessoa {
	private static int nFuncionario = 0;
	private final int codigoFuncionario;

	private String cargo;
	private double valorHora;

	public Funcionario(String nome, long cpf, String cargo, double valorHora, String logradouro, int numero,
			String bairro, String cidade, String estado) {
		super(nome, cpf, logradouro, numero, bairro, cidade, estado);
		this.cargo = cargo;
		this.valorHora = valorHora;
		nFuncionario++;
		this.codigoFuncionario = nFuncionario;
	}

	public Funcionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public int getCodigoFuncionario() {
		return this.codigoFuncionario;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getValorHora() {
		return this.valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}