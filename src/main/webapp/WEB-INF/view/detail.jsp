<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Dettaglio dell'Anime</title>
	
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
</head>
<body>
	<h4>Pagina di dettaglio si un Anime</h4>

	<div class="col-8">
		<div class="form-group">
			<label for="titAni">Titolo Anime</label>
			<c:out value="${dto.titAni}"></c:out>
		</div>
		<div class="form-group">
			<label for="titAniJ">Titolo Anime Jap</label>
			<c:out value="${dto.titAniJ}"></c:out>
		</div>
		<div class="form-group">
			<label for="nazAni">Nazionalità Anime</label>
			<c:out value="${dto.nazAni}"></c:out>
		</div>
		<div class="form-group">
			<label for="categAni">Categoria Anime</label>
			<c:out value="${dto.categAni}"></c:out>
		</div>
		<div class="form-group">
			<label for="genAni">Genere Anime</label>
			<c:out value="${dto.genAni}"></c:out>
		</div>
		<div class="form-group">		
			<label for="yearAni">Anno Anime</label>
			<fmt:formatDate value="${dto.yearAni}" pattern="yyyy"/>
		</div>
		<div class="form-group">
			<label for="fromAni">Anime tratto da</label>
			<c:out value="${dto.fromAni}"></c:out>
		</div>
		<div class="form-group">
			<label for="seasAni">Stagioni Anime</label>
			<c:out value="${dto.seasAni}"></c:out>
		</div>
		<div class="form-group">
			<label for="epAni">Episodi Anime</label>
			<c:out value="${dto.epAni}"></c:out>
		</div>
		<div class="form-group">
			<label for="stateAniJ">Stato Anime Jap</label>
			<c:out value="${dto.stateAniJ}"></c:out>
		</div>
		<div class="form-group">		
			<label for="stateAni">Stato Anime Ita</label>
			<c:out value="${dto.stateAni}"></c:out>
		</div>
		<div class="form-group">		
			<label for="dubAni">Doppiaggio Anime Ita</label>
			<c:out value="${dto.dubAni}"></c:out>
		</div>
		<div class="form-group">
			<label for="creationTime">Creation time</label>
			<c:out value="${dto.creationTime}"></c:out>
		</div>
	</div>
</body>
</html>