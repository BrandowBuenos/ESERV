package interfaces;

import peoples.Funcionario;
import java.util.ArrayList;

import services.ServicosController;
import services.Servico;


public class GerenciarServicos {
	
    private static ServicosController gerenciamentoDeServicos;
    
    public GerenciarServicos(){
        gerenciamentoDeServicos = new ServicosController();
    }
    protected static void adicionarServico(Servico s,ArrayList<Funcionario> funcionariosAptos){
    	gerenciamentoDeServicos.add(s,funcionariosAptos);
    }
    protected static Servico consultarServico(long cod){
        return gerenciamentoDeServicos.get(cod);
    }
    protected static String consultarServico(){
        return gerenciamentoDeServicos.get();
    }
    protected static void editarServico(Servico s,long cod){
    	gerenciamentoDeServicos.set(s, cod);
    }
    protected static void excluirServico(long cod){
    	gerenciamentoDeServicos.remove(cod);
    }
    
    
    
}

