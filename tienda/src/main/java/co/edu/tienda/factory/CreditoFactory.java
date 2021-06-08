package co.edu.tienda.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.tienda.dto.CreditoDTO;
import co.edu.tienda.entity.CreditoEntity;
import co.edu.tienda.service.TiendaClienteService;

@Component
public class CreditoFactory {
	
	@Autowired
	private TiendaClienteService tiendaClienteService;
	
	public CreditoEntity creditoDTOToEntity(CreditoDTO creditoDTO) {
		CreditoEntity creditoEntity=new CreditoEntity();
		creditoEntity.setIdCredito(creditoDTO.getIdCredito());
		creditoEntity.setTiendaClienteEntity(tiendaClienteService.findById(creditoDTO.getIdTiendaClienteEntity()));
		creditoEntity.setFechaCredito(creditoDTO.getFechaCredito());
		creditoEntity.setCupo(creditoDTO.getCupo());
		creditoEntity.setActivo('N');
		return creditoEntity;
	}

}
