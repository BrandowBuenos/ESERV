package stocks;

/**
 * Classe Produto
 * 
 * @author Brandow Buenos
 * @author Willian Clemente
 */
public class Produto {

	private static int nProduto = 0;
	private final int codigoProduto;

	private String nome;
	private String descricao;
	private int quantidade;
	private float precoUnitario;

	/**
	 * Construtor da classe Produto
	 * 
	 * @param nome
	 * @param quantidade
	 * @param precoUnitario
	 */
	public Produto(String nome, int quantidade, float precoUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		nProduto++;
		this.codigoProduto = nProduto;
	}

	/**
	 * Segundo construtor da classe Produto para que não haja alteração do código
	 * único
	 * 
	 * @param codigoProduto
	 */
	public Produto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	/**
	 * Retorna o codigo do produto
	 * 
	 * @return codigo
	 */
	public int getCodigoProduto() {
		return this.codigoProduto;
	}

	/**
	 * Retorna o nome do produto
	 * 
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Modifica o nome do produto
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a descricao do produto
	 * 
	 * @return descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * Modifica a descricao do produto
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Retorna a quantidade do produto
	 * 
	 * @return quantidade
	 */
	public int getQuantidade() {
		return this.quantidade;
	}

	/**
	 * Modifica a quantidade do produto
	 * 
	 * @param quantidade
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * Retira o preço do produto
	 * 
	 * @return preco unitario
	 */
	public float getPrecoUnitario() {
		return this.precoUnitario;
	}

	/**
	 * Modifica o preço do produto
	 * 
	 * @param precoUnitario
	 */
	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	/**
	 * Retorna um toString das informações do produto
	 */
	public String toString() {
		return "Código:" + this.codigoProduto + "- Nome:" + this.nome + "- Descrição:" + this.descricao
				+ "- Quantidade:" + this.quantidade + "- Preço Unitário:" + this.precoUnitario;
	}
}