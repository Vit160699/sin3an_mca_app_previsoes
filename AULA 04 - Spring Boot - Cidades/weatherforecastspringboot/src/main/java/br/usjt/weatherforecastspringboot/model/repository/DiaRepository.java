package br.usjt.weatherforecastspringboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.weatherforecastspringboot.model.Dia;

public interface DiaRepository extends JpaRepository<Dia, Long>{

}