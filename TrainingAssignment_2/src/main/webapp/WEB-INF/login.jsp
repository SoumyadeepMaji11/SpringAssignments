<%@ page isELIgnored="false"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
	<h3>Enter Your UserID and Password</h3>

	<form action="loginto" method="post">
		<pre>
		 <strong>Login Here | <a href="registration">Click here to Register</a></strong>
		
		User Id: <input type="text" name="userId" />
	
		Password: <input type="password" name="password" />

		<input type="submit" value="Login" />
		</pre>
	</form>
	${msg}
</body>
</html>