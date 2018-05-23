package br.edu.ifrn.agendamedicaifrn;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author 20151148060161
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Profissional extends Pessoa implements Serializable{

    //Não precisa de atributo Id
    private int conselhoProfissional;
    private int numeroConselho;
    @Column(nullable = false)
    private boolean ehAPP;
    @ManyToOne
    private TipoProfissional tipoprofissional;
    
}
