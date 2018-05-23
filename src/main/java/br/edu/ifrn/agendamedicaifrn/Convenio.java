package br.edu.ifrn.agendamedicaifrn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author 20151148060161
 */
@Entity
public class Convenio {
    @Id
    private Integer id;
    private String nome;
    private String registroANS;
    private String razaoSocial;
    private String cnpj;
    private String codigoCNS;
    private String email;
    private String telefone;
    private int periodoRetorno;
    @Column(nullable = false)
    private boolean particular;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroANS() {
        return registroANS;
    }

    public void setRegistroANS(String registroANS) {
        this.registroANS = registroANS;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigoCNS() {
        return codigoCNS;
    }

    public void setCodigoCNS(String codigoCNS) {
        this.codigoCNS = codigoCNS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPeriodoRetorno() {
        return periodoRetorno;
    }

    public void setPeriodoRetorno(int periodoRetorno) {
        this.periodoRetorno = periodoRetorno;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }
    
    
    
    
}
