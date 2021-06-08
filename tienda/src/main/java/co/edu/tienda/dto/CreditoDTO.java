package co.edu.tienda.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreditoDTO {
	
	private Integer idCredito;
	private Integer idTiendaClienteEntity;
	private String fechaCredito;
	private double cupo;
	private char activo;


}
