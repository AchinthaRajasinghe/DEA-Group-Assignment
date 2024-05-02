<%-- 
    Document   : login
    Created on : May 24, 2022, 2:50:08 PM
    Author     : Aveesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <style>
        body
{
  background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("159.jpg") center/cover no-repeat;
}

.container
{
  background-color: rgba(0,0,0,.6);
  border-radius: 20px;
  box-sizing: border-box;
  height: 800px;
  padding: 20px;
  width: 500px;
}

.logo img
{
    width:  150px;
    float:  left;
    height:  auto;
    margin: 2rem;
    border-radius: 5rem;
}

.logo img:hover
{
    transform: scale(1.2);
    border: 3px solid #ff1a1a;
    border-radius: 5rem;
}

.title
{
  color: #eee;
  font-family: sans-serif;
  font-size: 20px;
  font-weight: 700;
  margin-top: 10px;
  padding: 0;
}

.subtitle 
{
  color: #eee;
  font-family: sans-serif;
  font-size: 16px;
  font-weight: 300;
  margin-top: 10px;
}

.submit 
{
  background-color: #08d;
  border-radius: 20px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  cursor: pointer;
  font-size: 18px;
  height: 40px;
  margin-top: 10px;
  text-align: center;
  width: 50%;
}

.submit:hover
{
  background-color: #0000e6;
  border-radius: 20px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  cursor: pointer;
  font-size: 19px;

}

.submit2 
{
  background-color: #08d;
  border-radius: 20px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  cursor: pointer;
  font-size: 16px;
  height: 30px;
  width: 18%;
}

.submit2:hover
{
  background-color: #0000e6;
  border-radius: 20px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  cursor: pointer;
  font-size: 17px;
  height: 30px;
  width: 18%;
}


.submit:active 
{
  background-color: #06b;
  cursor: pointer;
}

    </style>
	<script>
		function Cancle()
		{
			window.location.href="main.jsp"
		}

		 function closeform()
        {
            document.getElementById("login").style.display="none";
        }
		
		function totalIt() 
		{
		var input = document.getElementsByName("ddlselect");
		var total = 0;
		for (var i = 0; i < input.length; i++) 
		{
		if (input[i].checked) 
		{
		  total += parseFloat(input[i].value);
		}
		}
		document.getElementById("total").value = total.toFixed();
		}

		function totalIt2() 
		{
		var input = document.getElementsByName("ddlselect2");
		var total = 0;
		for (var i = 0; i < input.length; i++) 
		{
		if (input[i].checked) 
		{
		  total += parseFloat(input[i].value);
		}
		}
		document.getElementById("total2").value =  total.toFixed();
		}

		function TotalPrice()
   		{
   		var P;
   		var Q; 
   		var cal;
   		P=Number(document.bill.total.value);
   		Q=Number(document.bill.total2.value);
   		cal=P+Q;
   		document.bill.txtResult.value=cal;
   		}


	</script>
</head>
<body>
	<center>
		<div class="form-popup" id="myform">


		<div class = "logo" id= "logo" >
            <img src="logo.png">
        </div>

	<div class="container">

		<form name="bill">

			<div class="title">Personal Details</div><br>
			<table>
				<tr>
					<td class="subtitle">First Name</td>
					<td><input type="text" name=""></td>
				</tr>

				<tr>
					<td class="subtitle">Last Name</td>
					<td><input type="text" name=""></td>
				</tr>

				<tr>
					<td class="subtitle">Email</td>
					<td><input type="text" name=""></td>
				</tr>

				<tr>
					<td class="subtitle">Contact</td>
					<td><input type="text" name=""></td>
				</tr>
			</table>


			<hr>
			<br>
			<div class="title">Booking Details</div>
            <br>
			<div class="subtitle">Checkin Date 
				<input type="date" name="Checking"></div><br>

				<label class="subtitle" >CLASS</label>
				
			<input name="ddlselect" class="subtitle" value="100" type="radio" id="p1" onclick="totalIt()"/>
            <font color="white">First Class</font>

            <input name="ddlselect" class="subtitle" value="50" type="radio" id="p1" onclick="totalIt()"/>
            <font color="white">Business Class</font>
            <input name="ddlselect" class="subtitle" value="100" type="radio" id="p1" onclick="totalIt()"/>
            <font color="white">Economy Class</font><br><br>

				<label class="subtitle">Depature Airport</label>


			<select name="ddlselect" value="100" id="p1" onchange="totalIt()">
				<option>*Select*</option>
				<option value="one">Abu Dhabi - United Arab Phoenix</option>
				<option value="two">Adelaide - Australia (ADL)</option>
				<option value="three">Amman - Jordan (AMM)</option>
			</select><br><br>

			<label>
				<label class="subtitle">Destination Airport</label>


			<select name="ddlselect" value="100" id="p1" onchange="totalIt()">
				<option>*Select*</option>
				<option value="one">Abu Dhabi - United Arab Phoenix</option>
				<option value="two">Adelaide - Australia (ADL)</option>
				<option value="three">Amman - Jordan (AMM)</option>
			</select><br><br>

			
        	<br>
            <input type="button" class="submit2" name="Totalcal" id="totalpricedisplay" value="OK"  onclick="TotalPrice()"></button>
        	<br>

			<label id="lblmess"></label><br>
			<button type="submit" class="submit">Booking Now</button>
			<button type="button" class="submit" onclick="Cancle()">Cancle Booking</button>
			<button type="reset" class="submit" onclick="Closeform()">Clear Booking</button>
			
		</form>

		
	</center>
<script type="text/javascript">
	
</script>
</body>
</html>
