package stocks;

/**
 * Produto
 */
public class Produto {

	private static int nProduto = 0;
	private final int codigoProduto;

	private String nome;
	private String descricao;
	private int quantidade;
	private float precoUnitario;

	public Produto(String nome, int quantidade, float precoUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		nProduto++;
		this.codigoProduto = nProduto;
	}

	public Produto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getCodigoProduto() {
		return this.codigoProduto;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPrecoUnitario() {
		return this.precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String toString() {
		return "- Código:" + this.codigoProduto + "- Nome:" + this.nome + "- Descrição:" + this.descricao
				+ "- Quantidade:" + this.quantidade + "- Preço Unitário:" + this.precoUnitario;
	}
}