<%@taglib uri="/struts-tags" prefix="s"%>
<div class="row-fluid">
	<div class="span12 bs-docs-sidebar">
		<!-- <img alt="" src="img/logo.jpg">  -->

		<div class="carousel slide" id="carousel-193622">
			<ol class="carousel-indicators">
				<li data-slide-to="0" data-target="#carousel-193622"></li>
				<li data-slide-to="1" data-target="#carousel-193622"></li>
				<li data-slide-to="2" data-target="#carousel-193622" class="active">
				</li>
			</ol>
			<div class="carousel-inner">
				<div class="item">
					<img alt="" src="img/toolbar1.png" width="100%" height="20px">
					<div class="carousel-caption">
						
					</div>
				</div>
				<div class="item">
					<img alt="" src="img/toolbar2.jpg">
					<div class="carousel-caption">
						
					</div>
				</div>
				<div class="item active">
					<img alt="" src="img/toolbar3.jpg">
					<!-- http://lorempixel.com/1600/500/sports/2 -->
					<div class="carousel-caption">
						
					</div>
				</div>
			</div>
			<a data-slide="prev" href="#carousel-193622"
				class="left carousel-control">&#171;</a> <a data-slide="next"
				href="#carousel-193622" class="right carousel-control">&#187;</a>
		</div>
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container-fluid">
					<a data-target=".navbar-responsive-collapse" data-toggle="collapse"
						class="btn btn-navbar"><span class="icon-bar"></span><span
						class="icon-bar"></span><span class="icon-bar"></span> </a> <a
						href="a_presentacion" class="brand">Inicio</a>
					<div class="nav-collapse collapse navbar-responsive-collapse">
						<ul class="nav">
							<li><a href="#">Contratanos</a></li>
							<li><a href="#">Proveedores</a></li>
							<li class="dropdown"><a data-toggle="dropdown"
								class="dropdown-toggle" href="#">Quienes Somos<strong
									class="caret"></strong>
							</a>
								<ul class="dropdown-menu">
									<li><a href="a_presentacion">Presentaci&oacute;n</a></li>
									<li><a href="a_fortalezas">Nuestras fortalezas</a></li>
									<li><a href="a_misionyvision">Misi&oacute;n y
											Visi&oacute;n</a></li>
									<!-- <li class="divider"></li> -->
									<!-- <li class="nav-header">Nav header</li> -->
									<li><a href="a_servicios">Servicios</a></li>
									<li><a href="#">Valores Organizaciones</a></li>
								</ul></li>
						</ul>
						<ul class="nav pull-right">

							<s:if test="%{#session.keyUsuario != null}">
								<s:url id="cerrarSesion" action="cerrarSesion"></s:url>
								<li><s:a href="%{cerrarSesion}">Cerrar sesi&oacute;n</s:a>
								</li>
								<li><s:a href="a_perfil">Perfil</s:a>
								</li>
							</s:if>
							<s:if test="%{#session.keyUsuario == null}">
								<li><a href="a_registroClientes">Registrate</a></li>
								<li><a href="a_login">iniciar sesi&oacute;n</a></li>

							</s:if>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
