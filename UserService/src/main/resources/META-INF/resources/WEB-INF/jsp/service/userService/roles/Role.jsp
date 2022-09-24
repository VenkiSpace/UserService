<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

<link rel="stylesheet" href="/css/General.css">

<html>
	<body class="page">
		<%@ include file="/WEB-INF/jsp/service/common/Header.jspf" %>
		<form:form method="POST" modelAttribute="roleEntity">
			<div class="twoColumnsDiv" style="height:400px">
				
				<div class="headerDiv">
					<div class="headerImageDiv">
						<img src="/images/help.gif" align="right">
					</div>
					<div class="header" >
						Role
					</div>
				</div>
				
				<hr class="line">	
			
				<div class="row" >
					<div class="column">
						<div class="label">
							<form:label path="name">Role Name</form:label>
						</div>
						<div>
							<form:input class="text" type="text" path="name" />
							<form:errors path="name" cssClass="text-danger"/>
						</div>
					</div>	
				</div>
			
				<div class="row" >
					<div class="column">
						<div class="label">
							<form:label path="description">Description</form:label>
						</div>
						<div>
							<form:textarea class="textArea" path="description" />	
							<form:errors path="description" cssClass="text-danger"/>		
						</div>
					</div>	
				</div>
			
				<div class="row">
					<div class="column">
						<div class="label">
							<form:checkbox path="enabled" />
							<form:label for="enabled" path="enabled">Enabled</form:label>
						</div>
					</div>	
				</div>
	
				<div class="buttonRow" align="center">
					<div class="column">
						<form:button type="submit" class="button" >Submit</form:button>
					</div>
				</div>
			
			</div>	
		
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="tenantId" />
		</form:form>
	</body>
</html>