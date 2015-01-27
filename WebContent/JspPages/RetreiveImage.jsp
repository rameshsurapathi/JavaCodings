<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 

<html>

<body>

<img src="RetreiveImage.jsp?imgID=12" width="115" border="0"></img>

</body>
</html>
<% 

if ( request.getParameter("imgID") != null ){
	
String connectionURL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";

ResultSet rs = null;

PreparedStatement psmnt = null;

InputStream sImage;

Connection conn = null;

try {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Driver driver = new oracle.jdbc.driver.OracleDriver();
	DriverManager.registerDriver(driver);
	conn = DriverManager.getConnection(connectionURL,"system","123456");
	System.out.println("DATABASE CONNECTION ESTABLISHED!n\n");
	
	psmnt = conn.prepareStatement("SELECT image FROM uploadfile WHERE name=?");
	psmnt.setString(1, "Ramesh"); 
	rs = psmnt.executeQuery();
	Blob imgLen;
	  if(rs.next()){
	  imgLen = rs.getBlob(1);
	  
	  int size=0;
	  byte[] bytearray = new byte[4096];
	  InputStream readImg = rs.getBinaryStream(1);
	  
	  response.reset();
	  response.setContentType("image/jpg");
	  while((size=readImg.read(bytearray))!= -1 )
	  {
	  response.getOutputStream().write(bytearray,0,size);
	  }
	  response.flushBuffer(); 
	  }  
	}
	catch(Exception ex){
	out.println("error :"+ex);
	}
	finally {
	rs.close();
	psmnt.close();
	conn.close();
	}
	
}
%>