<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8" />
	<title>Climate Summary</title>	
	<script src="http://code.jquery.com/jquery-1.10.2.js"></script>	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"></link>
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css"></link>
	<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
	<script src="/js/climate.js"></script>	
	<link rel="stylesheet" href="/css/climate.css">
	<script type="text/javascript">
	 $(document).ready(function() {
	        document.onkeydown = checkKeycode
	        function checkKeycode(e) {
	            var keycode;
	            if (window.event) {
	                keycode = window.event.keyCode;
	            }
	            else if (e) {
	                keycode = e.which;
	            }
	          }
	       });
	</script>
</head>
<body bgcolor="#99b3ff">

	<div style="background-color: #99b3ff"><h1 align="center">CLIMATE SUMMARY</h1></div>
	<table border="0" cellspacing="5" cellpadding="5">
		<tbody>
			<tr>
				<td colspan="2" ><span style="font-weight:bold">DATE RANGE FILTER :</span></td>
			</tr>
			<tr>
				<td>From Date:</td>
				<td><input name="min" id="min" type="text"/></td>
			</tr>
			<tr>
				<td>To Date:</td>
				<td><input name="max" id="max" type="text"/></td>
			</tr>
		</tbody>
	</table>

	<div>
		<br/> <br/>
	</div>
	<table id="climateTable" class="display">
		<thead>
			<tr>
				<th>Id</th>
				<th align="left">Station Name</th>
				<th align="left">Province</th>
				<th align="left">Date</th>
			</tr>
		</thead>		
	</table>
</body>
</html>