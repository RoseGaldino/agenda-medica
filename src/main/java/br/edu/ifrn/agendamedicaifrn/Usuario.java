package br.edu.ifrn.agendamedicaifrn;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author 20151148060161
 */
@Entity
public class Usuario extends Pessoa implements Serializable{
    private String senha;

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
