<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/incluido.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Favicon -->
<link rel="icon" href="https://nubecolectiva.com/favicon.ico">
<title>Home | Mi Proyecto</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/menu.jsp"%>
    
    <div class="card text-white bg-success">
    
    <div class="card-header text-center"><h2>Precios Históricos</h2></div>
    <div class="card-body">
    
    	<div class="table-responsive">
		  <table class="table">
		  <caption>Lista de precios históricos</caption>
		  <thead>
		    <tr>
		      <th scope="col">#</th>		      
		      <th scope="col">Precio</th>		      
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach items="${model.precioshis}" var="pre">
		    <tr>
		      <th scope="row"><c:out value="${pre.id}"/></th>		      
		      <td><c:out value="${pre.precio}"/></td>		      
		    </tr>		  
		  </c:forEach>
		  </tbody>
		</table>
		</div>
	    
 	</div>
 	</div>
    <!-- Footer -->  
   <%@ include file="/WEB-INF/views/pie.jsp" %>
      
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
      
</body>
</html>