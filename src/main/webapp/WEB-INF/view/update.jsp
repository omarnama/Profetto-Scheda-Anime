<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Modifica Anime</title>
	
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
	<style type="text/css">
	.error {
		border: 1px solid red;
	}
	</style>
</head>
<body>

	<h4>Pagina di modifica dell'Anime</h4>
	
	<div class="col-8">
		<form:form method="POST" modelAttribute="ato">
			<form:hidden path="idAni"/>
			
						<div class="form-group">
				<label for="titAni">Titolo Anime</label>
				<form:input type="text" path="titAni" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="titAniJ">Titolo Anime Jap</label>
				<form:input type="text" path="titAniJ" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="nazAni">Nazionalità Anime</label>
				<form:input type="text" path="nazAni" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="categAni">Categoria Anime</label>
				<form:input type="text" path="categAni" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="genAni">Genere Anime</label>
				<form:input type="text" path="genAni" cssClass="form-control"></form:input>
			</div>
			<!--  
			<div class="form-group">
				<label for="yearAni">Anno Anime</label>
				<form:input type="text" path="yearAni" cssClass="form-control"></form:input>
			</div>
			-->
			<div class="form-group">
				<label for="yearAni">Anno Anime</label>
				<spring:bind path="yearAni">
					<form:input type="text" path="yearAni"
						cssClass="form-control ${status.error ? 'error' : ''}"></form:input>
				</spring:bind>
			</div>
			
			<div class="form-group">
				<label for="fromAni">Anime tratto da</label>
				<form:input type="text" path="fromAni" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="seasAni">Stagioni Anime</label>
				<form:input type="text" path="seasAni" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="epAni">Episodi Anime</label>
				<form:input type="text" path="epAni" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="stateAniJ">Stato Anime Jap</label>
				<form:input type="text" path="stateAniJ" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="stateAni">Stato Anime Ita</label>
				<form:input type="text" path="stateAni" cssClass="form-control"></form:input>
			</div>
			
			<div class="form-group">
				<label for="dubAni">Doppiaggio Anime Ita</label>
				<form:input type="text" path="dubAni" cssClass="form-control"></form:input>
			</div>

			<button class="btn btn-success">Conferma dati</button>
		</form:form>
	</div>
</body>
</html>