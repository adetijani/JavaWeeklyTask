<%--
  Created by IntelliJ IDEA.
  User: dsc
  Date: 27/07/2023
  Time: 12:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html>
<head>
  <title>Facebook Post</title>
  <style>
    /* Your CSS styles here */
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f2f5;
    }

    #post-container {
      max-width: 500px;
      margin: 50px auto;
      background-color: #fff;
      border: 1px solid #ddd;
      border-radius: 4px;
      padding: 20px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    h2 {
      color: #1877f2;
      margin-bottom: 10px;
    }

    p {
      margin-bottom: 20px;
    }

    img {
      max-width: 100%;
      border-radius: 4px;
    }

    .post-details {
      color: #888;
      font-size: 14px;
    }

    .like-button {
      background-color: #1877f2;
      color: #fff;
      padding: 5px 10px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    .like-button:hover {
      background-color: #11529d;
    }
    .logout-btn {
      position: absolute;
      top: 10px;
      right: 10px;
      background-color: #f44336;
      color: white;
      padding: 10px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    .facebook-icon {
      position: absolute;
      top: 10px;
      left: 10px;
      font-size: 12px;
    }

    /* Style for the header within the text box */
    textarea {
      font-size: 16px; /* Adjust font size as needed */
      font-weight: normal;
    }

    /* Style for the header text (automatically turns bold) */
    textarea::first-line {
      font-weight: bold;
    }
  </style>
</head>
<body>
<!-- Add the Facebook icon at the top left corner -->
<div>
  <img src="icons/facebookicon.png"width="50px">
</div>


<!-- Your common header and navigation -->
<header>
  <form method="post" action="${pageContext.request.contextPath}/PostControlServlet">
  </form>
</header>
<div id="post-container">
  <label>
    <textarea name="post" rows="6" cols="50" placeholder="Write something today...">
    </textarea>
  </label>
  <label for="photo-upload" class="add-photo-button">
    <input type="file" id="photo-upload" style="display: none;" accept="image/*">
    <img src="icons/attachment-svgrepo-com.svg" width="20" alt="Attach Photo">
  </label>
  <button type="submit">Post</button>
</div>

<div id="post-container">
  <h2>Debo Just landed</h2>
  <p>Having a great time at the beach!</p>
  <img src="images/palms-tropical-beach-white-sand-summer-vacation-travel-holiday-background-concept-caribbean-paradise-beach-palms-136606345.webp" width="500px" alt="Beach Photo">
  <p class="post-details">10000likes • 800comments • 100 share</p>
  <button class="like-button">Like</button>
</div>
<%--Second post--%>
<div id="post-container">
  <h2>Gabriel the family man</h2>
  <p>Taking time out with family! </p>
  <img src="images/beach%202.jpeg" width="500px" alt="Beach Photo">
  <p class="post-details">5000 likes • 500 comments • 30 share</p>
  <button class="like-button">Like</button>
</div>
<%--Third Post--%>
<div id="post-container">
  <h2>Jubril the coder</h2>
  <p>Code or No code, We die Here! </p>
  <img src="images/coder.webp" width="500px" alt="Beach Photo">
  <p class="post-details">1000 likes • 2000 comments • 120 share</p>
  <button class="like-button">Like</button>
</div>
<%--Forth Post--%>
<div id="post-container">
  <h2>Jerry the prayer warrior</h2>
  <p>Prayer is the master Key!</p>
  <img src="images/priest.jpeg" width="500px" alt="Beach Photo">
  <p class="post-details">1000 likes • 2000 comments • 120 share</p>
  <button class="like-button">Like</button>
</div>
<%--Fifth Post--%>
<div id="post-container">
  <h2>David the spender (OBO)</h2>
  <p>In this world, Have money oooo! </p>
  <img src="images/money.webp" width="500px" alt="Beach Photo">
  <p class="post-details">100000 likes • 20000 comments • 1000 share</p>
  <button class="like-button">Like</button>
</div>

<%--for the logout--%>
<div id="login-button-container">
  <!-- Add the logout button at the top right corner -->
  <a href="login.jsp"><button class="logout-btn">Logout</button><a/>
  </a>>
</div>
</body>
</html>