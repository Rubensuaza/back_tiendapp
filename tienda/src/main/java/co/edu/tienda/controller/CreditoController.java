package co.edu.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.tienda.dto.CreditoDTO;
import co.edu.tienda.entity.CreditoEntity;
import co.edu.tienda.service.CreditoService;

@RestController
@RequestMapping("/credito")
public class CreditoController {
	@Autowired
	private CreditoService creditoService;
	
	@GetMapping("/creditos")
	public List<CreditoEntity> findAll() {return creditoService.findAll();}
	
	@PostMapping("/credito")
	public void insertar(@RequestBody CreditoDTO creditoDTO) {
		creditoService.insertar(creditoDTO);
	}

}
