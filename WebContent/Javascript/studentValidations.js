

function show_page(x){
	
	   
	var page = document.getElementById("studentmainpage");
	if(x==1){
		
	page.innerHTML = "<iframe src=\"addStudentDetails.jsp\" frameborder=0 width=100% height=400px scrolling=no></iframe>";
	}
	else if(x==2){
		
		page.innerHTML = "<iframe src=\"viewStudentDetails.jsp\" frameborder=0 width=100% height=400px scrolling=no></iframe>";
	}
	
else if(x==3){
		
		page.innerHTML = "<iframe src=\"updateStudentDetails.jsp\" frameborder=0 width=100% height=400px scrolling=no></iframe>";
	}
else if(x==4){
	
	page.innerHTML = "<iframe src=\"deleteStudentDetails.jsp\" frameborder=0 width=100% height=400px scrolling=no></iframe>";
}
}