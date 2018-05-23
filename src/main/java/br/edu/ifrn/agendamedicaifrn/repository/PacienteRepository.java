package br.edu.ifrn.agendamedicaifrn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.agendamedicaifrn.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
