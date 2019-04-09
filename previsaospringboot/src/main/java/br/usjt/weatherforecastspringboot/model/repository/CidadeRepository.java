package br.usjt.weatherforecastspringboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.weatherforecastspringboot.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
