package co.edu.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.tienda.dto.UsuarioTiendaDTO;
import co.edu.tienda.service.UsuarioTiendappService;

@RestController
@RequestMapping("/usuario-tiendapp")
public class UsuarioTiendappController {
	
	@Autowired
	UsuarioTiendappService usuarioTiendappService;	
	
	
	@Secured({"ROLE_ADMIN","ROLE_CONSULTA"})
	@GetMapping("/{userName}")
	public UsuarioTiendaDTO findById(@PathVariable String userName) {
		return usuarioTiendappService.findById(userName);
	}

}

