package com.google.buscador.venta.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.Cliente;
import com.google.buscador.venta.bean.MascotaBean;
import com.google.buscador.venta.bean.VacunaBean;
import com.google.buscador.venta.service.RegistroMascotaService;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class RegistroMascota extends ActionSupport {
	
	RegistroMascotaService service = new RegistroMascotaService();
	
	private Cliente cliente;
	

	@Action(value = "BuscarClienteDo",
			results = { @Result(name = "success", type = "json") })
	public String BuscarCliente(){
		
		cliente =service.BuscarCliente(cliente);
		return SUCCESS;
	}
	
	@SuppressWarnings("rawtypes")
	private List vacunas = null;
	private VacunaBean vacuna = new VacunaBean();
	@Action(value = "obtenerVacunasDo",
			results = { @Result(name = "success", type = "json") })
	public String obtenerValunas(){
		setVacunas(service.obtenerValunas(vacuna));
		return SUCCESS;
	}
	
	private String CadenaJSON;
	@Action(value = "agregarMascotaDo",
			results = { @Result(name = "success", type = "json") })
	public String agregarMascota(){
		Gson gson = new Gson();
		MascotaBean mascota = (MascotaBean)gson.fromJson(CadenaJSON, MascotaBean.class);
		return SUCCESS;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public VacunaBean getVacuna() {
		return vacuna;
	}

	public void setVacuna(VacunaBean vacuna) {
		this.vacuna = vacuna;
	}

	@SuppressWarnings("rawtypes")
	public List getVacunas() {
		return vacunas;
	}

	@SuppressWarnings("rawtypes")
	public void setVacunas(List vacunas) {
		this.vacunas = vacunas;
	}

	public String getCadenaJSON() {
		return CadenaJSON;
	}

	public void setCadenaJSON(String cadenaJSON) {
		CadenaJSON = cadenaJSON;
	}

}
