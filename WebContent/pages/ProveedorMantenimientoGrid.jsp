<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
 
<s:url id="jsonDataListaProveedor" action="manteListaProveedorGrid" />
<div align="left" style="font-size: 11px;"><font color="red"><s:property value="mensaje" /></font></div>

	<sjg:grid id="idGridExtraccionEquipos" 
			 href="%{jsonDataListaProveedor}"  
			 caption="Lista de Proveedores" 
			 dataType="json" 
			 pager="true" 
			 gridModel="grdProveedor" 
			 multiselect="false" 
			 navigator="true"
			 navigatorAdd="false"    
			 navigatorSearch="false" 
			 navigatorRefresh="false" 
			 onSelectRowTopics="rowselectProveedor"
			 navigatorDelete="false"
			 navigatorEdit="false"
			 rowNum="8"
			 scroll="false"
			 width="780" >
		<sjg:gridColumn name="idProveedor" key="true" index="idProveedor" editable="true"  title="Codigo" width="50" sortable="false"/>
		<sjg:gridColumn name="strRazonSocial" index="strRazonSocial" editable="true" title="Razon Social" width="70" sortable="false"/>
		<sjg:gridColumn name="strRuc"  index="strRuc" editable="true" title="Ruc " width="70" sortable="false"/>
		<sjg:gridColumn name="strDireccion"  index="strDireccion" editable="true" title="Direccion " width="70" sortable="false"/>
		<sjg:gridColumn name="strDistrito"  index="strDistrito" editable="true" title="Distrito " width="70" sortable="false"/>
		<sjg:gridColumn name="strTelefono"  index="strTelefono" editable="true" title="Telefono " width="70" sortable="false"/>
		<sjg:gridColumn name="strEmail"  index="strEmail" editable="true" title="E-mail" width="70" sortable="false"/>
		<sjg:gridColumn name="strCategoria"  index="strCategoria" editable="true" title="Categoria" width="70" sortable="false"/>
	</sjg:grid>		  

