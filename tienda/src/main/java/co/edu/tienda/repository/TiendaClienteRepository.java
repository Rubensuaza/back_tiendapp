package co.edu.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.tienda.entity.TiendaClienteEntity;

@Repository
public interface TiendaClienteRepository extends JpaRepository<TiendaClienteEntity, Integer>{

}
