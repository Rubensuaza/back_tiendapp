package co.edu.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.edu.tienda.entity.TipoDocumento;
import co.edu.tienda.service.TipoDocumentoService;

@RestController
@RequestMapping("/tipo-documento")
public class TipoDocumentoController {
	
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@GetMapping("/tipo-documento")
	public List<TipoDocumento> findAll(){
		return tipoDocumentoService.findAll();
	}
	

}
