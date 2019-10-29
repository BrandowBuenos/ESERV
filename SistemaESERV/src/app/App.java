package app;
import interfaces.*;
/**
 * APP
 */
public class App {

    public static void main(String[] args) {
    	GerenciarClientes gerenciamentoDeClientes = new GerenciarClientes();
    	GerenciarFuncionarios gerenciamentoDeFuncionarios = new GerenciarFuncionarios();
    	GerenciarEstoques gerenciamentoDeEstoque = new GerenciarEstoques();
    	GerenciarServicos gerenciamentoDeServicos = new GerenciarServicos();
    	
        Inicio in = new Inicio();
    }
}