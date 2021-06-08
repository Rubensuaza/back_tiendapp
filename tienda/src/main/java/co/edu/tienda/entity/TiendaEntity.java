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
@Table(name="tienda")
public class TiendaEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id_tienda")
	private Integer idTienda;
	@ManyToOne
	@JoinColumn(name="id_administrador")
	private UsuarioTiendapp usuarioEntity;
	@Column(name="nombre")
	private String nombre;
	@Column(name="nit")
	private String nit;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="activo")
	private char activo;


}
