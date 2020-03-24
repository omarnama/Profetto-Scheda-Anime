<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elenco Anime</title>
<style type="text/css">
table {
	border: 1px solid gray;
	border-collapse: collapse;
}
th, td {
	border: 1px solid gray;
	border-collapse: collapse;
	padding: 3px;
}
</style>
</head>

<body>
<table>
		<thead>
			<tr>
				<th>Titolo Anime</th>
				<th>itolo Anime Jap</th>
				<th>Nazionalità Anime</th>
				<th>Categoria Anime</th>
				<th>Genere Anime</th>
				<th>Anno Anime</th>
				<th>Anime tratto da</th>
				<th>Stagioni Anime</th>
				<th>Episodi Anime</th>
				<th>Stato Anime Jap</th>
				<th>Stato Anime Ita</th>
				<th>Doppiaggio Anime Ita</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="item">
				<tr>
					<td>
						<a href='<spring:url value="detail?docId=${item.id}"></spring:url>'>
							${item.titAni}
						</a>
					</td>
					<td>${item.titAniJ}</td>
					<td>${item.nazAni}</td>
					<td>${item.categAni}</td>
					<td>${item.genAni}</td>
					<td>
						<fmt:formatDate value="${item.yearAni}" pattern="yyyy"/>
					</td>
					<td>${item.fromAni}</td>
					<td>${item.seasAni}</td>
					<td>${item.epAni}</td>
					<td>${item.stateAniJ}</td>
					<td>${item.stateAni}</td>
					<td>${item.dubAni}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>