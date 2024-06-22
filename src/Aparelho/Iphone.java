package Aparelho;

import Device.AparelhoTelefonico;
import Device.NavegadorNaInternet;
import Device.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {

    private String numeroLinhaTefonica;
    private String nome = "(Não Definido)";
    private String modelo = "Iphone";
    private String nomeReprodutorMusical = "Music";
    private String nomeNavegadorNaInternet = "Safari";
    private String musicaAtual;
    private String urlAtual;
    
    //Setters
    public void setNumeroLinhaTefonica(String numeroLinhaTefonica) {
        this.numeroLinhaTefonica = numeroLinhaTefonica;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }

    private void setMusicaAtual(String musica) {
        this.musicaAtual = musica;
        
    }

    private void setUrlAtual(String url) {
        this.urlAtual = url;
        
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

    public String getNomeReprodutorMusical() {
        return nomeReprodutorMusical;
    }

    public String getNomeNavegadorNaInternet() {
        return nomeNavegadorNaInternet;
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

    public void abrir() {
        System.out.println("Aberto '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }

    public void pausar() {
        System.out.println("Pausado a musica '" + musicaAtual + "' no '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }

    public void selecionarMusica(String Musica) {
        setMusicaAtual(Musica);
        System.out.println("Selecionado a musica '" + musicaAtual + "' no '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }

    public void tocar() {
  
        System.out.println("Tocando a musica '" + musicaAtual + "' no '" + nomeReprodutorMusical + "' do '" + modelo + "' (" + nome + ")");
        
    }


    public void adicionarNovaAba() {
        System.out.println("Adicionado nova Aba no '" + nomeNavegadorNaInternet + "' do '" + modelo + "' (" + nome + ")");
        
    }

    public void atualizarPagina() {
        System.out.println("Atualizado a Pagina '" + urlAtual + "' no '" + nomeNavegadorNaInternet + "' do '" + modelo + "' (" + nome + ")");
        
    }
    
    public void exibirPagina(String url) {
        setUrlAtual(url);
        System.out.println("Exibido a Pagina '" + urlAtual + "' no '" + nomeNavegadorNaInternet + "' do '" + modelo + "' (" + nome + ")");
    } 

    

}
