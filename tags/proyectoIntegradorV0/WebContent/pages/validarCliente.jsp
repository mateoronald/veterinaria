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
<h6 align="center">VALIDAR CLIENTES</h6>
<table cellspacing="0" cellpadding="0" width="100%" border="0">
		<tr>
	
		<td align="center" valign="top">
		<table border="0">
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
		<s:form  action="Validar_Clientes">
		<table cellspacing="0" cellpadding="4" border="0" align="left" >
			
			<tr>
				<td class="ListadoCabecera" align="left">Desde</td>
				<td><sj:datepicker  name="FechaNac" displayFormat="dd.MM.yy" showOn="focus" /></td>
				<td>&nbsp;</td>
				<td class="ListadoCabecera" align="left">Hasta</td>
				<td><sj:datepicker  name="FechaNac" displayFormat="dd.MM.yy" showOn="focus" /></td>
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