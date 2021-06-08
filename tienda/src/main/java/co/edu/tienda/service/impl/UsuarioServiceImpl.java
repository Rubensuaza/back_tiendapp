package co.edu.tienda.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.repository.UsuarioRepository;
import co.edu.tienda.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<String> findByIdUserTend(int idUsuario) {
		return usuarioRepository.findByForekeyId(idUsuario);
	}

	@Override
	public int findByUserName(String userName) {
		return usuarioRepository.findByUserName(userName);
	}

	
	
	
	
	
	
}
