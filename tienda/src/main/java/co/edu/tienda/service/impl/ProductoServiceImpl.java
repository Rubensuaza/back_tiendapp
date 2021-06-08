package co.edu.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.entity.ProductoEntity;
import co.edu.tienda.repository.ProductoRepository;
import co.edu.tienda.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<ProductoEntity> findAll() {
		return productoRepository.findAll();
	}

}
