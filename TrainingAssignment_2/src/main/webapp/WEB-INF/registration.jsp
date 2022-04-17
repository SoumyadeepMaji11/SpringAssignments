<%@ page isELIgnored="false"%>
<html>
<head>
<title>Registration Page</title>
</head>
<body>
	<h3>Enter an UserId and Password</h3>

	<form action="register" method="post">
		<pre>
	    <strong>Register Here | <a href="login">Click here to Login</a></strong>
		
		User Id: <input type="text" name="userId" />
		
		Password: <input type="password" name="password" />
	
		<input type="submit" value="Register" />
	</pre>
	</form>

	${msg}
</body>
</html>