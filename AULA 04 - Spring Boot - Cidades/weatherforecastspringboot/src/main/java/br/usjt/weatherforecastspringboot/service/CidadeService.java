package br.usjt.weatherforecastspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.weatherforecastspringboot.model.Cidade;
import br.usjt.weatherforecastspringboot.model.repository.CidadeRepository;

public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public void salvar(Cidade cidade) {
		repo.save(cidade);
	}
	
	public List<Cidade> listarCidade() {
		return repo.findAll();
	}
	
	public void excluir(Cidade cidade) {
		repo.delete(cidade);
	}
}