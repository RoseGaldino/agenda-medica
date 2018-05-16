package br.edu.ifrn.agendamedicaifrn;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author 20151148060161
 */
@Entity
public class LocalAtendimento {
    @Id
    private Integer id;
    private String nomeFantasia;
    private String cnpj;
    private String razaoSocial;
    private String cnes;
    private String email;
    private String telefone;
    private String celular;
    private String cep;
    private String endereco;
    private int numero;
    private String complemento;
    private String Bairro;
    private Double latitude;
    private Double longitude;
    
}
