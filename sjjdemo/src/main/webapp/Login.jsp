<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Material Design Bootstrap</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <!-- Bootstrap core CSS -->
    <link href="csslogin/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="csslogin/mdb.min.css" rel="stylesheet">
    <!-- Your custom styles (optional) -->
    <link href="csslogin/style.css" rel="stylesheet">
    <link href="csslogin/style1.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<div class="text-center">
    <a href="" class="btn btn-default btn-rounded mb-4" data-toggle="modal" data-target="#modalLoginForm"> Login Form</a>
</div>
<!-- Start your project here
	<form action="LoginController" method="post">
		Username:<input type="text" name="id"><br>
		Password: <input type="password" name="pw" >
		

		
		<input type="submit" value="login">

	</form>-->

    <!-- Start your project here-->
    <div style="height: 100vh">
       
    </div>
    <!-- /Start your project here-->
    <form action="LoginController" method="post">
    <div class="modal fade" id="modalLoginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header text-center">
                <h4 class="modal-title w-100 font-weight-bold">Sign in</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body mx-3">
                <div class="md-form mb-5">
                    <i class="fa fa-envelope prefix grey-text"></i>
                    <input type="text" id="defaultForm-email" name="id" >
                    <label data-error="wrong" data-success="right" for="defaultForm-email">Your Username</label>
                </div>

                <div class="md-form mb-4">
                    <i class="fa fa-lock prefix grey-text"></i>
                    <input type="password" id="defaultForm-pass" name="pw" >
                    <label data-error="wrong" data-success="right" for="defaultForm-pass">Your password</label>
                </div>

            </div>
            <div class="modal-footer d-flex justify-content-center">
                <button type="submit" class="btn btn-default">Login</button>
            </div>
        </div>
    </div>
</div>
</form>



    <!-- SCRIPTS -->
    <!-- JQuery -->
    <script type="text/javascript" src="jslogin/jquery-3.3.1.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="jslogin/popper.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="jslogin/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="jslogin/mdb.min.js"></script>

</body>
</html>