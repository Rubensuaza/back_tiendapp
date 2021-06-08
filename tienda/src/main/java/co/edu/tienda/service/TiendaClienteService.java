package co.edu.tienda.service;

import java.util.List;

import co.edu.tienda.entity.TiendaClienteEntity;

public interface TiendaClienteService {
	
	List<TiendaClienteEntity> findAll();
	TiendaClienteEntity findById(int id);

}
