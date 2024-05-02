<%-- 
    Document   : main
    Created on : May 24, 2022, 2:57:54 PM
    Author     : Aveesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>SriLankan Airlines</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
:root
{
    --transition: all 0.7s ease;
    --yellow: #f9d342;
    --dark: #292826;
}

*
{
    box-sizing: border-box;
    padding: 0;
    margin: 0;
    font-family: 'Playfair Display', serif;
}

html
{
    scroll-behavior: smooth;
}

body
{
    line-height: 1.6;
}

.btn
{
    font-size: 16px;
    background-color: gray;
    text-transform: uppercase;
    font-weight: 600;
    border: none;
    border-radius: 5px;
    padding: 10px;
    width: 140px;
    display: block;
    margin: 15px auto;
    cursor: pointer;
}

.btn:hover
{
    opacity: 0.85;
    font-size: 16px;
    background-color: #000000;
    color: #fff;
    transform: scale(1.05);
}

.flex
{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}

h1, h2, h3, h4, h5, h6
{
    padding: 8px 0;
}

p
{
    padding: 8px 0;

}

img
{
    width: 100%;
    display: block;
    transition: var(--transition);
}

/*body
{
    font-size: 14px;
}*/

.header
{
    background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.2)), url("888.jpg") center/cover no-repeat;
    min-height: 100vh;
    color: #fff;
    padding: 25px;
    display: flex;
    flex-direction: column;
    align-content: stretch;

}

.head-top
{
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.head-top span
{
    cursor: pointer;
    letter-spacing: 2px;
    transition: var(--transition);
}

.head-top span:hover

{
    color: var;
}

.head-bottom
{
    flex: 1;
    text-align: center;
    width: 80vw;
    margin: 0 auto;
}

.head-bottom h2
{
    padding: 22px 0;
    font-size: 45px;
    border-bottom: 1px solid #fff;
}

.head-bottom p
{
    opacity: 0.7;
    font-size: 40px;
    margin: 45px auto;
    width: 60vw;
}

.head-btn
{
    margin: 20px 0;
    font-size: 20px;
    font-weight: bold;
    border: 3px solid #fff;
    background: transparent;
    padding: 13px 20px;
    background: rgba(0, 0, 0, 0.3);
    color: #fff;
    cursor: pointer;
    transition: var(--transition);
}

.head-btn:hover
{
    background: transparent;
    color: #f2e6ff;
}

@media(max-width: 500px)
{
    .head-btn
    {
        font-size: 17px;
    }

    .head-bottom h2

    {
        font-size: 28px;
    }

    .head-bottom p
    {
        font-size: 17px;
        margin: 20px auto;
    }
}


.sidenav
{
    background: var(--dark);
    color: #fff;
    position: fixed;
    top: 0;
    bottom: 0;
    right: -100%;
    width: 300px;
    padding: 20px;
    transition: var(--transition);
    z-index: 10;
}


.sidenav.show
{
    right: 0;
}

.cancel-btn
{
    position: absolute;
    right: 25px;
    font-size: 22px;
    cursor: pointer;
    transition: var(--transition);
}

.cancel-btn:hover
{
    opacity: 0.7;
}

.navbar
{
    margin-top: 50px;
    list-style: none;
    padding: 12px;
}

.navbar li a
{
    color: #fff;
    text-transform: capitalize;
    text-decoration: none;
    padding: 15px 0;
    display: block;
    border-bottom: 0.5px solid rgba(249, 211, 66, 0.3);
    opacity: 0.8;
    letter-spacing: 1.5px;
    transition: var;
}

.navbar li a:hover
{
    padding-left: 12px;
}

.sign-up, .log-in
{
    background: var;
    color: #fff;
}

@media(max-width: 400px)
{
    .sidenav
    {
        width: 100vw;
    }
}


.title
{
    text-transform: uppercase;
    letter-spacing: 3px;
    font-size: 30px;
    color: var;
    border-bottom: 5px solid var;
    width: 235px;
    margin: 15px 0;
/*    text-align: center;*/
}

.width
{
    width: 90vw;
    background-position: center;
    margin: 0 auto!important;
    opacity: 10px;
}


@media(min-width: 992px)
{
    .services-container{
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        grid-column-gap: 30px;
    }

    .title h2
    {
        font-size: 10px;
    }
}

@media(max-width: 500px)
{
    .title h2
    {
        font-size: 24px;
    }
}




.book-form
{
    display: grid;

}

.book-form-1
{
    display: grid;
}

.form-item
{
    display: flex;
    flex-direction: column;
    justify-content: center;
    font-size: 25px;

}

.form-item-1
{
    display: flex;
    flex-direction: column;
    justify-content: center;
    font-size: 25px;
    padding-right:60%;

}

.book-form input[type = "submit"]
{
    margin: 18px 0 0 0;
    background: var;
    color: #fff;
    border: 1px solid #fff;
}

.book-form label, .book-form-1 label, .book-form input,.book-form-1 input
{
    width: 100%;
}

.book-form label, .book-form-1 label
{
    font-weight: 600;
    word-spacing: 5px;
    padding-bottom: 8px;
}

.book-form input:not(.btn), .book-form-1 input:not(.btn)
{
    margin: 4px 0 16px 0;
    padding: 12px 15px;
    border-radius: 5px;
    font-size: 20px;
    border: none;
}

.book-form input:focus , .book-form-1 input:focus
{
    outline: 0;
    box-shadow: 0 0 7px rgba(0, 0, 0, 0.4);
}

@media(min-width: 768px)
{
    .book-form
    {
        grid-template-columns: repeat(2, 1fr);
        grid-gap: 24px;
    }
}

@media(min-width: 1170px)
{
    .book-form 
    {
        grid-template-columns: repeat(3, 1fr);
    }
}

@media(min-width: 1370px)
{
    .book-form 
    {
        grid-template-columns: 2fr 2fr 1fr 1fr 1fr 2fr;
    }

    .book 
    {
        height: 40vh;
        display: grid;
    }

    
}

@media(max-width: 500px)
{
    .book
    {
        padding-left: 20px;
        padding-right: 20px;
    }

}

.rooms
{
    margin: 40px 0;
/*    text-align: center;*/
}

.room
{
    margin: 45px 0;
    padding-bottom: 25px;
    margin-right: 50%;
    background: linear-gradient(to bottom right, #00ff00 , #ff0000 , #ff7b00 );
    color: #fff;
    border-radius: 20px;
}

.room-text
{
    padding: 10px 20px;
}

.room-text h3
{
    font-size: 24px;
}

.room-image
{
    overflow: hidden;
}

.room-image img
{
    transition: var;
}

.room-image:hover img
{
    transform: scale(1.1);
}

@media (min-width: 900px)
{
    .rooms-container
    {
        display: flex;
        flex-wrap: wrap;
    }

    .room
    {
        flex: 0 0 calc(50% - 20px);
        margin: 10px;
    }
}

@media(min-width: 1370px)
{
    .rooms-container
    {
        flex-direction: column;
    }

    .room
    {
        display: flex;
        padding-bottom: 0;
        margin: 5px 0;
    }

    .room-image
    {
        flex: 1;
    }

    .room-image img
    {
        height: 100%;
    }

    .room-text
    {
        flex: 1;
    }

    .room:nth-child(even)
    {
        flex-direction: row-reverse;
    }
}

.customers
{
    margin-top: 40px;
    padding: 40px 0;
    background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("321.jpg") center/cover no-repeat fixed;
}

.customer
{
    background: #fff;
    padding: 35px;
    text-align: center;
    margin: 24px 0;
    box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.75);
    cursor: pointer;
    transition: var(--transition);
}

.customer h3
{
    font-size: 25px;
}

.customer p
{
    opacity: 0.7;
    line-height: 1.8;
    width: 60%;
    margin: 0 auto;
}


.customer span
{
    font-weight: 700;
    opacity: 0.7;
}

.customer:hover
{
    transform: translateY(-18px);
}

@media(min-width: 992px)
{
    .customers-container
    {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        grid-gap: 30px;
    }
}

@media(min-width: 1370px)
{
    .customers-container
    {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
    }
}

@media(max-width: 500px)
{
    .customer p
    {
        width: 100%;
    }
}


footer{
 position: relative;
 bottom: 0;
}
.footer-distributed{
 background-color: #292c2f;
 box-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.12);
 box-sizing: border-box;
 width: 100%;
 text-align: left;
 font: bold 16px sans-serif;
 
 padding: 55px 50px;
 margin-top: 80px;
}
 
.footer-distributed .footer-left,
.footer-distributed .footer-center,
.footer-distributed .footer-right{
 display: inline-block;
 vertical-align: top;
}
 
.footer-distributed .footer-left{
 width: 40%;
}
 
.footer-distributed h3{
 color:  #ffffff;
 font: normal 36px 'Cookie', cursive;
 margin: 0;
}
 
.footer-distributed h3 span{
 color:  #5383d3;
}
 
 
.footer-distributed .footer-links{
 color:  #ffffff;
 margin: 20px 0 12px;
 padding: 0;
}
 
.footer-distributed .footer-links a{
 display:inline-block;
 line-height: 1.8;
 text-decoration: none;
 color:  inherit;
}
 
.footer-distributed .footer-company-name{
 color:  #8f9296;
 font-size: 14px;
 font-weight: normal;
 margin: 0;
}
 
 
.footer-distributed .footer-center{
 width: 35%;
}
 
.footer-distributed .footer-center i{
 background-color:  #33383b;
 color: #ffffff;
 font-size: 25px;
 width: 38px;
 height: 38px;
 border-radius: 50%;
 text-align: center;
 line-height: 42px;
 margin: 10px 15px;
 vertical-align: middle;
}
 
.footer-distributed .footer-center i.fa-envelope{
 font-size: 17px;
 line-height: 38px;
}
 
.footer-distributed .footer-center p{
 display: inline-block;
 color: #ffffff;
 vertical-align: middle;
 margin:0;
}
 
.footer-distributed .footer-center p span{
 display:block;
 font-weight: normal;
 font-size:14px;
 line-height:2;
}
 
.footer-distributed .footer-center p a{
 color:  #5383d3;
 text-decoration: none;;
}
 
.footer-distributed .footer-right{
 width: 20%;
}
 
.footer-distributed .footer-company-about{
 line-height: 20px;
 color:  #92999f;
 font-size: 13px;
 font-weight: normal;
 margin: 0;
}
 
.footer-distributed .footer-company-about span{
 display: block;
 color:  #ffffff;
 font-size: 14px;
 font-weight: bold;
 margin-bottom: 20px;
}
 
.footer-distributed .footer-icons{
 margin-top: 25px;
}
 
.footer-distributed .footer-icons a{
 display: inline-block;
 width: 35px;
 height: 35px;
 cursor: pointer;
 background-color:  #33383b;
 border-radius: 2px;
 
 font-size: 20px;
 color: #ffffff;
 text-align: center;
 line-height: 35px;
 
 margin-right: 3px;
 margin-bottom: 5px;
}
 
 
@media (max-width: 880px) {
 
 .footer-distributed{
 font: bold 14px sans-serif;
 
 }
 
 .footer-distributed .footer-left,
 .footer-distributed .footer-center,
 .footer-distributed .footer-right{
 display: block;
 width: 100%;
 margin-bottom: 40px;
 text-align: center;
 }
 
 .footer-distributed .footer-center i{
 margin-left: 0;
 }
 .main {
 line-height: normal;
 font-size: auto;
 }

}
.centered-text {
  text-align: right;
}

        </style>
        
        <script language="javascript" type="text/javascript">

        function loginform()
        {
            window.location.href="login.jsp";
        }
        function booknow()
        {
            window.location.href="form.jsp";
        }

        </script>

    </head>

    <body>

        <header class = "header" id = "header">
            <div class = "head-top">
                <div class = "site-name">
                    <span></span>
                </div>
                <div class = "site-nav">
                    <span id = "nav-btn">MENU<i class = "fas fa-bars"></i></span>
                </div>
            </div>

            <div class = "head-bottom flex">
                <h2>WELCOME<br>TO<br><font color="#e6ac00">SriLankan Airlines</font></h2><br><br>
                <p>Don't just fly,<br>FLY BETTER.</p>
                <button type = "button" class = "head-btn" onclick="booknow()">*** Book Now ***</button>
            </div>
        </header>
 
        <div class = "sidenav" id = "sidenav">
            <span class = "cancel-btn" id = "cancel-btn">
            </span>

            <ul class = "navbar">
                <li><a href = "header">home</a></li>
                <li><a href = "book">plan & book</a></li>
                <li><a href = "Travel info.html">travel info</a></li>
                <li><a href = "index.html">login</a></li>
                <li><a href = "help.html">help</a></li>
            </ul>
            <button class = "btn sign-out" onclick="loginform()">Log Out</button>
            
        </div>

        <section class = "rooms width" id = "rooms">
            <div class = "title">
                <h4>Enhance Your Experience in SriLankan Airlines</h4>
            </div>
            <div class = "rooms-container">
                
                <article class = "room">
                    <div class = "room-image">
                        <img src = "busi.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>Business Class Upgrades</h3>
                       <p>Advance Seat Reservation
Prefer a window or an Aisle seat? Now you can secure your preferred seat well in advance at a fee before online check-in opens!<br>
Bid Now for Business Class<br>
Simply place your bid online after purchasing your Economy Class ticket and stand a chance to obtain an upgrade to Business Class
</p> 
                        <button type = "button" class = "btn" onclick="booknow()">Know More</button>
                    </div>
                </article>
                
                <article class = "room">
                    <div class = "room-image">
                        <img src = "stu.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>Student Special</h3>
                        <p>Travelling for studies? Book your flight on phoenix.com and get exclusive benefits for your student visa!
<br>
Whether you are flying off for your college education or you are off for your post-graduate studies, being away from home is difficult. So, take all your comforts with our free baggage allowance and claim the ticket discount for your loved ones.
</p>


                        <button type = "button" class = "btn" onclick="knowmore()">Know More</button>
                    </div>
                </article>
                
                
                <article class = "room">
                    <div class = "room-image">
                        <img src = "wifi.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>In-flight WiFi</h3>
                        <p>Stay productive while you fly with in-flight Wi-Fi on Phoenix Airlines. Answer your emails, surf the internet or chat with your friends online - just as you would do on the ground.<br>
The in-flight Wi-Fi facility is available for purchase on our new A330-300 and A320/321 Neo fleet. We will let you know if your flight is equipped with our inflight Wi-Fi facility during the flight.
</p>


                        <button type = "button" class = "btn" onclick="knowmore()">Know More</button>
                    </div>
                </article>
                 <article class = "room">
                    <div class = "room-image">
                        <img src = "bag.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>Baggage Allowance</h3>
                        <p>Pre-purchase excess baggage at discounted rates<br>
Save time, money and avoid hassle at the airport by pre-purchasing excess baggage at a discount from airport rates on Srilankan.com.
<br>
You can purchase discounted extra baggage while booking your flight or via our Manage my Booking feature on Srilankan.com even 3 hours prior to your scheduled departure!

</p>
                        <button type = "button" class = "btn" onclick="knowmore()">Know More</button>
                    </div>
                </article>
                
            </div>
        </section>


        <section class = "customers" id = "customers">
            <div class = "width">
                <div class = "title">
                    <h3><font color="#fff">Latest Fares</font></h3>
                </div>
                <div class = "customers-container">
                    
                    <div class = "customer">
                        
                        <h3>Pre-purchase excess baggage</h3>
                        
                        <p>Pre-purchase excess baggage at discounted rates
Save time, money and avoid hassle at the airport by pre-purchasing excess baggage at a discount from airport rates on Phoenix.com.<br>

You can purchase discounted extra baggage while booking your flight or via our Manage my Booking feature on Srilankan.com even 3 hours prior to your scheduled departure!
</p>
                        
                    </div>
                    
                    
                    <div class = "customer">
                    
                        <h3>Why Book on Phoenix.com</h3>
                        
                        <p>There are so many benefits to online ticket booking on Phoenix.com!
<br>
Your first date change is free!<br>
Your Date Change Penalty is totally waived off before you travel when you book your tickets on Srilankan.com. You simply have to pay the fare difference if any.<br>
<br>
*Please note that this facility is not valid for discounted tickets or tickets with special conditions 
</p>
                    </div>

    </section>

        <script src="script.js"></script>

<!-- footer area -->
<footer class="footer-distributed">
 
 <div class="footer-left">
 
 <h3>SriLankan <span> Airlines</span></h3>
 
 <p class="footer-links">
 <a href="#">Home</a>
 ·
 <a href="#">Book & Plan</a>
 ·
 <a href="#">Travel Info</a>
 ·
 <a href="#">Login</a>
 ·
 <a href="#">Help</a> ·

 </p>
 
 </div>
 
 <div class="footer-center">
 
 <div>
 <i class="fa fa-map-marker"></i>
 <p><span>Airline center Bandaranaike International Airport Katunayake</span> Sri Lanka</p>
 </div>
 
 <div>
 <i class="fa fa-phone"></i>
 <p>(+94)7771979</p>
 </div>
 
 <div>
 <i class="fa fa-envelope"></i>
 <p><a href="mailto:support@company.com">SriLankanAirlines@gmail.com</a></p>
 </div>
 
 </div>
 
 <div class="footer-right">
 
 <p class="footer-company-about">
 <span>About the Organization </span>
 Launched in 1978, SriLankan Airlines is an award winning airline with a solid reputation for service, comfort, safety, reliability, and punctuality

 </p>
 
 <div class="footer-icons">
 
 <a href="#"><i class="fa fa-facebook"></i></a>
 <a href="#"><i class="fa fa-twitter"></i></a>
 <a href="#"><i class="fa fa-linkedin"></i></a>
 <a href="#"><i class="fa fa-github"></i></a>
 
 </div>
 
 </div>
 
 </footer>
 <br><br>
    </body>
</html> 