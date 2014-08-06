package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.ProveedorBean;
import com.google.buscador.venta.service.ProveedorService;
import com.google.buscador.venta.service.ProveedorServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class ProveedorMantenimientoAction extends ActionSupport {


	private ProveedorBean proveedor;
	private ProveedorService proveedorService = new ProveedorServiceImpl();
	private List<ProveedorBean> grdProveedor;

	// para el mantenimiento
	private String codigo, razonsocial, ruc, direccion, email, telefono,categoria, distrito;

	// para paginacion
	private Integer rows = 0, page = 0, total = 0, records = 0;

	// crear una sesion
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	private String idSeleccion, mensaje;
	
	private static final Log log = LogFactory.getLog(ProveedorMantenimientoAction.class);

	
	@Action(value = "/manteListaProveedorGrid", results = { @Result(name = "success", type = "json") })
	@SuppressWarnings("unchecked")
	public String listaProveedorGrid() {
		log.info("En lista Proveedor Grid");
		try {
			
			List<ProveedorBean> data = (ArrayList<ProveedorBean>) session.get("keyProveedor");

			records = data.size();

			int hasta = (rows * page);
			int desde = hasta - rows;
			if (hasta > records)
				hasta = records;

			setGrdProveedor(data.subList(desde, hasta));

			total = (int) Math.ceil((double) records / (double) rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@Action(value = "/actualizaProveedor", results = {@Result(location = "t_mantenimientoProveedorGrid", name = "success",type="tiles") })
	public String actualizaProveedor() throws Exception {
		log.info("En actualizaProveedor");
		
		proveedor = new ProveedorBean();
		proveedor.setIdProveedor(Integer.parseInt(idSeleccion));
		proveedor.setStrRazonSocial(razonsocial);
		proveedor.setStrRuc(ruc);
		proveedor.setStrDistrito(distrito);
		proveedor.setStrDireccion(direccion);
		proveedor.setStrTelefono(telefono);
		proveedor.setStrEmail(email);
		proveedor.setStrCategoria(categoria);  
		
		
		proveedorService.actualizaProveedor(proveedor);
				
		return listaProveedor();
	}
	
	@Action(value = "/registraProveedor", results = {@Result(location = "t_mantenimientoProveedorGrid", name = "success",type="tiles") })
	public String registraProveedor() throws Exception {
		log.info("En registraProveedor");
				
		proveedor = new ProveedorBean();
		
		proveedor.setStrRazonSocial(razonsocial);
		proveedor.setStrRuc(ruc);
		proveedor.setStrDistrito(distrito);
		proveedor.setStrDireccion(direccion);
		proveedor.setStrTelefono(telefono);
		proveedor.setStrEmail(email);
		proveedor.setStrCategoria(categoria);  
		
		proveedorService.registraProveedor(proveedor);
				
		return listaProveedor();
	}
	
	@Action(value = "/listaProveedor", results = {@Result(location = "t_mantenimientoProveedorGrid", name = "success",type="tiles") })
	public String listaProveedor() throws Exception {
		log.info("En listaProveedor");
		System.out.println("Estuvo aqui");
		List<ProveedorBean>  data =	proveedorService.listaProveedor();
		session.put("keyProveedor", data);
				
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	@Action(value = "/eliminaProveedor", results = {@Result(location = "t_mantenimientoProveedorGrid", name = "success",type="tiles") })
	public String eliminaProveedor() throws Exception {
		log.info("En eliminaProveedor");
		
		grdProveedor =(ArrayList<ProveedorBean>)session.get("keyProveedor");
		
		if(grdProveedor== null ||  grdProveedor.size()==0){
			mensaje="Se debería haber realizado una selección";
			return SUCCESS;
		}
		
		if(idSeleccion == null||  idSeleccion.length()==0){
			mensaje="Se debería haber seleccionado un registro";
			return SUCCESS;
		}
		
		proveedorService.eliminaProveedor(Integer.parseInt(idSeleccion));
		idSeleccion = null;
		
		return listaProveedor();
	}
	
	

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	
	public String getIdSeleccion() {
		return idSeleccion;
	}
	public void setIdSeleccion(String idSeleccion) {
		this.idSeleccion = idSeleccion;
	}

	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ProveedorBean getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorBean proveedor) {
		this.proveedor = proveedor;
	}

	public ProveedorService getProveedorService() {
		return proveedorService;
	}

	public void setProveedorService(ProveedorService proveedorService) {
		this.proveedorService = proveedorService;
	}

	public List<ProveedorBean> getGrdProveedor() {
		return grdProveedor;
	}

	public void setGrdProveedor(List<ProveedorBean> grdProveedor) {
		this.grdProveedor = grdProveedor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
