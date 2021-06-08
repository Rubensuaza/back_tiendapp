package co.edu.tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.edu.tienda.entity.TiendaProductoEntity;

@Repository
public interface TiendaProductoRepository extends JpaRepository<TiendaProductoEntity, Integer>{
	
	@Query( value = "SELECT * FROM tienda_producto tp JOIN tienda t  ON tp.id_tienda=t.id_tienda JOIN producto p ON tp.id_producto=p.id_producto  WHERE t.id_tienda LIKE %:idTienda%",   nativeQuery = true)
	List<TiendaProductoEntity> findProducts(@Param("idTienda") int idTienda);

}
