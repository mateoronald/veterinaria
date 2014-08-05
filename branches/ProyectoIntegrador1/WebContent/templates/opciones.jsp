<%@taglib uri="/struts-tags" prefix="s"%>


<ul class="nav nav-list">
	<li class="nav-header">Opciones de usuario</li>
	<s:if test="%{#session.keyOpciones != null}">
		<li><a href="a_perfil">Perfil</a>
		</li>
		<s:iterator value="#session.keyOpciones">
			<li><a href="<s:property value="strParametor"/>"> <s:property
						value="strDescripcion" /> </a>
			</li>
		</s:iterator>
		<li class="divider"></li>
		<li><a href="#">Ayudar</a>
		</li>
	</s:if>
</ul>