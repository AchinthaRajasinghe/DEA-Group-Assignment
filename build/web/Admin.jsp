<%-- 
    Document   : Admin
    Created on : May 24, 2022, 9:14:56 PM
    Author     : dell
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
    background-image: linear-gradient(rgba(0,0,0,.5), rgba(0,0,0,.5)), url(963.jpg);
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



	<title>New Account</title>
</head>
<body>
	<div class="container">
		<form action="" method="POST" name="login" class="login-form">
            <p class="login-text" style="font-size: 2rem; font-weight: 800;">Create an Account</p>

            
			<div class="input-group">
				<input type="text" placeholder="Username" name="ausername" id="ausername" value="" required>
			</div>

			<div class="input-group">
				<input type="password" placeholder="Password" name="apassword" id="apassword" value="" required>
            </div>

            <div class="">
                <input type="checkbox" name="checkbox" value="Clear" class="checkbox" onchange="document.getElementById('apassword').type=this.checked?'text':'password'">
                <font>Show Password</font>
            </div><br>
 
			<div class="input-group">
                <input type="button" name="submit" value="Create" class="btn" onclick="loggingform()">


			</div>

			 <div class="input-group">
                <input type="reset" name="reset" value="Clear" class="btn" onclick="Closeform()">
            </div>
			<p class="login-admin-text">Go to login? <a href="index.html">Login Here</a>.</p>
		</form>
	</div>
</body>
</html>