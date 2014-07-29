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
<h6>REGISTRO DE ACOMPAÑANTE</h6>
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
			<tr>
				<td class="ListadoCabecera" align="left">Nombres</td>
				<td> <s:textfield   name="txtNombres" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Apellido Paterno</td>
				<td> <s:textfield   name="txtNombres" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Apellido Materno</td>
				<td> <s:textfield   name="txtNombres" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Tipo Documento </td>
				<td>
					<select name="lstsum" >
						<option value="0o">[ Seleccione ]</option>
					 	<option value="01">DNI</option>
						<option value="02">Carnet Extranjeria</option>
					 </select>
				</td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Numero Documento</td>
				<td><s:textfield  name="txtDescripcion" /></td>
			</tr>
			<tr>
				<td align="right" valign="middle"><s:submit value="Registrar Cliente"></s:submit>
				<td align="right" valign="middle"><s:submit value="Cancelar"></s:submit>
			</tr>	
		</table>
	</s:form>
	
</table>
</body>
</html>