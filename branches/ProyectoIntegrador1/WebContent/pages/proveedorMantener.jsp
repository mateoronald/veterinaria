<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<sj:head jqueryui="true" ajaxcache="true" />
<link href="css/calendar-blue.css" type=text/css rel=stylesheet>
<!-- para el calendario  -->
<link href="css/cmxform.css" type=text/css rel=stylesheet>

<script type="text/javascript">
			$.subscribe('rowselectProveedor', function(event,data) {
				 document.getElementById("idSeleccion").value= event.originalEvent.id;
				 
				 var grid = event.originalEvent.grid; 
				 var sel_id = grid.jqGrid('getGridParam', 'selrow');
				 
			
				 document.getElementById("idMantRazonSocial").value = grid.jqGrid('getCell', sel_id, 'strRazonSocial');
				 document.getElementById("idMantRuc").value = grid.jqGrid('getCell', sel_id, 'strRuc');
				 document.getElementById("idMantDireccion").value = grid.jqGrid('getCell', sel_id, 'strDireccion');
				 document.getElementById("selectDistrito").value = grid.jqGrid('getCell', sel_id, 'strDistrito');
				 document.getElementById("idMantTelefono").value = grid.jqGrid('getCell', sel_id, 'strTelefono');
				 document.getElementById("idMantEmail").value = grid.jqGrid('getCell', sel_id, 'strEmail');
				 document.getElementById("selectCategoria").value = grid.jqGrid('getCell', sel_id, 'strCategoria');
				 
			}); 

		function actualizarProveedor(){
				document.getElementById("idForm").action = 'actualizaProveedor';
				return true;
		}  
		function eliminaProveedor(){
			document.getElementById("idForm").action = 'eliminaProveedor';
			return true;
		}  
		function registrarProveedor(){
				document.getElementById("idForm").action = 'registraProveedor';
				return true;
		} 
		function listaProveedor(){
			document.getElementById("idForm").action = 'listaProveedor';
			return true;
		} 
</script>   

<div id="idDivMantProveedor" align="left">

<div id="idDivMensajeForm02" align="left"></div> 
 

<h3>Mantenimiento Proveedores</h3>
	<s:form id="idForm" >
	 		<s:hidden id="idSeleccion" name="idSeleccion"/>
	<table>
		<tr>
			<td> <label class="control-label" >Razon Social</label> </td>
			<td><s:textfield  id="idMantRazonSocial" name="strRazonSocial"/></td>
			<td>&nbsp; &nbsp; &nbsp;</td>
			<td> <label class="control-label">Nª RUC</label> </td>
			<td><s:textfield  id="idMantRuc" name="strRuc"/></td>	
					
		</tr>
		<tr>
			<td> <label  class="control-label">Direccion</label> </td>
			<td><s:textfield  id="idMantDireccion" name="strDireccion"/></td>
			<td>&nbsp; &nbsp; </td>		
			
			<td> <label  class="control-label">Distrito</label> </td>	
			<td> 			
			<s:url id="jsonDistrito" action="cargaDinamicoDistrito"/> 
			<sj:select id="selectDistrito" href="%{jsonDistrito}"  
			name="distrito" 
		    list="lstDistrito" 
			listKey="iddistrito" 
			listValue="des_distrito" 
			emptyOption="false" 
			headerKey=" " 
			headerValue="[ Seleccione ]"  />
						
			</td>
								
		</tr>
		<tr>
			<td> <label class="control-label">Telefono</label> </td>
			<td><s:textfield  id="idMantTelefono" name="strTelefono"/></td>
			<td>&nbsp; &nbsp; &nbsp; &nbsp;</td>	
			<td> <label class="control-label">E-mail</label> </td>
			<td><s:textfield  id="idMantEmail" name="strEmail"/></td>
			
		<td> <label  class="control-label">Categoria</label> </td>	
			<td> 			
			<s:url id="jsonCategoria" action="cargaDinamicoCategoria"/> 
			<sj:select id="selectCategoria" href="%{jsonCategoria}"  
			name="categoria" 
		    list="lstCategoria" 
			listKey="idcategoria" 
			listValue="des_categoria" 
			emptyOption="false" 
			headerKey=" " 
			headerValue="[ Seleccione ]"  />
						
			</td>
		
	</table>
	<br>
				
	<sj:submit id="idFormAgregar"  value="Registrar" button="true"  targets="idDivManProResultado" formIds="idForm" onclick="javascript:registrarProveedor();"/>
	<sj:submit id="idFormActualizar"  value="Actualizar" button="true"  targets="idDivManProResultado"  formIds="idForm" onclick="javascript:actualizarProveedor();"/>
	<sj:submit id="idFormEliminar"  value="Eliminar" button="true"  targets="idDivManProResultado" formIds="idForm" onclick="javascript:eliminaProveedor();"/>
	<sj:submit id="idFormSalir"  value="Listar" button="true"  targets="idDivManProResultado" formIds="idForm" onclick="javascript:listaProveedor();"/>

	<div id="idDivManVenResultado" align="left"></div>	
		
		
		
		
	</s:form>
		</div> 		