<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../init.jsp"%>
<%@ include file="../css.jsp"%>
<%@ include file="../script.jsp"%>
	<!-- header -->
    	<div class="load_header"> 
        		<div class="logo_left"><a href=""> <img src="${images_host}/logo1.png" alt=" load monitoring" /></a></div>
                <div class="logo_right">Welcome: ${username} | <a href="<c:url value="/j_spring_security_logout" />">Sign Out</a></div>
                
                
                <div class="aerobuttonmenu">
                   	<a href="#" class="aero"><span class="active">Load Monitoring</span></a> 
                    <a href="#" class="aero"><span>VEE</span></a> 
                    <a href="#" class="aero"><span>For Billing</span></a> 
                    <a href="#" class="aero"><span>MDMS Services</span></a> 
                    <a href="#" class="aero"><span>Alarms</span></a> 
                    <a href="#" class="aero"><span>Analysis</span></a> 
                    <a href="#" class="aero"><span>Reports</span></a> 
                    <a href="#" class="aero"><span>Configure</span></a> 
 				</div>
        
         </div>
     <!-- end header -->
     	 
     	 
