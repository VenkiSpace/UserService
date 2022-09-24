<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<body style="background:white">
	<%@ include file="/WEB-INF/jsp/service/common/Header.jspf" %>

	<div class="container" >

		<div><h4>Roles</h4></div>
		
		<form:form method="POST">
			
			<table class="table table-striped">
				<thead>
					<tr>
						<th class="col-1">Delete</th>
						<th class="col-3">Name</th>
						<th class="col-6">Description</th>
						<th class="col-1">Enabled</th>
						<th class="col-1">Update</th>

					</tr>
				</thead>

				<tbody>
					<C:forEach items ="${roles}" var="role" >
						<tr>
							<td>
								<a href="deleteRole?id=${role.id}" class="btn btn-sm">
									<img src="/images/delete20.png" width="20" height="20">
								</a>
							</td>
							<td class="col-3"> ${role.name}</td>
							<td class="col-6"> ${role.description}</td>
							<td class="col-1"> 
								<C:choose>
				  	        		<C:when test="${role.enabled.equals(true)}">
					          			 <input type="checkbox" checked />
					        		</C:when>
					        		<C:otherwise>
					        			<input type="checkbox">
					        		</C:otherwise>   
					       		</C:choose>       
							</td>
							<td>
								<a href="modifyRole?id=${role.id}" class="btn btn-sm">
									<img src="/images/modify20.png" width="20" height="20">
								</a>
							</td>
						</tr>
					</C:forEach>
				</tbody>
			</table>
			
			<a href="addRole" class="btn btn-primary btn-sm">Add Role</a>
		</form:form>
	</div>

	<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"  type="text/javascript"></script>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"  type="text/javascript"></script>
</body>