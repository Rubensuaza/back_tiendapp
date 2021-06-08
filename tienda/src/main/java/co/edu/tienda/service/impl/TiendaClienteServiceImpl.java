package co.edu.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.entity.TiendaClienteEntity;
import co.edu.tienda.repository.TiendaClienteRepository;
import co.edu.tienda.service.TiendaClienteService;

@Service
public class TiendaClienteServiceImpl implements TiendaClienteService{
	
	@Autowired
	private TiendaClienteRepository tiendaClienteRepository;

	@Override
	public List<TiendaClienteEntity> findAll() {
		return tiendaClienteRepository.findAll();
	}

	@Override
	public TiendaClienteEntity findById(int id) {
		return tiendaClienteRepository.findById(id).orElse(null);
	}

}
