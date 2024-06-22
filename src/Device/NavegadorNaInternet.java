package Device;
/**
	* <h1>NavegadorNaInternet </h1>
	*Interface para representar funcões e caracteristicas comuns/exigidas de um 'Navegador na Internet'
	* 
	* <b>Note:</b> Projeto Módulo "Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   22/06/2024
	*/
public interface NavegadorNaInternet {
    public String nome = "";

    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();

}
