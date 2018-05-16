package br.edu.ifrn.agendamedicaifrn;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author 20151148060161
 */
@Entity
public class Estado implements Serializable {
    
    @Id
    //@SeguenceGenerator(initialvalue = 1, allocationSize = 1, name = "")
    private Integer id;
    //private String sigla;
    private String nome;
    @ManyToOne
    private Estado estado;
    
}
