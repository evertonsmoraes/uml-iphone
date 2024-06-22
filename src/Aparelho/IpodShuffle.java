package Aparelho;

import Device.ReprodutorMusical;

public class IpodShuffle implements  ReprodutorMusical{

    private String nome = "(Não Definido)";
    private String modelo = "Ipod Shuflle";
    private String nomeReprodutorMusical = "Itunes";
    private String musicaAtual;

    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
        
    }

    private void setMusicaAtual(String musica) {
        this.musicaAtual = musica;
        
    }



    //Gets
    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeReprodutorMusical() {
        return nomeReprodutorMusical;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    //Metodos/Acoes
    public void ligarAparelho() {
        System.out.println("Ligando " + modelo);
    }

    public void desligarAparelho() {
        System.out.println("Desligando '" + modelo + "' (" + nome + ")");
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
   

}
