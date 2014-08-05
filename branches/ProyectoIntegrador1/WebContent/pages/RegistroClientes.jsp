<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<sj:head jqueryui="true" ajaxcache="true" />
<link href="css/calendar-blue.css" type=text/css rel=stylesheet>
<!-- para el calendario  -->
<link href="css/cmxform.css" type=text/css rel=stylesheet>


<h3>Registro de Clientes</h3>
	<s:form>
	<table>
		<tr>
			<td> <label class="control-label" >DNI</label> </td>
			<td> <s:textfield> </s:textfield> </td>
			<td>&nbsp; &nbsp; &nbsp; &nbsp;</td>
			<td> <label class="control-label">Nombres</label> </td>
			<td> <s:textfield> </s:textfield> </td>	
		</tr>
		<tr>
			<td> <label class="control-label">Apellido Paterno</label> </td>
			<td> <s:textfield> </s:textfield> </td>
			<td>&nbsp; &nbsp; </td>		
			<td> <label class="control-label">Apellido Materno</label> </td>	
			<td> <s:textfield> </s:textfield> </td>
		</tr>
		<tr>
			<td> <label class="control-label">Edad</label> </td>
			<td> <s:textfield> </s:textfield> </td>
			<td>&nbsp; &nbsp; &nbsp; &nbsp;</td>	
			<td> <label class="control-label">Fecha Nac</label> </td>
			<td> <sj:datepicker name="" value="today" displayFormat="yy-mm-dd"></sj:datepicker> </td>
			
		</tr>
			<tr>
			<td> <label class="control-label">E-mail</label> </td>
			<td> <s:textfield> </s:textfield> </td>
			<td>&nbsp; &nbsp;</td>
			<td> <label class="control-label">Direccion</label> </td>
			<td> <s:textfield> </s:textfield> </td>
		</tr>
		<tr>
			<td><label class="control-label">Login </label> </td>
			<td> <s:textfield> </s:textfield> </td>
			<td>&nbsp; &nbsp; &nbsp; &nbsp;</td>
			<td><label class="control-label">Contraseña</label>	
			<td><s:password></s:password> </td>
		</tr>
		
	</table>
	<br>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<sj:submit button="true" value="Aceptar" cssClass="btn"></sj:submit>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<sj:submit button="true" value="Cancelar" cssClass="btn"></sj:submit>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<sj:submit button="true" value="Limpiar" cssClass="btn"></sj:submit>
	</s:form>
				