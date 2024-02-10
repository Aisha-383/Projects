<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login</title>
     <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .login-box {
            width: 300px;
            padding: 20px;
            border: 1px solid #ccc;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .login-box input {
            width: 100%;
            margin-bottom: 10px;
            padding: 8px;
            box-sizing: border-box;
        }

      
    </style>
</head>
<body>



   <body>
    <div class="login-box">
        <h2>User Login</h2>
        <form>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <br>
              <button ><a href="/Vacc/ctrall">Login</a></button>
            <button ><a href="/Vacc/register">Register</a></button>
        </form>
     
    </div>
</body>
</body>
</html>
