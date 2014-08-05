<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<sj:head jqueryui="true" ajaxcache="true" />
<link href="css/calendar-blue.css" type=text/css rel=stylesheet>
<!-- para el calendario  -->
<link href="css/cmxform.css" type=text/css rel=stylesheet>

<div class="media">
	<a href="#" class="pull-left"><img
		src="http://lorempixel.com/64/64/" class="media-object" alt='' /></a>
	<div class="media-body">
		<h4 class="media-heading">
		<s:property value="#session.keyUsuario.strNombre" /> <s:property value="#session.keyUsuario.strApePaterno" />
		</h4>
		Les damos la m&aacute;s cordial y sincera bienvenida
		esperomos que pueda cumplir todas sus funciones. 
	</div>
</div>


<table class="table table-bordered">
	<tbody>
		<tr>
			<td>Nombre de Usuario</td>
			<td><s:property value="#session.keyUsuario.strNombre" /></td>
		</tr>
		<tr>
			<td>Apellido paterno</td>
			<td><s:property value="#session.keyUsuario.strApePaterno" /></td>
		</tr>
		<tr>
			<td>Apellido materno</td>
			<td><s:property value="#session.keyUsuario.strApeMaterno" /></td>
		</tr>
		<tr>
			<td>DNI de Usuario</td>
			<td><s:property value="#session.keyUsuario.strDNI" /></td>
		</tr>
		<tr>
			<td>Fecha de Nacimiento</td>
			<td><s:property value="#session.keyUsuario.strFeNacimiento" />
			</td>
		</tr>
	</tbody>
</table>