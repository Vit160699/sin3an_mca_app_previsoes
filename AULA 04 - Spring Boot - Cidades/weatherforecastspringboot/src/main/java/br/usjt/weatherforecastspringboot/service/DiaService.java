package br.usjt.weatherforecastspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.weatherforecastspringboot.model.Dia;
import br.usjt.weatherforecastspringboot.model.repository.DiaRepository;

public class DiaService {
	
	@Autowired
	private DiaRepository repo;
	
	public void salvar(Dia dia) {
		repo.save(dia);
	}
	
	public List<Dia> listarDias() {
		return repo.findAll();
	}
	
	public void excluir(Dia dia) {
		repo.delete(dia);
	}
}