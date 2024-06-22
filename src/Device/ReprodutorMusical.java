package Device;
/**
	* <h1>NavegadorNaInternet </h1>
	*Interface para representar funcões e caracteristicas comuns/exigidas de um 'Reprodutor Musical'
	* 
	* <b>Note:</b> Projeto Módulo "Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   22/06/2024
	*/
public interface ReprodutorMusical {
	
    public String nome = "";

    public void abrir();
    public void tocar();
    public void pausar();
    public void selecionarMusica(String Musica);

    
} 