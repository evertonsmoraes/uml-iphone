package Aparelho;

import Device.AparelhoTelefonico;
import Device.NavegadorNaInternet;
import Device.ReprodutorMusical;
    /**
	* <h1>Iphone </h1>
	*Classe que simula um 'Iphone', implemtando interfaces: 'AparelhoTelefonico', 'ReprodutorMusical' e 'NavegadorNaInternet'
	* 
	* <b>Note:</b> Projeto Módulo "Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   22/06/2024
	*/

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {

    private String numeroLinhaTefonica;
    private String nome = "(Não Definido)";
    private String modelo = "Iphone";
    private String nomeReprodutorMusical = "Music";
    private String nomeNavegadorNaInternet = "Safari";
    private String musicaAtual;
    private String urlAtual;
    
    //Setters
    /**
	* Este método é para configurar o Número da Linha Telefônica
	* @param numeroLinhaTefonica Número da Linha Telefônica (String)
	*/
    public void setNumeroLinhaTefonica(String numeroLinhaTefonica) {
        this.numeroLinhaTefonica = numeroLinhaTefonica;
        
    }
    
    /**
	* Este método é para configurar o Nome do Aparelho
    * @param nome Nome do Aparelho (String)
	*/
    public void setNome(String nome) {
        this.nome = nome;
        
    }

    /**
	* Este método é para configurar a Musica Atual
	* @param musica Musica Atual (String)
	*/
    private void setMusicaAtual(String musica) {
        this.musicaAtual = musica;
        
    }
    
    /**
	* Este método é para configurar a URL Atual
	* @param url URL Atual (String)
	*/
    private void setUrlAtual(String url) {
        this.urlAtual = url;
        
    }

    //Gets
    /**
	* Este método é para recuperar/consultar o Número da Linha Telefônica
	* @return String o resultado deste método é o Número da Linha Telefônica
	*/
    public String getNumeroLinhaTefonica() {
        return numeroLinhaTefonica;
    }

    /**
	* Este método é para recuperar/consultar o Nome do Aparelho
	* @return String o resultado deste método é o Nome do Aparelho
	*/
    public String getNome() {
        return nome;
    }

    /**
	* Este método é para recuperar/consultar o Modelo do Aparelho
	* @return String o resultado deste método é o Modelo do Aparelho
	*/
    public String getModelo() {
        return modelo;
    }

    /**
	* Este método é para recuperar/consultar o Nome do Reprodutor de Música do Aparelho
	* @return String o resultado deste método é o Nome do Reprodutor de Música do Aparelho
	*/
    public String getNomeReprodutorMusical() {
        return nomeReprodutorMusical;
    }
     
    /**
	* Este método é para recuperar/consultar o Nome do Navegador na Internet do Aparelho
	* @return String o resultado deste método é o Nome do Navegador na Internet
	*/
    public String getNomeNavegadorNaInternet() {
        return nomeNavegadorNaInternet;
    }  

    //Metodos/Acoes
    /**
	* Este método é para Ligar o Aparelho
	*/
    public void ligarAparelho() {
        System.out.println("Ligando " + modelo);
    }
    
    /**
	* Este método é para Desligar o Aparelho
	*/
    public void desligarAparelho() {
        System.out.println("Desligando '" + modelo + "' (" + nome + ")");
    }

    /**
	* Este método é para Atender Ligação (AparelhoTelefonico)
	*/
    public void atender() {
        System.out.println("Atendido ligação no '" + modelo + "' (" + nome + ")");
    }

    /**
	* Este método é para Iniciar Correio de Voz (AparelhoTelefonico)
	*/
    public void iniciarCorreioVoz() {
        System.out.println("Iniciado Correio de Voz no '" + modelo + "' (" + nome + ")");
        
    }

    /**
	* Este método é para realizar uma Ligação Telefônica (AparelhoTelefonico)
    * @param numero Número Telefônicao a ser ligado (String)
	*/
    public void ligar(String numero) {
        System.out.println("Ligando para o número '" + numero + "' pelo '" + modelo + "' (" + nome + ")");
        
    }

    /**
	* Este método é para abrir o Reprodutor Musical (ReprodutorMusical)
	*/
    public void abrir() {
        System.out.println("Aberto '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }

    /**
	* Este método é para pausar a música (ReprodutorMusical)
	*/
    public void pausar() {
        System.out.println("Pausado a musica '" + musicaAtual + "' no '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }

    /**
	* Este método é para selecionar a música (ReprodutorMusical)
    * @param Musica Música a ser selecionada (String)
	*/
    public void selecionarMusica(String Musica) {
        setMusicaAtual(Musica);
        System.out.println("Selecionado a musica '" + musicaAtual + "' no '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }

    /**
	* Este método é para tocar a música (ReprodutorMusical)
	*/
    public void tocar() {
  
        System.out.println("Tocando a musica '" + musicaAtual + "' no '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }

    /**
	* Este método é para adicionar uma nova aba (NavegadorNaInternet)
	*/
    public void adicionarNovaAba() {
        System.out.println("Adicionado nova Aba no '" + nomeNavegadorNaInternet + "' do '" + modelo + "' (" + nome + ")");
        
    }

    /**
	* Este método é para atualizar a página (NavegadorNaInternet)
	*/
    public void atualizarPagina() {
        System.out.println("Atualizado a Pagina '" + urlAtual + "' no '" + nomeNavegadorNaInternet + "' do '" + modelo + "' (" + nome + ")");
        
    }
    
    /**
	* Este método é para exibir a página (NavegadorNaInternet)
    * @param url Site a ser exibido/acessado (String)
	*/
    public void exibirPagina(String url) {
        setUrlAtual(url);
        System.out.println("Exibido a Pagina '" + urlAtual + "' no '" + nomeNavegadorNaInternet + "' do '" + modelo + "' (" + nome + ")");
    } 

    

}
