package services;
import java.sql.Date;

/**
 * ServicoPrestado
 */
public class ServicoPrestado {

    private int codigo;
    private String servico;
    private String cliente;
    private String funcionario;
    private Date data;
    private String horaInicial;
    private String horaFinal;
    private String relacaoProdutosUtilizados;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getServico() {
        return this.servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHoraInicial() {
        return this.horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return this.horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getRelacaoProdutosUtilizados() {
        return this.relacaoProdutosUtilizados;
    }

    public void setRelacaoProdutosUtilizados(String relacaoProdutosUtilizados) {
        this.relacaoProdutosUtilizados = relacaoProdutosUtilizados;
    }

    public String toString() {
       return "- Código:" + this.codigo + "- Serviço:" + this.servico + "- Cliente:" + this.cliente + "- Funcionário:" + this.funcionario + "- Data:" + this.data + "- Hora Inicial:" + this.horaInicial + "- Hora Final:" + this.horaFinal + "- Produtos Utilizados:" +this.relacaoProdutosUtilizados;
    }

}