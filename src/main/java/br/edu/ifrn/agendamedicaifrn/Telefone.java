package br.edu.ifrn.agendamedicaifrn;

/**
 *
 * @author 20151148060161
 */
public class Telefone {
    private String nome;
    private boolean isWhatsapp;
    private Enum tipoTelefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIsWhatsapp() {
        return isWhatsapp;
    }

    public void setIsWhatsapp(boolean isWhatsapp) {
        this.isWhatsapp = isWhatsapp;
    }

    public Enum getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(Enum tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
    
    
}
