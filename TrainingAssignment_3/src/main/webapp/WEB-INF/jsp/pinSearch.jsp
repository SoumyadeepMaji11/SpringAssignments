<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By Pincode</title>
</head>
<body>
    <header>Vaccination Drive</header>
    <div id="advert">
        <div id="inner">Pin Search
            <form id="form" action="/pincode/pin" method="post">
                Enter Pin-code: <input class="fill" type="number" name="pincode"><br>
                <input class="link" type="submit" value="Search">
            </form>
        </div>
    </div>
</body>
</html>