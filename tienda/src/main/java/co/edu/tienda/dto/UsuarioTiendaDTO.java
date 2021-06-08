package co.edu.tienda.dto;



import java.util.List;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioTiendaDTO {
	
	
	private Integer idUsuarioTienda;	
	private String nombre;	
	private String apellido;	
	private String tipoDocumento;	
	private String numeroDocumento;	
	private String direccion;	
	private String numeroTelefono;	
	private String correo;
	private List<String>  roles; 

}
