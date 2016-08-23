<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>
	<%--  <h2>Nom: <%=request.getAttribute("nomHome")%>  
	Age:<%=request.getAttribute("ageHome")%></h2> 
	<c:out value="nomHome"></c:out>
	<c:out value="${nomHome}"></c:out>
	${ageHome} --%>
	<table>
		<thead>
			<tr>
				<th>IdDomain</th><th>Name</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${listDomain}" var="d">
			<tr>
				<td>${d.idDomain}</td>
				<td>${d.name}</td>			
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
