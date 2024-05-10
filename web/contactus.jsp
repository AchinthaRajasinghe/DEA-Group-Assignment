<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Contact Us</title>
        <jsp:include page="includes/header.jsp"/>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
            }

            nav {
                background-color: #333;
                overflow: hidden;
            }

            nav ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
            }

            nav li {
                float: left;
            }

            nav a {
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            nav a:hover {
                color: #ddd;
            }

            *{
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
            font-family: sans-serif;
        }
        .contact{
            min-height: 100vh;
            background-color: #e8f0fe;
            padding: 50px;
            text-align: center;
        }
        .container{
            max-width: 800px;
            margin: 0 auto;
        }
        .container h2{
            font-size: 36px;
            margin-bottom: 40px;
            color: #333;
        }
        .contact-wrapper{
            display: grid;
            grid-template-columns: repeat(2, 1fr);
            grid-gap: 30px;
        }
        .contact-form{
            text-align: left;
        }
        .contact-form h3{
            font-size: 24px;
            margin-bottom: 20px;
            color: #333;
        }
        .form-group{
            margin-bottom: 20px;
        }
        input, textarea{
            width: 100%;
            padding: 12px;
            border-radius: 8px;
            border: none;
            background-color: #f8f9fa;
            color: #333;
        }
        input:focus,
        textarea:focus{
            outline: none;
            box-shadow: 0 0 8px #bbb;
        }
        button{
            display: inline-block;
            padding: 12px 24px;
            background-color: #4caf50;
            color: #fff;
            border: none;
            cursor: pointer;
            transition: 0.3s ease;
        }
        button:hover{
            background-color: #45a049;
        }
        .contact-info{
            text-align: left;
        }
        .contact-info h3{
            font-size: 24px;
            margin-bottom: 20px;
            color: #333;
        }
        .contact-info p{
            margin-bottom: 10px;
            color: #555;
        }
        .contact-info i{
            color: #4caf50;
            margin-right: 10px;
        }
        @media screen and(max-width: 768px) {
            .container{
                padding: 20px;
            }
            .contact-wrapper{
                grid-template-columns: 1fr;
            }
        }
            </style>

        </head>
        <body>
            <jsp:include page="includes/navbar.jsp"/>
            <section class="contact">
        <div class="container">
            <h2>Contact Us</h2>
            <div class="contact-wrapper">
                <div class="contact-form">
                    <h3>Send Us a Message</h3>
                    <form action="">
                        <div class="form-group">
                            <input type="text" name="name" placeholder="Your Name">
                        </div>
                        <div class="form-group">
                            <input type="email" name="email" placeholder="Your Email">
                        </div>
                        <div class="form-group">
                            <textarea name="Message" placeholder="Your Message"></textarea>
                        </div>
                        <button type="submit">Send Message</button>
                    </form>
                </div>
                <div class="contact-info">
                    <h3>Contact Information</h3>
                    <p><i class="fas fa-phone"></i> +9411 852 8520</p>
                    <p><i class="fas fa-envelope"></i>FreshStopinfo@gmail.com</p>
                    <p><i class="fas fa-map-marker-alt"></i>No 45/A High Level Rd, Nugegoda, Sri Lanka</p>
                </div>
            </div>
        </div>

    </section>
        </body>
        <jsp:include page="includes/footer.jsp"/>
    </html>
