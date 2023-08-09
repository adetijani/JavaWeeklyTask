<%--
  Created by IntelliJ IDEA.
  User: dsc
  Date: 27/07/2023
  Time: 12:55 pm
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html>
<head>
  <title>Facebook Login</title>
  <style>
    /* Your CSS styles here */
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f2f5;
    }

    #container {
      max-width: 400px;
      margin: 100px auto;
      background-color: #fff;
      padding: 20px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    h1 {
      color: #1877f2;
      text-align: center;
      margin-bottom: 20px;
    }

    input {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 4px;
      font-size: 16px;
    }

    button {
      width: 100%;
      padding: 10px;
      background-color: #1877f2;
      color: #fff;
      border: none;
      border-radius: 4px;
      font-size: 16px;
      cursor: pointer;
    }

    button:hover {
      background-color: #11529d;
    }

    #signup-link {
      display: block;
      text-align: center;
      margin-top: 15px;
      color: #1877f2;
    }
  </style>
</head>
<body>
<div id="container">
  <h1>Facebook Login</h1>
  <form action="${pageContext.request.contextPath}/LoginControlServlet" method="post">
  <form>
    <input type="email" placeholder="Email" name="email">
    <input type="password" placeholder="Password" name="password">
    <button type="submit"><a href="#">Login</a></button>
    <a href="signup.jsp" id="signup-link">Create New Account</a>
    <p>Proceed to the <a href="post.jsp">Facebook Post</a> page.</p>
  </form>
</div>
</body>
</html>

