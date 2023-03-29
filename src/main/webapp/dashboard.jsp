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
<title>Academy Dashboard</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="responsive.css">
</head>

<body>

	<!-- for header part -->
	<header>

		<div class="logosec">
			<div class="logo">Learner Academy</div>
			<img
				src="https://media.geeksforgeeks.org/wp-content/uploads/20221210182541/Untitled-design-(30).png"
				class="icn menuicn" id="menuicn" alt="menu-icon">
		</div>

		<div class="searchbar">
			<input type="text" placeholder="Search">
			<div class="searchbtn">
				<img
					src="https://media.geeksforgeeks.org/wp-content/uploads/20221210180758/Untitled-design-(28).png"
					class="icn srchicn" alt="search-icon">
			</div>
		</div>

		<div class="message">
			<div class="circle"></div>
			<img
				src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183322/8.png"
				class="icn" alt="">
			<div class="dp">
				<img
					src="https://media.geeksforgeeks.org/wp-content/uploads/20221210180014/profile-removebg-preview.png"
					class="dpicn" alt="dp">
			</div>
		</div>

	</header>

	<div class="main-container">
		<div class="navcontainer">
			<nav class="nav">
				<div class="nav-upper-options">

					<div class="nav-option option1">
						<img
							src="https://media.geeksforgeeks.org/wp-content/uploads/20221210182148/Untitled-design-(29).png"
							class="nav-img" alt="dashboard">
						<h3>Dashboard</h3>
					</div>


					<a href="subject">

						<div class="option2 nav-option" >
							<img
								src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183322/9.png"
								class="nav-img" alt="articles">
							<h3>Subjects</h3>
						</div>
					</a> 
					
					<a href="teacher">

						<div class="nav-option option3" >
							<img
								src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/5.png"
								class="nav-img" alt="report">
							<h3>Teachers</h3>
						</div>
					</a> 
					
					<a href="class">
						<div class="nav-option option4" >
							<img
								src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/6.png"
								class="nav-img" alt="institution">
							<h3>Classes</h3>
						</div>

					</a> 
					
					<a href="login">
						<div class="nav-option logout">
							<img
								src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/7.png"
								class="nav-img" alt="logout">
							<h3>Logout</h3>
						</div>
					</a>

				</div>
			</nav>
		</div>
		<div class="main">

			<div class="searchbar2">
				<input type="text" name="" id="" placeholder="Search">
				<div class="searchbtn">
					<img
						src="https://media.geeksforgeeks.org/wp-content/uploads/20221210180758/Untitled-design-(28).png"
						class="icn srchicn" alt="search-button">
				</div>
			</div>

			<div class="report-container">
				<div class="report-header">
					<h1 class="recent-Articles" id='title'>Recent Articles</h1>
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
		</div>
	</div>

	<script>
	function populateData(title) {
		console.log(document.getElementById('title').innerHTML)
		document.getElementById('title').innerHTML= title
		/* 
		document.getElementById(‘title’).innerHTML = “new_text”
		*/
		
		}
	</script>
</body>
</html>