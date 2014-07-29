package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import modulo.Modulo;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.OpcionBean;
import com.google.buscador.venta.bean.UsuarioBean;
import com.google.buscador.venta.service.LoginService;
import com.google.buscador.venta.service.LoginServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class LogeoAction extends ActionSupport {

	private LoginService login = new LoginServiceImpl();

	/* esta session es para las opciones de cada perfil */
	private Map<String, Object> session = ActionContext.getContext()
			.getSession();

	List<OpcionBean> listaOpciones;
	private UsuarioBean usuario;
	//private TrabajadorBean trabajador;

	String mensaje = null;
	

	@Action(value = "/inicioSesion", results = {
			@Result(location = "t_perfil", name = "success", type = "tiles"),
			@Result(location = "t_login", name = "error", type = "tiles")})
	public String inicioSesion() {

		String modelo = ERROR;

		if (session.get("keyUsuario") == null
				&& session.get("keyOpciones") == null) {

			if (Modulo.validar(usuario.getStrLogin())
					&& Modulo.validar(usuario.getStrPassword())) {

				usuario = login.VerficarLogeo(usuario.getStrLogin(),
						usuario.getStrPassword());
				if (usuario != null) {
					session.put("keyUsuario", usuario);
					listaOpciones = login.obtenerOpcion(usuario.getIntPerfil());
					session.put("keyOpciones", listaOpciones);
					mensaje = null;
					modelo = SUCCESS;
				} else {
					usuario = null;
					mensaje = "Lo sentimos el usuario no existe";
				}

			} else {
				usuario = null;
				mensaje = "Ingrese todos los campos";
			}
		} else {
			modelo = SUCCESS;
		}

		return modelo;
	}

	@Action(value = "/cerrarSesion", results = { 
			@Result(location = "t_login", name = "success", type = "tiles")})
	public String cerrarSecion() {
		session.remove("keyOpciones");
		session.remove("keyUsuario");
		session.remove("KeyMensaje");
		session.clear();
		usuario = null;
		listaOpciones = null;
		mensaje = null;
		return SUCCESS;
	}
	
	

	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public List<OpcionBean> getListaOpciones() {
		return listaOpciones;
	}

	public void setListaOpciones(List<OpcionBean> listaOpciones) {
		this.listaOpciones = listaOpciones;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
