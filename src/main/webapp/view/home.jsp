<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Management System - Customer Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        .container {
            max-width: 1200px;
            margin: 30px auto;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            gap:20px;
        }

        .grid {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 20px;
        }

        .grid-item {
            padding: 20px;
            text-align: center;
            background-color: #f4f4f9;
            border: 1px solid #ddd;
            border-radius: 10px;
            transition: transform 0.3s ease;
        }

        .grid-item:hover {
            transform: scale(1.05);
        }

        .grid-item *{
            margin: 6px;
        }

        .grid-item h3 {
            color: #333;
        }

        .grid-item p {
            color: #555;
        }

        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #45a049;
        }

        footer {
            text-align: center;
            padding: 20px;
            background-color: #333;
            color: white;
            margin-top: 40px;
        }

        /* Responsive Styles */
        @media (max-width: 1024px) {
            .grid {
                grid-template-columns: repeat(2, 1fr);
            }
        }

        @media (max-width: 768px) {
            .grid {
                grid-template-columns: 1fr;
            }



            .grid-item {
                padding: 15px;
            }

            button {
                width: 100%;
            }
        }

    </style>
</head>

<body>


<%@include file="nav.jsp"%>

<div class="container">
    <div class="grid">
        <div class="grid-item" id="overview">
            <h3>Account Overview</h3>
            <p>View your account balance, savings, and account details.</p>
            <button onclick="window.location.href='account-overview.html'">View Details</button>
        </div>

        <div class="grid-item" id="transfer">
            <h3>Transfer Funds</h3>
            <p>Transfer funds to other accounts securely and easily.</p>
            <button onclick="window.location.href='transfer-funds.html'">Transfer Now</button>
        </div>

        <div class="grid-item" id="history">
            <h3>Transaction History</h3>
            <p>Check your recent transactions and download statements.</p>
            <button onclick="window.location.href='transaction-history.html'">View History</button>
        </div>

        <div class="grid-item" id="settings">
            <h3>Account Settings</h3>
            <p>Update personal information and security settings.</p>
            <button onclick="window.location.href='account-settings.html'">Manage Settings</button>
        </div>

        <div class="grid-item">
            <h3>Customer Support</h3>
            <p>Contact our support team for assistance with your account.</p>
            <button onclick="window.location.href='customer-support.html'">Get Support</button>
        </div>

        <div class="grid-item">
            <h3>Investment Options</h3>
            <p>Explore investment plans tailored to your needs.</p>
            <button onclick="window.location.href='investment-options.html'">Explore Now</button>
        </div>
    </div>
</div>

<footer>
    <p>© 2024 Bank Management System. All rights reserved.</p>
</footer>

</body>
 
</html>
