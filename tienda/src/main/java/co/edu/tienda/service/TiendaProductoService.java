package co.edu.tienda.service;

import java.util.List;

import co.edu.tienda.dto.ProductoConsDTO;
import co.edu.tienda.entity.TiendaProductoEntity;

public interface TiendaProductoService {
	
	List<TiendaProductoEntity> findAll();
	List<ProductoConsDTO> findProducts();

}
