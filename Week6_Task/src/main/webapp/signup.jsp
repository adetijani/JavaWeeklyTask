<%--
  Created by IntelliJ IDEA.
  User: dsc
  Date: 27/07/2023
  Time: 12:58 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <title>Facebook Sign Up</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f2f5;
    }

    #container {
      max-width: 400px;
      margin: 100px auto;
      background-color: #fff;
      padding: 20px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    h1 {
      color: #1877f2;
      text-align: center;
      margin-bottom: 20px;
    }
    /*this is for the input section */
    input {
      width: 95%;
      padding: 10px;
      margin-bottom: 15px;
      border: 2px solid #ccc;
      border-radius: 5px;
      font-size: 16px;
    }
    /*this is for when you select the button*/
      select {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 4px;
      font-size: 16px;
    }
  /*this is for the button*/
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
  </style>

  <!-- Add the Facebook icon at the top left corner -->
  <div>
    <img src="icons/facebookicon.png"width="50px">
  </div>

</head>
<body>
  <div id="container">
    <h1>Facebook Sign Up</h1>
    <form action="${pageContext.request.contextPath}/SignupControlServlet" method="post">
<%--    <form>--%>
<%--      <input type="text" placeholder="User ID" name="userId">--%>
      <input type="text" placeholder="First Name" name="firstName">
      <input type="text" placeholder="Last Name" name="lastName">
      <input type="tel" placeholder="Phone Number" name="phoneNumber">
      <input type="password" placeholder="Password" name="password">
      <input type="email" placeholder="Email" name="email">
      <select name="gender" id="gender">
        <option value="male">Male</option>
        <option value="female">Female</option>
      </select>
      <button type="submit"> <a href="/Login.jsp">Sign-up</a></button>

    <p>Already have an account?<a href="${pageContext.request.contextPath}/login.jsp">Log In</a> </p>
  </div>
</body>
</html>


