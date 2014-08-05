<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<sj:head jqueryui="true" ajaxcache="true" />
<link href="css/calendar-blue.css" type=text/css rel=stylesheet>
<!-- para el calendario  -->
<link href="css/cmxform.css" type=text/css rel=stylesheet>


<h3 align="center">Registro de Citas</h3>
<div ng-controller="registroCitas">
	<form class="form-horizontal" name="fcita">
		<div class="control-group">
			<label class="control-label" for="inputEmail">Fecha</label>
			<div class="controls">
				<input type="datetime-local" name="fecha"  ng-model="cita.fechaCita" required/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="inputPassword">Local</label>
			<div class="controls">
				<select id="cbolocal" ng-model="cita.idLocal"
				title="seleccione una opcion"
				ng-options="l.idLocal as l.descripcion for l in listarLocal">
				</select>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button type="submit" class="btn" ng-click="registrarCita()">Registrar</button>
			</div>
		</div>
	</form>
</div>
