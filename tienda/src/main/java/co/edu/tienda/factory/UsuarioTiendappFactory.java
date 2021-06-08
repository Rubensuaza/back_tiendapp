package co.edu.tienda.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.tienda.dto.UsuarioTiendaDTO;
import co.edu.tienda.entity.UsuarioTiendapp;
import co.edu.tienda.service.UsuarioService;


@Component
public class UsuarioTiendappFactory {
	
	@Autowired
	private UsuarioService usuarioService;
	
	public UsuarioTiendaDTO usuarioTiendappToDTO(UsuarioTiendapp usuarioTiendapp) {
		UsuarioTiendaDTO usuarioTiendaDTO=new UsuarioTiendaDTO();
		usuarioTiendaDTO.setIdUsuarioTienda(usuarioTiendapp.getIdUsuarioTienda());
		usuarioTiendaDTO.setNombre(usuarioTiendapp.getNombre());
		usuarioTiendaDTO.setApellido(usuarioTiendapp.getApellido());
		usuarioTiendaDTO.setTipoDocumento(usuarioTiendapp.getTipoDocumento().getNombreDocumento());
		usuarioTiendaDTO.setNumeroDocumento(usuarioTiendapp.getNumeroDocumento());
		usuarioTiendaDTO.setDireccion(usuarioTiendapp.getDireccion());
		usuarioTiendaDTO.setCorreo(usuarioTiendapp.getCorreo());
		usuarioTiendaDTO.setNumeroTelefono(usuarioTiendapp.getNumeroTelefono());
		usuarioTiendaDTO.setRoles(traductor(usuarioService.findByIdUserTend(usuarioTiendapp.getIdUsuario())));
		return usuarioTiendaDTO;
	}
	
	private List<String> traductor(List<String> origen){
		List<String> roles=new ArrayList<String>();
		for (String rol : origen) {
			if(rol.equals("ROLE_ADMIN")) {
				roles.add("Administrador");
			}else {
				roles.add("Cliente");
			}
			
		}
		return roles;
		
	}

}
