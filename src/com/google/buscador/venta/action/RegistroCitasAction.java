package com.google.buscador.venta.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.CitaBean;
import com.google.buscador.venta.bean.Local;
import com.google.buscador.venta.bean.UsuarioBean;
import com.google.buscador.venta.service.RegistroLocalService;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class RegistroCitasAction extends ActionSupport {
	
	private Map<String, Object> session = ActionContext.getContext()
			.getSession();
	
	RegistroLocalService service = new RegistroLocalService();
	
	private List<Local> Locales = null;
	private Local local = new Local(); 
	@Action(value = "listarLocalDo",
			results = { @Result(name = "success", type = "json") })
	public String listarLocal(){
		
		Locales = service.listarLocal(local);
		return SUCCESS;
	}
	
	private String CadenaJSON;
	@Action(value = "RegistrarCitaDo",
			results = { @Result(name = "success", type = "json") })
	public String RegistrarCita(){
		UsuarioBean usu=(UsuarioBean)session.get("keyUsuario");
		Gson gson = new Gson();
		CitaBean cita = gson.fromJson(CadenaJSON, CitaBean.class);
		cita.setIdCliente(usu.getIntCodigo());
		service.registroCita(cita);
		return SUCCESS;
	}
	
	private List<CitaBean> listaCita = null;
	private CitaBean citaBean;
	@Action(value = "listaCita",
			results = { @Result(name = "success", type = "json") })
	public String listaCita(){
		listaCita = service.listaCita(citaBean);
		return SUCCESS;
	}
	
	
	public List<Local> getLocales() {
		return Locales;
	}
	public void setLocales(List<Local> locales) {
		Locales = locales;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public String getCadenaJSON() {
		return CadenaJSON;
	}

	public void setCadenaJSON(String cadenaJSON) {
		CadenaJSON = cadenaJSON;
	}


	public List<CitaBean> getListaCita() {
		return listaCita;
	}


	public void setListaCita(List<CitaBean> listaCita) {
		this.listaCita = listaCita;
	}


	public CitaBean getCitaBean() {
		return citaBean;
	}


	public void setCitaBean(CitaBean citaBean) {
		this.citaBean = citaBean;
	} 
}
