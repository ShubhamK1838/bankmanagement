<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>404 Page Not Found</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
            padding: 20px;
            box-sizing: border-box;
        }

        h1 {
            color: #ff4d4d;
            font-size: 48px;
            margin-bottom: 10px;
        }

        p {
            color: #555;
            font-size: 20px;
            text-align: center;
            margin: 5px 0;
        }

        a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
            margin-top: 20px;
            font-size: 18px;
            transition: color 0.3s;
        }

        a:hover {
            text-decoration: underline;
            color: #388E3C; /* Darker shade for hover effect */
        }

        /* Responsive Styles */
        @media (max-width: 768px) {
            h1 {
                font-size: 36px;
            }

            p {
                font-size: 18px;
            }

            a {
                font-size: 16px;
            }
        }

        @media (max-width: 480px) {
            h1 {
                font-size: 28px;
            }

            p {
                font-size: 16px;
            }

            a {
                font-size: 14px;
            }
        }
    </style>
</head>
<body>

<h1>404 - Page Not Found</h1>
<p>Sorry, the page you are looking for does not exist.</p>
<p>Please check the URL or go back to the <a href="/bank/customer/home">homepage</a>.</p>

</body>
</html>
