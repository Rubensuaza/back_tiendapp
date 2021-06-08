package co.edu.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.dto.CreditoDTO;
import co.edu.tienda.entity.CreditoEntity;
import co.edu.tienda.factory.CreditoFactory;
import co.edu.tienda.repository.CreditoRepository;
import co.edu.tienda.service.CreditoService;

@Service
public class CreditoServiceImpl implements CreditoService{
	
	@Autowired
	private CreditoRepository creditoRepository;	
	
	@Autowired
	private CreditoFactory creditoFactory;

	@Override
	public List<CreditoEntity> findAll() {
		return creditoRepository.findAll();
	}

	@Override
	public void insertar(CreditoDTO creditoDTO) {
		creditoRepository.save(creditoFactory.creditoDTOToEntity(creditoDTO));
	}

}
