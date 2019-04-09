package br.usjt.weatherforecastspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.weatherforecastspringboot.model.Usuario;
import br.usjt.weatherforecastspringboot.model.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public boolean logar(Usuario usuario) {
		return repo.findOneByUserAndPass(usuario.getUser(), usuario.getPass()) != null;
	}
	
}