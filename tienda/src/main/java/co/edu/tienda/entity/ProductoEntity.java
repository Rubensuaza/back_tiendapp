package co.edu.tienda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="producto")
public class ProductoEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id_producto")
	private Integer idProducto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="activo")
	private char activo;

}
