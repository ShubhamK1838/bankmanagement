<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 50%;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 8px;
            border-radius: 5px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        .buttons {
            display: flex;
            justify-content: space-between;
        }

        button {
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 50%;
            margin: 4px;
        }

        .login {
            background-color: #333;
            color: white;
        }

        .signup {
            background-color: #4CAF50;
            color: white;
        }
    </style>
    <%@include file="loader.jsp"%>
</head>

<body id="body">

<div class="container">
    <h2>Bank Application - Login</h2>
    <form id="loginForm" method="post" action="http://omen:8081/bank/login">
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div class="buttons">
            <button onclick="openSignup()" type="button" class="signup" >
            Signup
            </button>
            <button type="submit" class="login">Login</button>
        </div>
        <p id="err" style="color:red ">

        </p>
    </form>
</div>

<script>
    function openSignup()
    {
        var a= document.createElement("a")
        a.href="/bank/customer/signup";
        a.click();
    }
    document.getElementById('loginForm').addEventListener('submit', function (event) {
        startLoader("body")
        event.preventDefault();
        var formData = new FormData(this);

        fetch("/bank/customer/auth",
            {
                method:"post",
                body:formData
            })
            .then((res)=>{
                if(res.ok)
                {
                    return res.text();
                }else
                {
                    document.getElementById("err").innerText="Invalid Customer Details...";
                    return null;
                }
            }).then((res)=>{
                stopLoader();
            if(res==null) return ;
            else
            {
                var a=document.createElement("a");
                a.href=res;
                a.click();
            }
        })

    });
</script>

</body>

</html>
