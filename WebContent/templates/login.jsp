<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>ProyectoDawi</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!--link rel="stylesheet/less" href="less/bootstrap.less" type="text/css" /-->
<!--link rel="stylesheet/less" href="less/responsive.less" type="text/css" /-->
<!--script src="js/less-1.3.3.min.js"></script-->
<!--append â€˜#!watchâ€™ to the browser URL, then refresh the page. -->

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
  <![endif]-->

<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="img/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="img/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="img/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="img/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="img/favicon.png">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/scripts.js"></script>
<sj:head jqueryui="true" ajaxcache="true" />
<link href="css/calendar-blue.css" type=text/css rel=stylesheet>
<!-- para el calendario  -->
<link href="css/cmxform.css" type=text/css rel=stylesheet>
</head>

<body>
	<div class="container-fluid">
 
		<tiles:insertAttribute name="cabecera"/>
		<div class="row-fluid">
			<div class="span6">
				<br> <span>
						<p align="justify">
 						Nuestra Clínica cuenta con médicos especialistas en animales menores, cirujanos especializados 
 						en las diferentes aéreas de la cirugía capaces de realizar operaciones antes inimaginables 
 						de hacer en el Perú con equipo de anestesia por gas, internistas, emergencistas, radiólogo,
 						ecógrafo, oftalmólogo, cardiólogo, odontólogo, especialista en animales silvestres. 
						Cuenta con un laboratorio propio donde se realiza de inmediato cualquier análisis clínico 
						necesario, rayos X y ecografía. 
						Las instalaciones de la clínica han sido recientemente remodeladas por completo ya que tuvo
						que ampliarse porque el local estaba quedando pequeño para la gran acogida que tiene y el
						gran número de pacientes que atiende diariamente.
					 </p>
					 </span>


			</div>
			<div class="span6">
				<div class="row-fluid">

					<div class="span6">
						<br> <img  alt="140x140"src="img/imagenes/prinipal.jpg"
							class="img-rounded" />
					</div>

					<div class="span6">
						<h3 class="text-left muted">Iniciar sesi&oacute;n</h3>
						<s:form action="inicioSesion">
							<label class="control-label" for="login">Login</label>
							<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-user"></i></span>
								<s:textfield name="usuario.strLogin" cssClass="span12" 
							   placeholder="Usuario"/>
							</div>
							</div>
							<label class="control-label" for="password">Password</label>
							<div class="controls">
								<div class="input-prepend">
								<span class="add-on"><i class="icon-lock"></i></span>
								<s:password name="usuario.strPassword" cssClass="span12"
								placeholder="Password" />
								</div>
							</div>
							<sj:submit value="Ingresar" button="true" />
							<!-- aca va el otro boton -->
						</s:form>
						<s:if test="%{mensaje != null}">
							<div class="alert alert-error">
								<button type="button" class="close" data-dismiss="alert">x</button>
								<h4>ERROR!</h4>
								<s:property value="mensaje" />
							</div>
						</s:if>
					</div>

				</div>
			</div>
		</div>
		<tiles:insertAttribute name="pie"/>
	</div>
</body>
</html>