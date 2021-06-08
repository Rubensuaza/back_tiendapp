package co.edu.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.tienda.entity.CreditoEntity;

@Repository
public interface CreditoRepository extends JpaRepository<CreditoEntity, Integer> {

}
