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
<h6>REGISTRO DE  RESERVA</h6>

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
				<td class="ListadoCabecera" align="left">Id Cliente</td>
				<td> <s:textfield   name="txtNombres" /> </td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">NOMBRES</td>
				<td> <s:textfield   name="txtNombres" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left"> Apellido Paterno</td>
				<td> <s:textfield   name="txtApellidosP" /> </td>
			</tr>
				<tr>
				<td class="ListadoCabecera" align="left"> Apellido Materno</td>
				<td> <s:textfield   name="txtApellidosM" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Acompañantes </td>
				<td align="left" valign="middle"><s:submit value="Registrar"></s:submit>
			</tr>
			<tr>
				<td class="ListadoAmbiente" align="left">Tipo de Ambiente</td>
				<td> <select name="lstcab" >
						<option value="0o">[ Seleccione ]</option>
					 	<option value="01">Habitacion</option>
						<option value="02">Ambito</option>
					 </select>
				</td>
			</tr>
			<tr>
				<td class="ListadoCategoria" align="left">Categoria</td>
				
				<td> <select name="lstcat" >
						<option value="0o">[ Seleccione ]</option>
					 	<option value="01">Alta</option>
						<option value="02">Medio</option>
						<option value="03">Baja</option>
					 </select>
				</td>	 
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Precio</td>
				<td> <s:textfield   name="txtPrecio" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Total</td>
				<td> <s:textfield   name="txtTotal" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">IGV</td>
				<td> <s:textfield   name="txtIGV" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Sub total</td>
				<td> <s:textfield   name="txtSubTotal" /> </td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right" valign="middle"><s:submit value="Registrar"></s:submit>
				<td align="right" valign="middle"><s:submit value="Limpiar"></s:submit>
				<td align="right" valign="middle"><s:submit value="Cancelar"></s:submit>
			</tr>	
		</table>
	</s:form>
	
</table>
</body>
</html>