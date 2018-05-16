package br.edu.ifrn.agendamedicaifrn;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author 20151148060161
 */
@Entity
public class CadastroPendenteAPP {
    @Id
    private Integer id;
    private String nome;
    @CPF
    private String cpf;
    private String telefone;
    private String email;
    private Date dataNascimento;
    private boolean confirmado;
}
