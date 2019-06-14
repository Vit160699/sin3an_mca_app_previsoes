package br.usjt.weatherforecastspringboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.weatherforecastspringboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByUserAndPass(String user, String pass);
	
}