package co.edu.tienda.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.dto.UsuarioTiendaDTO;
import co.edu.tienda.factory.UsuarioTiendappFactory;
import co.edu.tienda.repository.UsuarioTiendappRepository;
import co.edu.tienda.service.UsuarioService;
import co.edu.tienda.service.UsuarioTiendappService;

@Service
public class UsuarioTiendappImpl implements UsuarioTiendappService {
	
	@Autowired
	private UsuarioTiendappRepository usuarioTiendappRepository;
	
	@Autowired
	private UsuarioTiendappFactory usuarioTiendappFactory; 
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public UsuarioTiendaDTO findById(String userName) {	
		int idUsuario=usuarioService.findByUserName(userName);
		return usuarioTiendappFactory.usuarioTiendappToDTO(usuarioTiendappRepository.findById(idUsuario).orElse(null));
	}

	
	
	

}
