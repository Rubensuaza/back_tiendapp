package co.edu.tienda.service;

import co.edu.tienda.dto.UsuarioTiendaDTO;


public interface UsuarioTiendappService {
	
	UsuarioTiendaDTO findById(String userName);

}
