<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<script type="text/javascript" src="src/controlador/bandejaCitas.js"></script>
<div ng-controller="">
<table class="table table-hover table-condensed table-striped">
	<thead>
		<tr>
			<th>numero</th>
			<th>Fecha</th>
			<th>Cliente</th>
			<th>Doctor</th>
			<th>Estado</th>
		</tr>
	</thead>
	<tbody>
		<tr ng-repeat="">
			<td>{{}}</td>
			<td>{{}}</td>
			<td>{{}}</td>
			<td>{{}}</td>
			<td>{{}}</td>
		</tr>
	</tbody>
</table>
</div>