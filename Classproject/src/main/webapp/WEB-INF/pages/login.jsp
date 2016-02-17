<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css"
		href='<c:url value="/resources/lib/bootstrap/css/bootstrap.css"/>'>
	
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/stylesheets/theme.css"/>'>
	<link rel="stylesheet" href='<c:url value="/resources/lib/font-awesome/css/font-awesome.css"/>'>
	
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	
	<style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body class="">

<div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                </ul>
                <div class="brand"><span class="first">Crystal</span> <span class="second">Coaching</span></div>
        </div>
    </div>
    
	<div class="row-fluid">
    <div class="dialog">
        <div class="block">
            <p class="block-heading">Sign In</p>
            <div class="block-body">
                <form:form method="POST" action="checkuser.html">
                    <form:label path="userName">UserName</form:label>
                    <form:input cssClass="span12" path="userName"/>
                    <form:label path="userPassword">Password</form:label>
                    <form:password cssClass="span12" path="userPassword"/>
                    <input class="btn btn-primary pull-right" type="submit" value="Login"/>
                    <label class="remember-me"><input type="checkbox"> Remember me</label>
                    <div class="clearfix"></div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>