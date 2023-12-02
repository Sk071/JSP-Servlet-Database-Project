<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

 <!-- Navbar -->

    <nav class="navbar navbar-expand-lg bg-danger navbar-dark">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Navbar</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav>


  <!-- Login Form -->
	<div class="container-fluid">
		<div class="row justify-content-evenly">
			<div class="col-md-6 mt-4">
				<h1 class="text-center pt-5 display-4">Welcome to JSP Demo Project</h1>
				<br>
				<h6 class="text-center mb-3 mt-3">Please submit below details to save into database</h6>
				<form method="post" action="SubmitServlet">
					<div class="mb-3">
						<label for="fname" class="form-label">First Name</label> <input
							type="text" name="fname" class="form-control" id="fname">
					</div>
					<div class="mb-3">
						<label for="lname" class="form-label">Last Name</label> <input
							type="text" name="lname" class="form-control" id="lname">
					</div>
					<div class="mb-3">
						<label for="age" class="form-label">Age</label> <input
							type="number" name="age" class="form-control" id="age">
					</div>
					<div class="mb-3">
						<label for="city" class="form-label">City</label> <input
							type="text" name="city" class="form-control" id="city">
					</div>
					
					<div class=text-center>
					<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
				
			</div>
		</div>
 
</div>
    </div>
   </div>

</body>
</html>