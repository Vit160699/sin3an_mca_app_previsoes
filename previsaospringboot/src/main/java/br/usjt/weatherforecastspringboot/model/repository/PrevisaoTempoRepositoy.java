package br.usjt.weatherforecastspringboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.weatherforecastspringboot.model.PrevisaoTempo;

public interface PrevisaoTempoRepositoy extends JpaRepository<PrevisaoTempo, Long> {
	
}