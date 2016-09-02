<%@include file="../template/header.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="container">
		<form:form cssClass="form-horizontal" action="save-en" method="post" modelAttribute="entreprise">
			<div class="form-group">
				<label class="col-sm-3 control-label" >Name</label>
				<div class="col-sm-6">
					<form:input cssClass="form-control" path="name" placeholder="Voer Jou Name in"/>
				</div>
			</div>			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Type</label>
				<div class="col-sm-6">
					<form:input cssClass="form-control" path="type" placeholder="Voer type bdrijf in"/>
				</div>
			</div>			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Taille</label>
				<div class="col-sm-6">
					<form:input cssClass="form-control" path="taille" placeholder="Voer taille in"/>
				</div>
			</div>			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Turnover</label>
				<div class="col-sm-6">
					<form:input cssClass="form-control" path="turnover" placeholder="Voer turnover in"/>
				</div>
			</div>			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Address</label>
				<div class="col-sm-6">
					<form:textarea cssClass="form-control" path="address" rows="5" cols="4"/>					
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Description</label>
				<div class="col-sm-6">
					<form:textarea cssClass="form-control" path="description" rows="5" cols="4"/>					
				</div>
			</div>			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Email</label>
				<div class="col-sm-6">
					<form:input cssClass="form-control" path="email" placeholder="Voer turnover in"/>
				</div>
			</div>			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Password</label>
				<div class="col-sm-6">
					<form:password cssClass="form-control" path="password" placeholder="Voer turnover in"/>
				</div>
			</div>			
			<div class="form-group">
				<label class="col-sm-3 control-label" >Domain</label>
				<div class="col-sm-6">
					<form:select cssClass="form-control" path="domain.idDomain" >
						<c:forEach items="${listDomain}" var="list">
							<form:option value="${list.idDomain}">${list.name}</form:option >
						</c:forEach>
					</form:select>					 
				</div>
			</div>
				<form:hidden path="role" value="en" />
				<form:hidden path="log" value="img"/>	
			
			<div class="form-group">
    			<div class="col-sm-offset-3 col-sm-4 ">
     		 		<button type="submit" class="btn btn-success">Save</button>
    			</div>
  			</div>					
						
		</form:form>
	</div>
<%@include file="../template/footer.jsp" %>
