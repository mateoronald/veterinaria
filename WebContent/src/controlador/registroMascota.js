
myApp.controller('registroMascota',function registroMascota($scope, $http){
	
	$http.get('obtenerVacunasDo.action')
	.success(function(datos) {
		$scope.vacunas = datos.vacunas;
	})
	.error(function(err) {
	});
	
	/*tipo mascota con raza"*/
	$scope.mascotas = [ {
		mascota : 'perro',
		raza : [ {
			raza : 'Barbet'
		}, {
			raza : 'American Bully'
		}, {
			raza : 'Beagle'
		} ]
	}, {
		mascota : 'gato',
		raza : [ {
			raza : 'Abisinio'
		}, {
			raza : 'American Curl'
		}, {
			raza : 'Angora Turco'
		} ]
	} ];
	/* bacunas */
	$scope.vacunas = [{}]
	/** modelo para la imagen **/
	$scope.imgen = {};
	/* registro mascota */
	$scope.Mascota = {
			iDmascota 	: 0,
			mascota		: '',
			raza		: '',
			edad		: 0,
			imagen		: [],
			vacunas		: []
	}; 
	$scope.rasas = [];
	$scope.seleccionarMascota = function(){
		angular.forEach($scope.mascotas,function(obj){
			if($scope.Mascota.mascota == obj.mascota){
				$scope.rasas = obj.raza;
			}
		});
	};
	
	/*para buscar al cliente*/
	$scope.strDNI = '';
	$scope.buscarUsuario = function(){
		var peticion = $http.get('BuscarClienteDo.action?cliente.strDNI='
				+ $scope.strDNI);
		peticion.success(function(datos) {
			$scope.cliente = datos.cliente;
		});
		peticion.error(function(err) {
		});
	};
	
	/*para agregar vacunas*/
	$scope.auxvacuna = undefined;
	$scope.agregarVacuna = function(){
		try {
			var bool = $scope.Mascota.vacunas.indexOf($scope.auxvacuna)!= -1;
			if(bool) return;
			$scope.auxvacuna.fecha = new Date();
			var aux = $scope.auxvacuna;
			$scope.Mascota.vacunas.push(aux);
		} catch (e) {
			// TODO: handle exception
			console.log(e.error);
		}
	};
	/*para quitar */
	$scope.quitarVacuna = function(){
		var posicion = $scope.Mascota.vacunas.indexOf(this.v);
		$scope.Mascota.vacunas.splice(posicion,1);
	};
	
	/* agregar el registro de la mascota */
	$scope.agregarMascota = function(){
		
		$http({
			url : 'agregarMascotaDo.action',
			method : 'post',
			params: {
				CadenaJSON : JSON.stringify($scope.Mascota)
            }
		})
//		$http.get('agregarMascotaDo.action?CadenaJSON='+JSON.stringify($scope.Mascota))
		.success(function(datos) {
			debugger;
		})
		.error(function(err) {
		});
		
	};
});