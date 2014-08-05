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
<h6>REGISTRO DE PROFESORES POR CURSO</h6>
<table cellspacing="0" cellpadding="0" width="100%" border="0">
	<tr>
	
		<td align="center" valign="top">
		<table border="0">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td class="TituloCabecera" width="650" align="left">Registro de
				Profesores Por Curso</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
		
		<s:form  action="GravarProfesoresxCurso">
		<table cellspacing="0" cellpadding="4" border="0" align="left">
			<tr>
				<td class="ListadoCabecera">Archivo</td>
				<td><input type="file" name="objFrmRuta.ruta"></td>

			</tr>
			<tr>
				<td align="left" valign="middle"><s:submit value="Listo"></s:submit>
			</tr>
			<TR>
				
			</TR>
		</TABLE>
		</s:form>
		</td>
	</tr>
</table>
</body>
</html>