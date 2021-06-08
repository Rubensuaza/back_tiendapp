package co.edu.tienda.service;

import java.util.List;

import co.edu.tienda.entity.TiendaEntity;

public interface TiendaService {
	
	List<TiendaEntity> findAll();
	TiendaEntity findById(int id);

}
