package co.edu.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.entity.ProductoCreditoEntity;
import co.edu.tienda.repository.ProductoCreditoRepository;
import co.edu.tienda.service.ProductoCreditoService;

@Service
public class ProductoCreditoServiceImpl implements ProductoCreditoService {
	
	@Autowired
	private ProductoCreditoRepository productoCreditoRepository;

	@Override
	public List<ProductoCreditoEntity> findAll() {
		return productoCreditoRepository.findAll();
	}

}
