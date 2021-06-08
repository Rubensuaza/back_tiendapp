package co.edu.tienda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="productos_credito")
public class ProductoCreditoEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id_producto_credito")
	private Integer idProductoCredito;
	@ManyToOne
	@JoinColumn(name="id_credito")
	private CreditoEntity creditoEntity;
	@ManyToOne
	@JoinColumn(name="id_producto")
	private ProductoEntity productoEntity;
	@Column(name="cantidad")
	private double cantidad;
	@Column(name="valor_unitario")
	private double valorUnitario;
	


}
