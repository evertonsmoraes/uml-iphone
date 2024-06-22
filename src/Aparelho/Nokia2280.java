package Aparelho;

import Device.AparelhoTelefonico;
/**
	* <h1>Nokia2280 </h1>
	*Classe que simula um 'Nokia2280', implemtando interface: 'AparelhoTelefonico'
	* 
	* <b>Note:</b> Projeto Módulo "Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   22/06/2024
	*/
public class Nokia2280 implements AparelhoTelefonico {

    private String numeroLinhaTefonica;
    private String nome = "(Não Definido)";
    private String modelo = "Nokia 2280";
    
    //Setters
    public void setNumeroLinhaTefonica(String numeroLinhaTefonica) {
        this.numeroLinhaTefonica = numeroLinhaTefonica;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }


    //Gets
    public String getNumeroLinhaTefonica() {
        return numeroLinhaTefonica;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }


    //Metodos/Acoes
    public void ligarAparelho() {
        System.out.println("Ligando " + modelo);
    }
    
    public void desligarAparelho() {
        System.out.println("Desligando '" + modelo + "' (" + nome + ")");
    }

    public void atender() {
        System.out.println("Atendido ligação no '" + modelo + "' (" + nome + ")");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciado Correio de Voz no '" + modelo + "' (" + nome + ")");
        
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número '" + numero + "' pelo '" + modelo + "' (" + nome + ")");
        
    }
  

}
