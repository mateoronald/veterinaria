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
<h6>VERIFICAR RESERVA</h6>
<table cellspacing="0" cellpadding="0" width="100%" border="0">
	<tr>
		<td class="ListadoCabecera" align="left">Tipo de Documento</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" align="left">Cantidad</td>
		<td><s:textfield  name="txthabitacion" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" align="left">Nro.Documento</td>
		<td><s:textfield  name="txtdocumento" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" align="left">Fecha de Registro</td>
		<td><sj:datepicker  name="txtpedido" displayFormat="dd.MM.yy" showOn="focus" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" align="left">Fecha de Llegada</td>
		<td><sj:datepicker  name="txtpedido" displayFormat="dd.MM.yy" showOn="focus" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" align="left">Fecha de Salida</td>
		<td><sj:datepicker  name="txtpedido" displayFormat="dd.MM.yy" showOn="focus" /></td>
	</tr>
	<tr>
		<td class="ListadoCabecera" align="left">Nombres</td>
		<td><s:textfield  name="txtnomb" /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td align="right" valign="middle"><s:submit value="Enviar  Requisicion"></s:submit>
		<td align="right" valign="middle"><s:submit value="Cancelar"></s:submit>
	</tr>	
</table>
</body>
</html>