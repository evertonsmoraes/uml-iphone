package Device;

public interface AparelhoTelefonico {
    public String modelo = null;
    public String numeroLinhaTefonica = null;

    public void ligar(String numero);
    public void atender();
    public void iniciarCorreioVoz();
    

}
