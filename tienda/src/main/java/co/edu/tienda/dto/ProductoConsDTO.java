package co.edu.tienda.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoConsDTO {
	
	private String nombre;
	private double cantidad;
	private double precio;

}
