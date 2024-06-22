package Loja;

import Aparelho.Iphone;
import Aparelho.IpodShuffle;
import Aparelho.Nokia2280;

public class Produtos {
    public static void main(String[] args) {
        
    
    //objetos/produtos disponiveis
    Iphone iphoneDisponivel = new Iphone();
    Nokia2280 nokia2280Disponivel = new Nokia2280();
    IpodShuffle ipodShuffleDisponivel = new IpodShuffle();

    //Ligando aparelhos
    System.out.printf("\n--Ligando os Aparelhos--\n");
    iphoneDisponivel.ligarAparelho();
    nokia2280Disponivel.ligarAparelho();
    ipodShuffleDisponivel.ligarAparelho();
    
    //configuracao inicial dos produtos disponiveis
    System.out.printf("\n--Configurando as Linhas Telefonicas--\n");
    iphoneDisponivel.setNumeroLinhaTefonica("11990908080");
    nokia2280Disponivel.setNumeroLinhaTefonica("11970705555");
    System.out.println("Configurado Tefefonica do "+iphoneDisponivel.getModelo()+" para '"+iphoneDisponivel.getNumeroLinhaTefonica()+"' ");
    System.out.println("Configurado Tefefonica do "+iphoneDisponivel.getModelo()+" para '"+iphoneDisponivel.getNumeroLinhaTefonica()+"' ");
        
    //Verificando nomes
    System.out.printf("\n--Verficando os Nomes dos Aparelhos Atuais--\n");
    System.out.println("Nome Atual do "+iphoneDisponivel.getModelo()+": '"+iphoneDisponivel.getNome()+"' ");
    System.out.println("Nome Atual do "+nokia2280Disponivel.getModelo()+": '"+nokia2280Disponivel.getNome()+"' ");
    System.out.println("Nome Atual do "+ipodShuffleDisponivel.getModelo()+": '"+ipodShuffleDisponivel.getNome()+"' ");
    

    //Configurando nomes de acordo com os compradores
    System.out.printf("\n--Configurando os Nomes dos Aparelhos Atuais--\n");
    iphoneDisponivel.setNome("Iphone do Bruno");
    nokia2280Disponivel.setNome("Nokia do Marcelo");
    ipodShuffleDisponivel.setNome("Ipod da Camila");
    System.out.println("Configurado Nome do "+iphoneDisponivel.getModelo()+" para '"+iphoneDisponivel.getNome()+"' ");
    System.out.println("Configurado Nome do "+nokia2280Disponivel.getModelo()+" para '"+nokia2280Disponivel.getNome()+"' ");
    System.out.println("Configurado Nome do "+ipodShuffleDisponivel.getModelo()+" para '"+ipodShuffleDisponivel.getNome()+"' ");

    //Testes iniciais
    System.out.printf("\n--Realizando teste de funcionalidades básicas--\n");
    System.out.printf("\n--Iphone--\n");
    //Funções Aparelho Tefonico
    iphoneDisponivel.ligar("1147904790");
    //Funções Reprodutor Musical
    iphoneDisponivel.selecionarMusica("We Will Rock You,Queen");
    iphoneDisponivel.tocar();
    iphoneDisponivel.pausar();
    //Fuções Navegador na Internet
    iphoneDisponivel.exibirPagina("https://www.google.com.br/");
    iphoneDisponivel.atualizarPagina();
    iphoneDisponivel.adicionarNovaAba();

    
    System.out.printf("\n--Nokia 2280--\n");
    nokia2280Disponivel.ligar("1147904790");
    
    System.out.printf("\n--Ipod Shuffle--\n");
    ipodShuffleDisponivel.selecionarMusica("We Will Rock You,Queen");
    ipodShuffleDisponivel.tocar();
    ipodShuffleDisponivel.pausar();

    //Desligando os Aparelhos
    System.out.printf("\n--Desligando os Aparelhos--\n");
    iphoneDisponivel.desligarAparelho();
    nokia2280Disponivel.desligarAparelho();
    ipodShuffleDisponivel.desligarAparelho();


    }

}
