package com.google.buscador.venta.bean;

import modulo.Archivos;

public class MascotaBean {
	
	private Integer iDmascota;
	private String mascota;
	private String raza;
	private int edad;
	private String imagen;
	private Archivos file;
	private VacunaBean[] vacunas;
	
	public Integer getiDmascota() {
		return iDmascota;
	}
	public void setiDmascota(Integer iDmascota) {
		this.iDmascota = iDmascota;
	}
	public String getMascota() {
		return mascota;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public VacunaBean[] getVacunas() {
		return vacunas;
	}
	public void setVacunas(VacunaBean[] vacunas) {
		this.vacunas = vacunas;
	}
	public Archivos getFile() {
		return file;
	}
	public void setFile(Archivos file) {
		this.file = file;
	}

}
