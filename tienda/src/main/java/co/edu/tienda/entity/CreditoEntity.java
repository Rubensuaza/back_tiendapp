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
@Table(name="credito")
public class CreditoEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id_credito")
	private Integer idCredito;
	@ManyToOne
	@JoinColumn(name="id_tienda_cliente")
	private TiendaClienteEntity tiendaClienteEntity;
	@Column(name="fecha_credito")
	private String fechaCredito;
	@Column(name="cupo")
	private double cupo;
	@Column(name="activo")
	private char activo;

	
	/*public TiendaClienteEntity getTiendaClienteEntity() {
		if (tiendaClienteEntity==null) {
			tiendaClienteEntity=new TiendaClienteEntity();			
		}
		return tiendaClienteEntity;
		
	}*/

}
