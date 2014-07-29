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
<h6> REGISTRO DE USUARIO</h6>

<table cellspacing="0" cellpadding="0" width="100%" border="0">
		<tr>
	
		<td align="center" valign="top">
		<table border="0">
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
		<s:form  action="GrabarUsuarios">
		<table cellspacing="0" cellpadding="4" border="0" align="left" >
			<tr>
				<td class="ListadoCabecera" align="left">Nombres</td>
				<td> <s:textfield   name="txt_nomb_usua" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left"> Apellido Paterno</td>
				<td> <s:textfield   name="txt_apel_pate_usua" /> </td>
			</tr>
				<tr>
				<td class="ListadoCabecera" align="left"> Apellido Materno</td>
				<td> <s:textfield   name="txt_apel_mate_usua" /> </td>
			</tr>
			<tr>
				<td class="ListadoDocumento" align="left">Tipo de Documento</td>
				<td> <select name="lst_tipo_docu" >
						<option value="0o">[ Seleccione ]</option>
					 	<option value="01">DNI</option>
						<option value="02">Passaporte</option>
					 </select>
				</td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Documento </td>
				<td> <s:textfield   name="txt_tipo_docu_usua" /> </td>	
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Edad</td>
				<td> <s:textfield   name="txt_edad_usua" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Fecha Nacimiento</td>
				<td><sj:datepicker  name="txt_fech_naci_usua" displayFormat="dd.MM.yy" showOn="focus" /></td>
			</tr>
			
			 
			<tr>
				<td class="ListadoCabecera" align="left">Logueo</td>
				<td> <s:textfield   name="txtLogueo" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Password</td>
				<td> <s:textfield   name="txtPassword" /> </td>
			</tr>
			<tr>
				<td class="ListadoCabecera" align="left">Categoria</td>
				<td><sj:datepicker  name="FechaNac" displayFormat="dd.MM.yy" showOn="focus" /></td>
			</tr>
			<tr>
				<td align="right" valign="middle"><s:submit value="Aceptar"></s:submit>
				<td align="right" valign="middle"><s:submit value="Cancelar"></s:submit>
			</tr>	
		</table>
	</s:form>
	
</table>
</body>
</html>