var myApp = angular.module("myApp",[]);

myApp.controller('registroCitas',function registroCitas($scope, $http){
	/* clase */
	$scope.cita = {
		idCita 		: 0,
		idCliente 	: 0,
		idLocal 	: 0,
		fechaCita 	: undefined,
		estado		: 0
	};
	var peticion = $http.get('listarLocalDo.action');
	peticion.success(function(datos) {
		$scope.listarLocal = datos.locales;
	});
	peticion.error(function(err) {
	});
	
	$scope.registrarCita = function(){
		if ($scope.cita.idLocal !== 0 && 
		$scope.cita.fechaCita != undefined) {
			if($scope.cita.fechaCita == '') return;
			var peticion = $http.get('RegistrarCitaDo.action?CadenaJSON='
					+ JSON.stringify($scope.cita));
			peticion.success(function(datos) {
			});
			peticion.error(function(err) {
			});
		} else {
			
		}
	};
	
});

