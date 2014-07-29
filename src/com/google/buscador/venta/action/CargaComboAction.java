package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Action;

import org.apache.ibatis.annotations.Result;

import com.google.buscador.venta.bean.EstadoBean;
import com.google.buscador.venta.service.EstadoService;
import com.google.buscador.venta.service.EstadoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CargaComboAction extends ActionSupport {

		private static final long serialVersionUID =1L;
		private List<EstadoBean> lstEstado = new ArrayList<>();
		
		//private EstadoService service = new EstadoServiceImpl();
		
		//@Action(value ="/cargaDocumento",result ={@Result(name="success",type="json")})
		//public String cargaDocumento() {//
			//System.out.println("Carga Estado");
			//try {
				
			//} catch (Exception e) {
				// TODO: handle exception
		//	}
	//	}
}
