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
	<script src='<c:url value="/resources/lib/jquery-1.7.2.min.js"/>' type="text/javascript"></script>
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
<title>Index Page</title>
</head>
<body class="">
  <div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                   <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> ${user.userName}
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">My Account</a></li>
                            <li class="divider visible-phone"></li>
                            <li><a tabindex="-1" href="sign-in.html">Logout</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <div class="brand"><span class="first">Crystal</span> <span class="second">Coaching</span></div>
        </div>
    </div>
	
	<div class="sidebar-nav">
        <a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>Dashboard</a>
        <ul id="dashboard-menu" class="nav nav-list collapse in">
            <li><a href="index.html">Home</a></li>
            <li ><a href="users.html">Sample List</a></li>
            <li ><a href="user.html">Sample Item</a></li>
            <li ><a href="media.html">Media</a></li>
            <li ><a href="calendar.html">Calendar</a></li>
            
        </ul>

        <a href="#students-menu" class="nav-header" data-toggle="collapse"><i class="icon-briefcase"></i>Student</a>
        <ul id="students-menu" class="nav nav-list collapse">
            <li ><a href="studentPage.html">View Student Info</a></li>
            <li ><a href="sign-up.html">Enroll Student</a></li>
            <li ><a href="reset-password.html">Reset Password</a></li>
        </ul>
		
		<a href="#employees-menu" class="nav-header" data-toggle="collapse"><i class="icon-briefcase"></i>Employee</a>
        <ul id="employees-menu" class="nav nav-list collapse">
            <li ><a href="sign-in.html">View Employee Info</a></li>
            <li ><a href="sign-up.html">Enroll Employee</a></li>
            <li ><a href="reset-password.html">Reset Password</a></li>
        </ul>

        <a href="#error-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-exclamation-sign"></i>Error Pages <i class="icon-chevron-up"></i></a>
        <ul id="error-menu" class="nav nav-list collapse">
            <li ><a href="403.html">403 page</a></li>
            <li ><a href="404.html">404 page</a></li>
            <li ><a href="500.html">500 page</a></li>
            <li ><a href="503.html">503 page</a></li>
        </ul>
       
        <a href="help.html" class="nav-header" ><i class="icon-question-sign"></i>Help</a>
        <a href="faq.html" class="nav-header" ><i class="icon-comment"></i>Faq</a>
    </div>

	<div class="content">

	</div>

	<script src='<c:url value="/resources/lib/bootstrap/js/bootstrap.js" />'></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
</body>
</html>