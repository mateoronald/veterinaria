<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<sj:head jqueryui="true" ajaxcache="true" />
<link href="css/calendar-blue.css" type=text/css rel=stylesheet>
<!-- para el calendario  -->
<link href="css/cmxform.css" type=text/css rel=stylesheet>

<html>
<head>
</head>
<body>
<h5 align="center">REGISTRO DE  INGRESO</h5>

<table cellspacing="0" cellpadding="0" width="100%" border="0">
		<tr>
	
		<td align="center" valign="top">
		<table border="0">
			<tr>
				<td>&nbsp;</td>
			</tr>
			
		</table>
		<s:form  action="GrabarReparacion">
		<table cellspacing="0" cellpadding="4" border="0" align="left" >
			<h6 align="left">Buscar Reserva</h6>
			<tr>
				<td class="ListadoCabecera" align="left">Documento</td>
				<td> <s:textfield   name="txtNombres" /> </td>
				<td>&nbsp;</td>
				<td align="right" valign="middle"><s:submit value="Registro Acompañante"></s:submit>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">NOMBRES</td>
				<td> <s:textfield   name="txtNombres" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left"> Apellidos</td>
				<td> <s:textfield   name="txtApellidosP" /> </td>
				<td>&nbsp;</td>
				<td align="right" valign="middle"><s:submit value="Registro Ingreso"></s:submit>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Fecha de Reserva </td>
				<td><sj:datepicker  name="txtpedido" displayFormat="dd.MM.yy" showOn="focus" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right" valign="middle"><s:submit value="Registrar"></s:submit>
				<td align="right" valign="middle"><s:submit value="Limpiar"></s:submit>
				<td align="right" valign="middle"><s:submit value="Cancelar"></s:submit>
				<td align="right" valign="middle"><s:submit value="Actualizar"></s:submit>
			</tr>	
		</table>
	</s:form>
	
</table>
</body>
</html>