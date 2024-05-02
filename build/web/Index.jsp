<%-- 
    Document   : Index
    Created on : May 24, 2022, 9:24:48 PM
    Author     : Aveesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
       * 
{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
}

body 
{
    width: 100%;
    min-height: 100vh;
    background-image: linear-gradient(rgba(0,0,0,.5), rgba(0,0,0,.5)), url(456.jpg);
    background-position: center;
    background-size: cover;
    display: flex;
    justify-content: center;
    align-items: center;
}

.container 
{
    width: 400px;
    min-height: 400px;
    background: #FFF;
    border-radius: 5px;
    box-shadow: 0 0 5px rgba(0,0,0,.3);
    padding: 40px 30px;
}

.container .login-text 
{
    color: #111;
    font-weight: 500;
    font-size: 1.1rem;
    text-align: center;
    margin-bottom: 20px;
    display: block;
    text-transform: capitalize;
}

.container .login-text-1 
{
    color: #111;
    font-weight: 500;
    font-size: 1.1rem;
    text-align: center;
    margin-bottom: 20px;
    display: block;
    text-transform: capitalize;
}

.container .login-social 
{
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(50%, 1fr));
    margin-bottom: 25px;
}

.container .login-social a 
{
    padding: 12px;
    margin: 10px;
    border-radius: 3px;
    box-shadow: 0 0 5px rgba(0,0,0,.3);
    text-decoration: none;
    font-size: 1rem;
    text-align: center;
    color: #FFF;
    transition: .3s;
}

.container .login-social a i 
{
    margin-right: 5px;
}

.container .login-form .input-group 
{
    width: 100%;
    height: 50px;
    margin-bottom: 25px;
}

.container .login-form .input-group input 
{
    width: 100%;
    height: 100%;
    border: 2px solid #e7e7e7;
    padding: 15px 20px;
    font-size: 1rem;
    border-radius: 30px;
    background: transparent;
    outline: none;
    transition: .3s;
}

.container .login-form .input-group input:focus, .container .login-form .input-group input:valid 
{
    border-color: #a29bfe;
}

.container .login-form .input-group .btn 
{
    display: block;
    width: 100%;
    padding: 15px 20px;
    text-align: center;
    border: none;
    background: #a29bfe;
    outline: none;
    border-radius: 30px;
    font-size: 1.2rem;
    color: #FFF;
    cursor: pointer;
    transition: .3s;
}

.container .login-form .input-group .btn:hover 
{
    transform: translateY(-5px);
    background: #6c5ce7;
}

.login-admin-text 
{
    color: #111;
    font-weight: 600;
}

.login-admin-text a 
{
    text-decoration: none;
    color: #6c5ce7;
}

@media (max-width: 430px) 
{
    .container 
    {
        width: 300px;
    }
    .container .login-social 
    {
        display: block;
    }
    .container .login-social a 
    {
        display: block;
    }
} 
        
        
    </style>
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" type="text/css" href="style.css">

     <script language="javascript" type="text/javascript">

        function closeform()
        {
            document.getElementById("login").style.display="none";
        }

        function loggingform()
        {
            var uname = document.login.username.value;
            var pword = document.login.password.value;

            if(uname == "hniddamaldeniya" && pword == "21882")
            {
                window.location.href="form.html";
            }
            else if (uname == "dmppdassanayake" && pword == "21889") 
            {
                window.location.href="form.html";
            }
            else if (uname == "rjgamage" && pword == "21752") 
            {
                window.location.href="form.html";
            }
            else if (uname == "asgamage" && pword == "21753") 
            {
                window.location.href="form.html";
            }
            else if (uname == "htrperera" && pword == "20516") 
            {
                window.location.href="form.html";
            }
            else if (uname == "hauwmadushanka" && pword == "21317") 
            {
                window.location.href="form.html";
            }
            else
            {
                alert("Your username or password Incorrect!!!");
            }
        }

    </script>

    <title>Login</title>
</head>
<body>
    
    <div class="container">
        <form action="" method="POST" name="login" class="login-form">
            <p class="login-text" style="font-size: 2rem; font-weight: 800;">Login</p>
            <p class="login-text-1" style="font-size: 1rem; font-weight: 700;">***Welcome to SriLankan Airline***</p>
            <div class="input-group">
                <input type="text" placeholder="Enter your Username" name="username" id="username" value="" required>
            </div>
            <div class="input-group">
                <input type="password" placeholder="Enter your Password" name="password" id="password" value="" required>
            </div>

            <div class="">
                <input type="checkbox" name="checkbox" value="Clear" class="checkbox" onchange="document.getElementById('password').type=this.checked?'text':'password'">
                <font>Show Password</font>
            </div><br>

            <div class="input-group">
                <input type="button" name="submit" value="Login" class="btn" onclick="loggingform()">
            </div>

            <div class="input-group">
                <input type="reset" name="reset" value="Clear" class="btn" onclick="Closeform()">
            </div>

            <p class="login-admin-text">Create an Account <a href="Admin.html"> Sign Up</a>.</p>
        </form>
    </div>
</body>
</html>
