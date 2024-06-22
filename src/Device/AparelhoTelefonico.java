package Device;
/**
	* <h1>AparelhoTelefonico </h1>
	*Interface para representar funcões e caracteristicas comuns/exigidas de um 'Aparelho Telefônico'
	* 
	* <b>Note:</b> Projeto Módulo "Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   22/06/2024
	*/
public interface AparelhoTelefonico {
    public String modelo = null;
    public String numeroLinhaTefonica = null;

    public void ligar(String numero);
    public void atender();
    public void iniciarCorreioVoz();
    

}
