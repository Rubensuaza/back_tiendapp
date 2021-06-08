package co.edu.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.tienda.entity.UsuarioTiendapp;

@Repository
public interface UsuarioTiendappRepository extends JpaRepository<UsuarioTiendapp, Integer>{

}
