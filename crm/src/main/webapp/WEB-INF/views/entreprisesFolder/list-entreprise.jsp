<%@include file="../template/header.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>Name of Entreprise</th>	
				<th>Email of Entreprise</th>
				<th>Type of Entreprise</th>	
				<th>Taile of Entreprise</th>
				<th>Domain of Entreprise</th>					
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${listEntreprises}" var="list">
			<tr>
				<td>${list.name}</td>
				<td>${list.email}</td>
				<td>${list.type}</td>
				<td>${list.taille}</td>
				<td>${list.domain.name}</td>
				<td><a href="profil-en?idList=${list.idEntreprise}" class="btn btn-primary">Profil</a></td>				
                <%-- profil-en/${list.idEntreprise} pathparam()--%>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="add-en" class="btn btn-warning">Add Entreprise</a>
</div>
<%@include file="../template/footer.jsp" %>
