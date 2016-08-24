<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateDomain</title>
</head>
<body>
	<form action="domain?action=updateDomain" method="post">
			  <input type="hidden" name="idInput" value="${domain.idDomain}"/>
		Name: <input type="text" name="nameInput" value="${domain.name}"/>
		 <button type="submit" >Update</button>
	
	</form>
	
</body>
</html>