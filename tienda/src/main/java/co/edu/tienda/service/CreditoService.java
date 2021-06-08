package co.edu.tienda.service;

import java.util.List;

import co.edu.tienda.dto.CreditoDTO;
import co.edu.tienda.entity.CreditoEntity;

public interface CreditoService {
	
	List<CreditoEntity> findAll();
	void insertar(CreditoDTO creditoDTO);

}
