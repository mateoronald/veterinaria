package com.google.buscador.venta.bean;

public class CitaBean {

	private Integer idCita;
	private Integer idCliente;
	private Integer idLocal;
	private String  fechaCita;
	private int		estado;
	
	public Integer getIdCita() {
		return idCita;
	}
	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}
	public String getFecha() {
		return fechaCita;
	}
	public void setFecha(String fechaCita) {
		this.fechaCita = fechaCita;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
