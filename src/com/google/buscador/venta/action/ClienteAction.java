package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.ClienteBean;
import com.google.buscador.venta.service.ClienteService;
import com.google.buscador.venta.service.ClienteServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class ClienteAction extends ActionSupport{
	
	private ClienteBean cliente;
	private ClienteService clienteservice = new ClienteServiceImpl();

	private Integer rows = 0, page = 0, total = 0, records = 0;
	private Map<String, Object>session =ActionContext.getContext().getSession();

	private String idCliente, mensaje;
	private static final Log log = LogFactory.getLog(ClienteAction.class);
	
	@Action(value = "/registroCliente", results = { @Result(location = "t_registroCliente", name = "success",type="tiles") })
	public String registraCliente() throws Exception {
		try {
			System.out.println("Estamos en registro de Clientes");
			
			cliente= new ClienteBean();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return SUCCESS;
	}
}
