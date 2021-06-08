package co.edu.tienda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="tipo_documento")
public class TipoDocumento {
	
	@Id
	@Column(name="id_tipo_documento")
	private Integer idTipoDocumento;
	@Column(name="documento")
	private String nombreDocumento;
	

}
