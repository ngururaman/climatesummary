$(document).ready( function () {
		 var table = $('#climateTable').DataTable({
				"sAjaxSource": "/climates",
				"sAjaxDataProp": "",
				"order": [[ 0, "asc" ]],
				"aoColumns": [
				      { "mData": "id", "visible": false},
			          { "mData": "stationName", 
				    	  "render": function(mData, type, row, meta){
				    		    var id = row.id;
			           			mData = '<a href="' +"/climateDetails?id="+ id  + '">' + mData + '</a>';
			              		return mData;
			          		}
			           },
					  { "mData": "province" },
					  { "mData": "date" ,
						  "render": function (data) {
						        var date = new Date(data);
						        var month = date.getMonth() + 1;
						        return (month.length ==2 ? month : "0" + month) + "/" + (date.getDate().length == 2 ? date.getDate() : "0" + date.getDate()) + "/" + date.getFullYear();
						    }}					 
				]
		 })
	});
	
$(document).ready(function(){
    $.fn.dataTable.ext.search.push(
    function (settings, data, dataIndex) {
        var min = $('#min').datepicker("getDate");
        var max = $('#max').datepicker("getDate");
        var startDate = new Date(data[3]);
        if (min == null && max == null) { return true; }
        if (min == null && startDate <= max) { return true;}
        if(max == null && startDate >= min) {return true;}
        if (startDate <= max && startDate >= min) { return true; }
        return false;
    }
    );

   
        $("#min").datepicker({ onSelect: function () { table.draw(); }, changeMonth: true, changeYear: true });
        $("#max").datepicker({ onSelect: function () { table.draw(); }, changeMonth: true, changeYear: true });
        var table = $('#climateTable').DataTable();

        // Event listener to the two range filtering inputs to redraw on input
        $('#min, #max').change(function () {
            table.draw();
        });
    });