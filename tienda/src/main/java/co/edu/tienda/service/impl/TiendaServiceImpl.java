package co.edu.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.entity.TiendaEntity;
import co.edu.tienda.repository.TiendaRepository;
import co.edu.tienda.service.TiendaService;

@Service
public class TiendaServiceImpl implements TiendaService{
	
	@Autowired
	private TiendaRepository tiendaRepository;

	@Override
	public List<TiendaEntity> findAll() {
		return tiendaRepository.findAll();
	}

	@Override
	public TiendaEntity findById(int id) {
		return tiendaRepository.findById(id).orElse(null);
	}
	
	

}
