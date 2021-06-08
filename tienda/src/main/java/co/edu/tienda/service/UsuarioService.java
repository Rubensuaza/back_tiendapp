package co.edu.tienda.service;

import java.util.List;

public interface UsuarioService {
	
	List<String> findByIdUserTend(int idUsuario);
	
	int findByUserName(String userName);
	

}
