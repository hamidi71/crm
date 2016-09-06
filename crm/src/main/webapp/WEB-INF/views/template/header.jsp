<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/bootstrap.css"/>'/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CRM</title>
</head>
<body>
	
	<nav class="navbar  navbar-inverse">
      <div class="container">
        <div class="navbar-header">          
          <a class="navbar-brand" href="#"><spring:message code="header.project"/></a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li ><a href="entreprises"><spring:message code="header.entreprise"/></a></li>            
            <li><a href="#contact"><spring:message code="header.contact"/></a></li>
            <li><a href="#about"> <spring:message code="header.login"/></a></li>
            <li ><a href="bedrijvenlijst.fes">BedrijvenLijsten</a></li>
            <li ><a href="?lang=nl"><img alt="Nederlands" width="20" height="20" src='<c:url value="/resources/img/nl.png"/>'></a></li>
            <li ><a href="?lang=en"><img alt="English" width="20" height="20" src='<c:url value="/resources/img/en.png"/>'></a></li>
            
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
    
 