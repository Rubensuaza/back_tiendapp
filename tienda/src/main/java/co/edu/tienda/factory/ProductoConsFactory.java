package co.edu.tienda.factory;

import java.util.ArrayList;
import java.util.List;

import co.edu.tienda.dto.ProductoConsDTO;
import co.edu.tienda.entity.TiendaProductoEntity;

public class ProductoConsFactory {
	
	public List<ProductoConsDTO> entityToDTO(List<TiendaProductoEntity> tiendaProductoList){
		List<ProductoConsDTO> productoConsDTOs=new ArrayList<>();
		tiendaProductoList.forEach(producto->productoConsDTOs.add(entityToDTO(producto)));
		return productoConsDTOs;
	}

	private ProductoConsDTO entityToDTO(TiendaProductoEntity tiendaProductoEntity) {
		ProductoConsDTO productoConsDTO=new ProductoConsDTO();
		return productoConsDTO;
	}
}