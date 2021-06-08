package co.edu.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.dto.ProductoConsDTO;
import co.edu.tienda.entity.TiendaProductoEntity;
import co.edu.tienda.repository.TiendaProductoRepository;
import co.edu.tienda.service.TiendaProductoService;

@Service
public class TiendaProductoServiceImpl implements TiendaProductoService {
	
	@Autowired
	private TiendaProductoRepository tiendaProductoRepository;

	@Override
	public List<TiendaProductoEntity> findAll() {
		return tiendaProductoRepository.findAll();
	}

	@Override
	public List<ProductoConsDTO> findProducts() {		
		return null;
	}

}
