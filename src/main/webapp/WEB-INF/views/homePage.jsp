<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Bangalore Forum</title>

</head>


<body>
	<h2>Procrastinate Forum</h2>
	<button id="signUp" onclick="signUpMethod">Sign Up</button>
	<button id="login" onclick="loginMethod">Login</button> <br><br>
	<table>
		<c:forEach items="${homePage}" var="homePage">
			<tr>
			<a href="/bangalore/${homePage.topicName}">${homePage.topicName}
			</a>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="/bangalore/newPost">Create Post</a>
	
	<script>
		function signUpMethod() {
			alert("sign up");
		}
	</script>
</body>
</html>