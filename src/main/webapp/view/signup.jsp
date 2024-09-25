<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Signup Page</title>
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

        input,
        select {
            width: 100%;
            padding: 8px;
            border-radius: 5px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        .form-group-inline {
            display: flex;
            justify-content: space-between;
        }

        .form-group-inline div {
            width: 48%;
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
</head>

<body id="body">

<div class="container">
    <h2>Bank Application - Sign Up</h2>
    <form id="signupForm" method="post" action="http://omen:8081/bank/user" enctype="multipart/form-data">

        <div class="form-group">
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required>
        </div>
        <div class="form-group">
            <label for="middleName">Middle Name:</label>
            <input type="text" id="middleName" name="middleName" required>
        </div>
        <div class="form-group">
            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required>
        </div>
        <div class="form-group">
            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>
        </div>
        <div class="form-group">
            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required>
        </div>
        <div class="form-group">
            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
                <option value="MALE">Male</option>
                <option value="FEMALE">Female</option>
                <option value="OTHER">Other</option>
            </select>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="phoneNumber">Phone Number:</label>
            <input type="number" minlength=10 maxlength=10 id="phoneNumber" name="phoneNumber" required>
        </div>
        <div class="form-group">
            <label for="maritalStatus">Marital Status:</label>
            <select id="maritalStatus" name="maritalStatus" required>
                <option value="MARRIED">MARRIED</option>
                <option value="UNMARRIED">UNMARRIED</option>
                <option value="OTHER">Other</option>
            </select>
        </div>
        <div class="form-group">
            <label for="street">Street:</label>
            <input type="text" id="street" name="street" required>
        </div>
        <div class="form-group">
            <label for="city">City:</label>
            <input type="text" id="city" name="city" required>
        </div>
        <div class="form-group">
            <label for="pinCode">Pin Code:</label>
            <input type="text" id="pinCode" name="pinCode" required>
        </div>
        <div class="form-group">
            <label for="state">State:</label>
            <input type="text" id="state" name="state" required>
        </div>
        1
        <div class="form-group">
            <label>Country: India</label>
        </div>
        <div class="form-group">
            <label for="religion">Religion:</label>
            <input type="text" id="religion" name="religion" required>
        </div>
        <div class="form-group">
            <label for="category">Category:</label>
            <input type="text" id="category" name="category" required>
        </div>
        <div class="form-group">
            <label for="income">Income:</label>
            <input type="number" id="income" name="income" required>
        </div>
        <div class="form-group">
            <label for="education">Education:</label>
            <input type="text" id="education" name="education" required>
        </div>
        <div class="form-group">
            <label for="occupation">Occupation:</label>
            <input type="text" id="occupation" name="occupation" required>
        </div>
        <div class="form-group">
            <label for="panCard">PAN Number:</label>
            <input type="text" maxlength=8 id="panCard" name="panCard" required>
        </div>
        <div class="form-group">
            <label for="aadharCard">Aadhar Number:</label>
            <input type="text" id="aadharCard" name="aadharCard" required>
        </div>

        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div class="form-group">
            <label for="profileImage">Profile Picture:</label>
            <input type="file" id="profileImage" name="profileImage" accept="image/*" required>
        </div>

        <div class="buttons">
            <button type="button" onclick="openLogin()" class="login">Login</button>
            <button type="submit" class="signup">Sign Up</button>
        </div>
    </form>
</div>

<script>
    document.getElementById('signupForm').addEventListener('submit', function (event) {

        startLoader("body")
        event.preventDefault();

        var formData = new FormData(document.getElementById("signupForm"));

        const user = {
            id: 0,
            firstName: formData.get('firstName'),
            middleName: formData.get('middleName'),
            lastName: formData.get('lastName'),
            email: formData.get('email'),
            phone: parseInt(formData.get('phoneNumber')),
            religion: formData.get('religion'),
            maritalStatus: formData.get('maritalStatus'),
            age: parseInt(formData.get('age')),
            aadharCard: formData.get('aadharCard'),
            panCard: formData.get('panCard'),
            gender: formData.get('gender'),
            income: parseInt(formData.get('income')),
            dob: formData.get('dob'),
            education: formData.get('education'),
            occupation: formData.get('occupation'),
            password: formData.get('password')
        };

        const address = {
            street: formData.get('street'),
            city: formData.get('city'),
            pinCode: formData.get('pinCode'),
            state: formData.get('state'),
            country: 'India'
        };

        var data = new FormData();

        data.append("user", JSON.stringify(user));
        data.append("address", JSON.stringify(address));
        data.append("image", formData.get("profileImage"));
        console.log(data);

        fetch('/bank/customer', {
            method: 'POST',
            body: data
        }).then(response => {
            stopLoader()
            if (response.ok) {
                openLogin();
            }
        })
            .catch(error => {
                console.error('Error:', error)
                stopLoader();
            });


    });


    function openLogin() {
        var a = document.createElement("a")
        a.href = "/bank/customer/login";
        a.click();
    }


</script>

</body>

</html>