package br.edu.ifrn.agendamedicaifrn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrn.agendamedicaifrn.Paciente;
import br.edu.ifrn.agendamedicaifrn.repository.PacienteRepository;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteRepository pacientes;
	
	@PostMapping("/novoPaciente")
	public Paciente salvar(Paciente paciente) {
		return this.pacientes.save(paciente);
	}
	
	@GetMapping("/listar")
	public List<Paciente> listar() {
		return this.pacientes.findAll();
	}
	
	@DeleteMapping("/excluirPaciente")
	public void excluirPaciente(Paciente paciente) {
		this.pacientes.deleteById(paciente.getId());
	}
	
	@PutMapping("/atualizar")
	public Paciente atualizar(Paciente paciente) {
		return this.pacientes.save(paciente);
	}

}

//ver a parte de timelif (front end)
