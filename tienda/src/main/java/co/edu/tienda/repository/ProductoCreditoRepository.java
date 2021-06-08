package co.edu.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.tienda.entity.ProductoCreditoEntity;

@Repository
public interface ProductoCreditoRepository extends JpaRepository<ProductoCreditoEntity, Integer> {

}
