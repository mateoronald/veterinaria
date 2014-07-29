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
<h6>GENERAR REGISTRO CONTACTO</h6>
<table cellspacing="0" cellpadding="0" width="100%" border="0">
	<tr>
		<td class="ListadoCabecera" >Apellidos Paternos</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" >Apellidos Maternos</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" >Nombres</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" >DNI</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" >Direccion</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" >Correo</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" >Telefono</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td align="right" valign="middle"><s:submit value="Ingresar"></s:submit>
		<td align="right" valign="middle"><s:submit value="Limpiar"></s:submit>
	</tr>	
</table>
</body>
</html>