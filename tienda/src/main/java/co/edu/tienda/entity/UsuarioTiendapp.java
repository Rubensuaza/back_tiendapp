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
@Table(name="usuariotiendapp")
public class UsuarioTiendapp {
	
	@Id
	@GeneratedValue
	@Column(name="id_usuario_tienda")
	private Integer idUsuarioTienda;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@ManyToOne
	@JoinColumn(name="tipo_documento")
	private TipoDocumento tipoDocumento;
	@Column(name="documento")
	private String numeroDocumento;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String numeroTelefono;
	@Column(name="correo")
	private String correo;
	@Column(name="activo")
	private char activo;
	@Column(name="id_usuario")
	private int  idUsuario; 
	
	
	public TipoDocumento getTipoDocumento() {
		if(tipoDocumento == null) {
			tipoDocumento = new TipoDocumento();
		}
		return tipoDocumento;
	}
}
