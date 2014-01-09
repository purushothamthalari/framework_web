<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../init.jsp"%>
<%@ include file="../css.jsp"%>
<%@ include file="../script.jsp"%>
<c:set var="now" value="<%=new java.util.Date()%>" />
<div class="emonheader">
	<div class="logo">
		<img src="${images_host}/logo1.jpg" alt="logo" />
	</div>
	<div class="adminlogin">
		<div class="leftadmin">Welcome: <%=request.getUserPrincipal().getName() %> | <fmt:formatDate pattern="EEEE, MMM dd, yyyy hh:mm:ss a" value="${now}" /></div>
		<div class="rightadmin">
		<div class="location">Hyd</div> 
		<a href="<c:url value="/j_spring_security_logout" />">Sign Out</a></div>
	</div>
</div>
