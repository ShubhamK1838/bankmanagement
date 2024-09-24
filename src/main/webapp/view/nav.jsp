<%@ page import="java.util.Base64" %>
<%@ page import="com.bank.dto.CustomerDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

     CustomerDTO customer =(CustomerDTO) session.getAttribute("customer");
     if(customer == null) {
         request.getRequestDispatcher("/customer/login").forward(request, response);
     }
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
        }

        /* Navigation Bar Styles */
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 20px;
            background-color: #4CAF50;
        }

        .navbar .brand {
            font-size: 24px;
            font-weight: bold;
            color: white;
        }

        .navbar .tabs {
            display: flex;
            align-items: center;
        }

        .navbar .tabs a {
            text-decoration: none;
            color: white;
            margin: 0 10px;
            font-size: 16px;
            padding: 10px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .navbar .tabs a:hover {
            background-color: rgba(255, 255, 255, 0.2); /* Subtle hover effect */
        }

        /* Profile and User Logo */
        .navbar .user-profile {
            display: flex;
            align-items: center;
        }

        .navbar .user-profile img {
            width: 40px;
            height: 40px;
            border-radius: 50%;
            margin-right: 10px;
        }

        .navbar .user-profile span {
            color: white;
            font-size: 16px;
        }

        /* Mobile Responsive */
        @media (max-width: 768px) {
            .navbar {
                flex-direction: column;
                align-items: flex-start;
            }

            .navbar .tabs {
                flex-direction: column;
                width: 100%;
            }

            .navbar .tabs a {
                margin: 10px 0;
                width: 100%;
                text-align: center;
            }
        }
    </style>
</head>
<body>

<nav class="navbar">
    <div class="brand">Bank</div>

    <div class="tabs">
        <a href="#home">Home</a>
        <a href="#accounts">Accounts</a>
        <a href="#transactions">Transactions</a>
        <a href="#loans">Loans</a>
        <a href="#services">Services</a>
        <a href="#support">Support</a>
        <a href="#logout">Logout</a>
    </div>

    <div class="user-profile">
        <img src="data:image/jpeg;base64,<%= (customer!=null)?Base64.getEncoder().encodeToString(customer.getProfile().getProfileData().getData()):"" %>" alt="User Image" class="user-image">
        <span><%=customer!=null?customer.getFirstName():""%></span>
    </div>
</nav>
</body>
</html>
