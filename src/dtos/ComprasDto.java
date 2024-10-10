package dtos;

import java.time.LocalDateTime;

public class ComprasDto {
	
	int id;
	int importe;
	LocalDateTime fechaCompra;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public ComprasDto(int id, int importe, LocalDateTime fechaCompra) {
		super();
		this.id = id;
		this.importe = importe;
		this.fechaCompra = fechaCompra;
	}
	
	public ComprasDto() {
		
	}
}
