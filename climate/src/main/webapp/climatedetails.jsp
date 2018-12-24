<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Climate Details</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" href="/css/climatedetails.css">
	
<script>
	var idValue =${id};
	$.ajax({
		url : "/climate/"+idValue,
		dataType : 'json'
	}).done(function(data, statusText, resObject) {
		var jsonData = resObject.responseJSON
		document.getElementById("stationName").innerHTML = jsonData.stationName;
		document.getElementById("province").innerHTML = jsonData.province;
		document.getElementById("date").innerHTML = jsonData.date;
		document.getElementById("meanTemp").innerHTML = jsonData.meanTemp;
		document.getElementById("highestMonthlyMaxiTemp").innerHTML = jsonData.highestMonthlyMaxiTemp;
		document.getElementById("lowestMonthlyMinTemp").innerHTML = jsonData.lowestMonthlyMinTemp;
	})
</script>
</head>
<body>

	<form>
		<input type="button" value="Go back!" onclick="history.back()"
			style="float: right;">
	</form>
	<div style="background-color: #99b3ff">
		<h1 align="center">CLIMATE DETAILS</h1>
	</div>
	<div align="center">
	<table>
		<tr>
			<td>StationName</td>
			<td  id="stationName"></td>
		</tr>
		<tr>
			<td>Province</td>
			<td  id="province"></td>
		</tr>
		<tr>
			<td>Date</td>
			<td  id="date"></td>
		</tr>
		<tr>
			<td>Mean Temp</td>
			<td  id="meanTemp"></td>
		</tr>
		<tr>
			<td>Highest Monthly Max Temp</td>
			<td  id="highestMonthlyMaxiTemp"></td>
		</tr>
		<tr>
			<td>Lowest Monthly Min Temp</td>
			<td  id="lowestMonthlyMinTemp"></td>
		</tr>
	</table>
	</div>
</body>
</html>