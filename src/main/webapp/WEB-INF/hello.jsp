<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>decouverte</title>
</head>
<body>
<!-- <h1>Hello world</h1> -->
<%--  <jsp:useBean id = "nom" class="java.lang.String" scope = "request" /> --%>
<%--  <p> <%= nom %> </p> --%>

${ personne }
${ personne1 }

<p>${header["User-agent"]}</p>

</body>
</html>