
function validate(){

	var id = document.getElementById("adminid");
	var pass = document.getElementById("password");

	if(id.value==""){
		alert("Please enter your Admin ID");
	}
	else if(pass.value==""){
		alert("Please enter your Password");
	}
	
}
