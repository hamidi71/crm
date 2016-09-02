<%@include file="../template/header.jsp" %>
	<div class="container">
			
		<div class="panel panel-info">
  			<div class="panel-heading">${entrepriseProfilJsp.name}</div>
  			<div class="panel-body"> 
  				<table class="table">
  					<tbody>
  						<tr><th>Type</th> <td>${entrepriseProfilJsp.type}</td></tr>
  						<tr><th>Turnover</th> <td>${entrepriseProfilJsp.turnover}</td></tr>
  						<tr><th>Taille</th> <td>${entrepriseProfilJsp.taille}</td></tr>
  						
  						<tr><th>Address</th> <td>${entrepriseProfilJsp.address}</td></tr>
  						<tr><th>Email</th> <td>${entrepriseProfilJsp.email}</td></tr>
  						<tr><th>domain</th> <td>${entrepriseProfilJsp.domain.name}</td></tr>
  					</tbody>
  				
  				
  				
  				</table>
  			
  			
  			
  			</div>
		</div>
	</div>
<%@include file="../template/footer.jsp" %>
