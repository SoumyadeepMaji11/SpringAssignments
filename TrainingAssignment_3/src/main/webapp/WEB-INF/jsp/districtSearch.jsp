<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By District</title>
</head>
<body>
    <header>Vaccination Drive</header>
    <div id="advert">
        <div id="inner">District Search
            <form id="form" action="/district/dis" method="post">
                Enter District Name: <input class="fill" type="text" name="district"><br>
                <input class="link" type="submit" value="Search">
            </form>
        </div>
    </div>
</body>
</html>