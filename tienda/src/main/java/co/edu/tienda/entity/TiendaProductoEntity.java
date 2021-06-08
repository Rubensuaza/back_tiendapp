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
@Table(name="tienda_producto")
public class TiendaProductoEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id_tienda_producto")
	private	Integer idTiendaProducto;
	@ManyToOne
	@JoinColumn(name="id_tienda")
	private TiendaEntity tienda;
	@ManyToOne
	@JoinColumn(name="id_producto")	
	private ProductoEntity productoEntity;
	@Column(name="valor_unitario")
	private double valorUnitario;
	@Column(name="cantidad")
	private double cantidad;

}
