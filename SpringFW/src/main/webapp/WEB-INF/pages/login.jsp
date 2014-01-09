<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>${properties.app_name}::Login</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="init.jsp"%>
<%@ include file="css.jsp"%>
<%@ include file="script.jsp"%>
</head>
<body onload='document.loginFrm.j_username.focus();'>
	<div class="wrapper"><br/><br/><br/>
		<div class="${errorCssClass}">
			Your login attempt was not successful, try again.<br />
			 Cause :${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
		<div class="logindetails">
			<form id="loginFrm" name="loginFrm"
				action="<c:url value='j_spring_security_check' />" method="post">
				<div class="leblename">Username</div>
				<input type="text" class="required" name="j_username" value="" title="Username" />
				<div class="leblename">Password</div>
				<input type="password" class="required" name="j_password" value="" title="Password" />
				<div class="l1">
					<input type="checkbox" /> Remember me
				</div>
				<input type="submit" name="submit" value="Sign In >>" />
			</form>
		</div>
		
	</div>
<!-- <script type="text/javascript">
	$(document).ready(function() {
		$("input").labelify({
			labelledClass : "labelinside"
		});
	});
</script> -->
</body>
</html>
