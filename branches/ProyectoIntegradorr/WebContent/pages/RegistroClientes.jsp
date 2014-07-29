<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<sj:head jqueryui="true" ajaxcache="true" />
<link href="css/calendar-blue.css" type=text/css rel=stylesheet>
<!-- para el calendario  -->

<html>
<head>
</head>
<body background="">
<h6 align="center">REGISTRO DE NUEVOS CLIENTES</h6>
<table cellspacing="0" cellpadding="0" width="100%" border="0">
		<tr>
	
		<td align="center" valign="top">
		<table border="0">
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
		<s:form  action="Grabar_Cliente">
		<table cellspacing="0" cellpadding="4" border="0" align="left" >
			<tr>
				<td class="ListadoCabecera" align="left">Nombres</td>
				<td> <s:textfield   name="txt_nomb_clie" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Apellido Paterno</td>
				<td> <s:textfield   name="txt_apel_pate_clie" /> </td>
				<td>&nbsp;</td>
				<td class="ListadoCabecera" align="left">Apellido Materno</td>
				<td> <s:textfield   name="txt_apel_mate_clie" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Tipo de Documento </td>
				<td>
					<select name="lst_tipo_docu" align="left">
						<option value="00">[ Seleccione ]</option>
					 	<option value="01">DNI</option>
						<option value="02">Carnet Extranjeria</option>
					 </select>
				</td>
				<td>&nbsp;</td>
				<td class="ListadoCabecera" align="left">Numero Documento</td>
				<td><s:textfield  name="txtDescripcion" /></td>
				
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Fecha de Nacimiento</td>
				<td><sj:datepicker  name="FechaNac" displayFormat="dd.MM.yy" showOn="focus" /></td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Edad</td>
				<td><s:textfield  name="txtNacionalidad" /></td>	
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Ciudad</td>
				<td><s:textfield  name="txtCiudad" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
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