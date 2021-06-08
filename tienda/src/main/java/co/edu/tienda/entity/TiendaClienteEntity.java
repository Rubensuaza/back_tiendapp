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
@Table(name="tienda_cliente")
public class TiendaClienteEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id_tienda_cliente")
	private Integer idTiendaCliente;
	@ManyToOne
	@JoinColumn(name="id_tienda")
	private TiendaEntity tienda;
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private UsuarioTiendapp clienteEntity;
	@Column(name="activo")
	private char activo;


}
