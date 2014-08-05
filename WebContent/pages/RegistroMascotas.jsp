<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<script type="text/javascript" src="src/directivas/genstionArchivos.js"></script>
<script type="text/javascript" src="src/controlador/registroMascota.js"></script>

<div ng-controller="registroMascota">
	<form action="" method="post">
		<table class="table">
			<tr>
				<td align="center">DNI Dueño</td>
				<td align="center">
					<div class="input-append">
						<input class="span11" id="appendedInput" type="text" ng-model="strDNI">
						<a ng-click="buscarUsuario()"><span class="add-on"><i class="icon-search"></i></span></a>
					</div>
				</td>
				<td align="center">Nombre Dueño</td>
				<td align="center"><input type="text"  readonly="true" ng-model="cliente.strNombre"></td>
			</tr>
			<tr>
				<td align="center">Tipo Mascota</td>
				<td align="center">
					<select
					ng-model="Mascota.mascota"
					ng-options="m.mascota as m.mascota for m in mascotas"
					ng-change="seleccionarMascota()">
					</select>
				</td>
				<td align="center">Raza</td>
				<td align="center">
					<select
					 ng-model="Mascota.raza"
					 ng-options="r.raza as r.raza for r in rasas">
					</select>
				</td>
			</tr>
			<tr>
				<td align="center">Fecha Nacimiento</td>
				<td align="center"><input type="date" required="required"></td>
				<td align="center">Edad Mascota</td>
				<td align="center"><input type="number" required="required" ng-model="Mascota.edad" ></td>
			</tr>
			<tr>
				<td align="center">Número alterno 1</td>
				<td align="center"><input type="text"  readonly="true" ng-model="cliente.celular"></td>
				<td align="center">Número alterno 2</td>
				<td align="center"><input type="text"  readonly="true" ng-model="cliente.numeroAlternativo"></td>
			</tr>
			<tr>
				<td align="center">Imagen</td>
				<td align="center" colspan="2">
					<input type="file"
					ng-model="Mascota.imagen" accept="image/*"
					multiple app-filereader>
					<img ng-repeat="x in Mascota.imagen"  ng-src="{{x}}"width="100" >
			    </td>
			</tr>
		</table>

		<div class="form-search">
			<label>Vacuna</label>
			<select
				style="margin-left: 1cm"
				ng-model="auxvacuna"
				ng-options="v.vacuna for v in vacunas"  
			>
			</select>
			<a class="btn" ng-click="agregarVacuna()"><i class="icon-plus"></i>Agregar</a>
		</div>
		<table class="table table-condensed table-hover table-striped"
			style="margin-top: 1cm;">
			<thead>
				<tr>
					<th>Vacuna</th>
					<th>Fecha</th>
					<th>Estado</th>
					<th>Quitar</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="v in Mascota.vacunas">
					<td>{{v.vacuna}}</td>
					<td>{{v.fecha | date : fullDate }}</td>
					<td>{{v.estado}}</td>
					<td><a ng-click="quitarVacuna()" class="btn btn-danger btn-mini" type="button"><i class="icon-remove-sign"></i></a></td>
				</tr>
			</tbody>
		</table>
		<input class="btn" type="submit"
			ng-click="agregarMascota()"
			style="margin-top: 1cm; display: block; margin-left: auto; margin-right: auto;">
	</form>
</div>