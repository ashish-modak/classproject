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

<link rel="stylesheet" type="text/css"
	href='<c:url value="/resources/stylesheets/theme.css"/>'>
<link rel="stylesheet"
	href='<c:url value="/resources/lib/font-awesome/css/font-awesome.css"/>'>

<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>

<script src='<c:url value="/resources/lib/jquery-1.7.2.min.js"/>'
	type="text/javascript"></script>

<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.brand {
	font-family: georgia, serif;
}

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
<title>Student Detail Info Page</title>
</head>
<body class="">
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav pull-right">

				<li id="fat-menu" class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown"> <i
						class="icon-user"></i> ${user.userName} <i class="icon-caret-down"></i>
				</a>

					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#">My Account</a>
						</li>
						<li class="divider visible-phone"></li>
						<li><a tabindex="-1" href="sign-in.html">Logout</a>
						</li>
					</ul></li>

			</ul>
			<div class="brand">
				<span class="first">Crystal</span> <span class="second">Coaching</span>
			</div>
		</div>
	</div>

	<div class="sidebar-nav">
		<a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i
			class="icon-dashboard"></i>Dashboard</a>
		<ul id="dashboard-menu" class="nav nav-list collapse in">
			<li><a href="index.html">Home</a>
			</li>
			<li><a href="users.html">Sample List</a>
			</li>
			<li><a href="user.html">Sample Item</a>
			</li>
			<li><a href="media.html">Media</a>
			</li>
			<li><a href="calendar.html">Calendar</a>
			</li>

		</ul>

		<a href="#students-menu" class="nav-header" data-toggle="collapse"><i
			class="icon-briefcase"></i>Student</a>
		<ul id="students-menu" class="nav nav-list collapse">
			<li><a href="sign-in.html">View Student Info</a>
			</li>
			<li><a href="sign-up.html">Enroll Student</a>
			</li>
			<li><a href="reset-password.html">Reset Password</a>
			</li>
		</ul>

		<a href="#employees-menu" class="nav-header" data-toggle="collapse"><i
			class="icon-briefcase"></i>Employee</a>
		<ul id="employees-menu" class="nav nav-list collapse">
			<li><a href="sign-in.html">View Employee Info</a>
			</li>
			<li><a href="sign-up.html">Enroll Employee</a>
			</li>
			<li><a href="reset-password.html">Reset Password</a>
			</li>
		</ul>

		<a href="#error-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-exclamation-sign"></i>Error
			Pages <i class="icon-chevron-up"></i>
		</a>
		<ul id="error-menu" class="nav nav-list collapse">
			<li><a href="403.html">403 page</a>
			</li>
			<li><a href="404.html">404 page</a>
			</li>
			<li><a href="500.html">500 page</a>
			</li>
			<li><a href="503.html">503 page</a>
			</li>
		</ul>

		<a href="help.html" class="nav-header"><i
			class="icon-question-sign"></i>Help</a> <a href="faq.html"
			class="nav-header"><i class="icon-comment"></i>Faq</a>
	</div>

	<div class="content">
		<div class="header">

			<h1 class="page-title">Student Information</h1>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">

				<div class="search-well">
					<form:form cssClass="form-inline" method="POST"
						action="viewstudentinfo.html">
						<form:label path="id">Student ID</form:label>
						<form:input cssClass="input-small" path="id" />
						<input class="btn" type="submit" value="View" />
					</form:form>
				</div>

				<c:if test="${not empty studentTO.id }">
					<div class="btn-toolbar">
						<button class="btn btn-primary">
							<i class="icon-save"></i> Save
						</button>
						<a href="#myModal" data-toggle="modal" class="btn">Delete</a>
						<div class="btn-group"></div>
					</div>


					<div class="well">
						<form:form id="tab" method="POST" action="studentinfosave.html"
							commandName="command">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#home" data-toggle="tab">Profile</a>
								</li>
								<li><a href="#finance" data-toggle="tab">Finance</a>
								</li>
								<li><a href="#attendence" data-toggle="tab">Attendence</a>
								</li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div class="tab-pane active in" id="home">

									<form:label path="id">Id</form:label>
									<input type="text" value="${studentTO.id}" class="input-xlarge"	disabled="disabled">
									<form:label path="studentUserName">Student Username</form:label>
									<input type="text" value="${studentTO.studentUserName}"	class="input-xlarge" disabled="disabled">
									<form:label path="name">Name</form:label>
									<input type="text" value="${studentTO.name}" class="input-xlarge">
									<form:label path="age">Age</form:label>
									<input type="text" value="${studentTO.age}"	class="input-xlarge">
									<form:label path="schoolName">School Name</form:label>
									<input type="text" value="${studentTO.schoolName}" class="input-xlarge">
									<form:label path="schoolName">Batch Name</form:label>
									<input type="text" value="${studentTO.classBatchTO.batchName}" class="input-xlarge">
									<form:label path="schoolName">Batch Standard</form:label>
									<input type="text" value="${studentTO.classBatchTO.batchStandard}" class="input-xlarge">
									<form:label path="address">Address</form:label>
									<textarea rows="3" class="input-xlarge">${studentTO.address}</textarea>
									<form:label path="contactNumber">Contact Number</form:label>
									<input type="text" value="${studentTO.contactNumber}" class="input-xlarge">
									<form:label path="parentName">Parent Name</form:label>
									<input type="text" value="${studentTO.parentName}" class="input-xlarge">
									<form:label path="contactNumberParent">Contact Number Parent</form:label>
									<input type="text" value="${studentTO.contactNumberParent}" class="input-xlarge">
									<form:label path="consesation">Consession</form:label>
									<input type="text" value="${studentTO.consesation}" class="input-xlarge">
									<form:label path="otherInfo">Other Info</form:label>
									<textarea rows="3" class="input-xlarge">${studentTO.otherInfo}</textarea>

								</div>
								<div class="tab-pane fade" id="finance">
									<table class="table">
										<thead>
											<tr>
												<th>#</th>
												<th>Amount</th>
												<th>Received Date</th>
												<th>Receiving Name</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${studentFinanceTOs}"
												var="studentFinanceTO">
												<tr>
													<td><c:out value="${studentFinanceTO.id}" />
													</td>
													<td><c:out value="${studentFinanceTO.amount}" />
													</td>
													<td><fmt:formatDate type="date" value="${studentFinanceTO.receivedDate}" />
													</td>
													<td><c:out value="${studentFinanceTO.receivingName}" />
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
									<div class="block span6">
										<a href="#widget1container" class="block-heading"
											data-toggle="collapse">Information </a>
										<div id="widget1container" class="block-body collapse in">
											<h5>Total Fee : ${totalfee}</h5>
											<h5>Paid Fee : ${paidfee}</h5>
											<h5>Remaining Fee : ${remainingfee}</h5>
										</div>
									</div>

								</div>
								<div class="tab-pane fade" id="attendence">
									<table class="table">
										<thead>
											<tr>
												<th>#</th>
												<th>Absent Date</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${studentTO.attendanceTOs}"
												var="attendance">
												<tr>
													<td><c:out value="${attendance.id}" />
													</td>
													<td><fmt:formatDate type="date" value="${attendance.absentDate}" />
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</form:form>
					</div>
				</c:if>
			</div>
		</div>

	</div>

	<script
		src='<c:url value="/resources/lib/bootstrap/js/bootstrap.js" />'></script>
	<script type="text/javascript">
		$("[rel=tooltip]").tooltip();
		$(function() {
			$('.demo-cancel-click').click(function() {
				return false;
			});
		});
	</script>
</body>
</html>