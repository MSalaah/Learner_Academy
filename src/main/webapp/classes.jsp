<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="entity.AcademyClass"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width,
				initial-scale=1.0">
<title>Academy Classes</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="responsive.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>

		<div class="report-container">
				<div class="report-header">
					<h1 class="recent-Articles" id='title'>Classes</h1>
				</div>

				<div class="report-body">
					<div class="report-topic-heading">
						<h3 class="t-op">Name</h3>
						<h3 class="t-op">Teacher</h3>
						<h3 class="t-op">Subject</h3>
						<h3 class="t-op">Assign Subject</h3>
					</div>
					   
					<div class="items">
					
					<c:forEach items="${classes}" var="academyClass">
		  			<div class="item1">
					<h3 class="t-op-nextlvl">${academyClass.name}</h3>
					<h3 class="t-op-nextlvl">${academyClass.getTeacher().getName()}</h3>
					<h3 class="t-op-nextlvl">${academyClass.getSubject().getName()}</h3>
					
					<form method="post">   
						 <input class="btn btn-default" type="submit" value="Assign">
					</form>  
					</div>
					</c:forEach>
					</div>
				</div>
			</div>
			
			<!-- Modal code goes here-->
<div class="modal fade" tabindex="-1" role="dialog" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Please Select Subject</h4>
      </div>
      <div class="modal-body">
	  <div class="container">
		<div class=row>
		<img src="" class="img-thumbnail col-lg-2">
	  </div>
	  </div>
	  					
					<c:forEach items="${subjects}" var="subject">
		  			<div class="item1">
					<h3 class="t-op-nextlvl">${subject.name}</h3>
					<h3 class="t-op-nextlvl"></h3>
					<h3 class="t-op-nextlvl"></h3>
					
					<form method="post">   
						 <input class="btn btn-default" type="submit" value="Assign">
					</form>  
					</div>
					</c:forEach>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
<!-- /.modal -->	
  

	<script type="text/javascript">
	function inStrGrp(src,reg){
		var regex=new RegExp("[" + reg + "]","i");
		return regex.test(src);
	}

$(document).ready(function(){
		$('input[type="submit"]').click(function (e) {
				e.preventDefault();

				$('#myModal').modal('show');

		});
	});
	
	</script>
			
</body>

</html>