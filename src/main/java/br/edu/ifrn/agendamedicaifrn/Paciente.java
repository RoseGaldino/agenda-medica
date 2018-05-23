package br.edu.ifrn.agendamedicaifrn;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author 20151148060161
 */
@Inheritance(strategy = InheritanceType.JOINED)
public class Paciente extends Pessoa{
    
}
