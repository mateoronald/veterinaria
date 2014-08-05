
myApp.controller('bandejaCita', function bandejaCita($scope, $http) {
	
	/*llamamos la lista de cita*/
	var peticion = $http.get('RegistrarCitaDo.action?CadenaJSON='
			+ JSON.stringify($scope.cita));
	peticion.success(function(datos) {
	});
	peticion.error(function(err) {
	});
	
});