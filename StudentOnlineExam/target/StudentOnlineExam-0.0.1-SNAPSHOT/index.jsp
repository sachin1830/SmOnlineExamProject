<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<script src='https://kit.fontawesome.com/a076d05399.js'></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="style.css">
	<title>index</title>
</head>
<body>
   <header>
    <nav class="navbar navbar-expand-lg navbar-light navbar-dark bg-dark">
    <a class="navbar-brand ml-5 " href="#">GARDIENS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-auto mr-5">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
      <%String username=(String)session.getAttribute("username"); %>
      <%if(username==null){ %>
        <a class="nav-link" href="Login.html">Login</a>
        <%}else{ %>
       
        <%} %>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Registration.html">Registration</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ContactUs.html">ContactUs</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="AdminLogin.html">Admin</a>
      </li>
    </ul>
  </div>
</nav>
<!--    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-->
<div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  <div class="carousel-inner img-fluid">
    <div class="carousel-item active">
      <img src="1.jpg" alt="Los Angeles" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Los Angeles</h3>
        <p>We had such a great time in LA!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="2.jpg" alt="Chicago" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Chicago</h3>
        <p>Thank you, Chicago!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="3.jpg" alt="New York" width="1100" height="500">
      <div class="carousel-caption">
        <h3>New York</h3>
        <p>We love the Big Apple!</p>
      </div>   
    </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
  </div>
   </header>
<!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-->
   <section class="img-fluid">
   	<div class="container-fluid">
   		<h1 class="text-center font-weight-bold pt-4 pb-4">Examination</h1>
   	</div>
<form action="QfController" method="get">
   	<div class="row">
   		<div class="col-lg-4 col-md-4 col-12">
   			<div class="card" style="width:400px">
            <img class="card-img-top" src="at.png" alt="Card image" style="width:100%">
            <div class="card-body">
            <h4 class="card-title">Aptitude</h4>
            <p class="card-text">An aptitude is a component of a competence to do a certain kind of work at a certain level. Outstanding aptitude can be considered "talent". An aptitude may be physical or mental. Aptitude is inborn potential to do certain kinds of work whether developed or undeveloped</p>
           <button type="submit" name="submit" class="btn btn-primary">Test</button>
          </div>
           </div>
   		</div>
   		<div class="col-lg-4 col-md-4 col-12">
   			<div class="card" style="width:400px">
            <img class="card-img-top" src="at.png" alt="Card image" style="width:100%">
            <div class="card-body">
            <h4 class="card-title">Resoning</h4>
            <p class="card-text">Logical Reasoning: Verbal Reasoning. Logical reasoning (verbal reasoning) refers to the ability of a candidate to understand and logically work through concepts and problems expressed in words,It checks the ability to extract and work with the meaning</p>
           <button type="submit" name="submit" class="btn btn-primary">Test</button>
          </div>
           </div>
   		</div>
   		<div class="col-lg-4 col-md-4 col-12">
   			<div class="card" style="width:400px">
            <img class="card-img-top" src="at.png" alt="Card image" style="width:100%">
            <div class="card-body">
            <h4 class="card-title">Programing</h4>
            <p class="card-text">Computer programming is the process of designing and building an executable computer program for accomplishing a specific computing task.Programming involves tasks such as: analysis, generating algorithms, profiling algorithms' accuracy and resource consumption</p>
            <button type="submit" name="submit" class="btn btn-primary">Test</button>
          </div>
           </div>
   		</div>
   	</div>
  </form>
   	<!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-->
   </section>
   <section class="bg-primary my-5">
   	<article>
   		<div class="text-center text-white">
   		<h1>About Us</h1>
   		<hr>
   		<p class="pb-4  ">Meet the Education.com teachers. A crew of experienced educators helms our vast and growing library. Harness their expertise, and get the same ..</p>
   		<button type="button" class="btn btn-warning mb-4" data-toggle="modal" data-target="#myModal">Contactus</button>
   	</div>
   	<!-- The Modal -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title"></h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
          <div class="container">
       <div class="jumbotron">
        <h1>Gardien PVT LTD.</h1>     
        <p>We are belive in smart education</p><hr>
        <div class="text-center bg-dark text-white">
        <p>Mail:skbiswal1000@gmail.com</p>      
        <p>contact:7008367639</p> 
        </div> 
       </div>     
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
   	</article>
   </section>
   <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-->
 
</body>
</html>