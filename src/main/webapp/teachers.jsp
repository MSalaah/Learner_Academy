<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
 <%@ page import="entity.Teacher"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width,
				initial-scale=1.0">
<title>Academy Teachers</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="responsive.css">
</head>
<body>

		<div class="report-container">
				<div class="report-header">
					<h1 class="recent-Articles" id='title'>Teachers</h1>
				</div>

				<div class="report-body">
					<div class="report-topic-heading">
						<h3 class="t-op">Name</h3>
						<h3 class="t-op">Views</h3>
						<h3 class="t-op">Comments</h3>
						<h3 class="t-op">Status</h3>
					</div>
					   
					<div class="items">
					
					<c:forEach items="${teachers}" var="teacher">
		  			<div class="item1">
					<h3 class="t-op-nextlvl">${teacher.getName()}</h3>
					<h3 class="t-op-nextlvl">2</h3>
					<h3 class="t-op-nextlvl">210</h3>
					<h3 class="t-op-nextlvl label-tag">Published</h3>
					</div>
					</c:forEach>
					</div> 
				</div>
			</div>
</body>
</html>