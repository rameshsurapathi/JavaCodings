<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 

<html>

<body>


</body>
</html>
<% 

if ( request.getParameter("sid") != null ){
	
	
	
String connectionURL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";

ResultSet rs = null;

PreparedStatement pst = null;

InputStream sImage;

Connection con = null;

try {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Driver driver = new oracle.jdbc.driver.OracleDriver();
	DriverManager.registerDriver(driver);
	con = DriverManager.getConnection(connectionURL,"system","123456");
	System.out.println("DATABASE CONNECTION ESTABLISHED!n\n");
	
	String sid = request.getParameter("sid");
	String filename = request.getParameter("fname");
	
	
	pst = con.prepareStatement("insert into uploadfile values(?,?)");
	File file = new File(filename);
	FileInputStream fis = new FileInputStream(file);
	pst.setString(1, sid);
	pst.setBinaryStream(2,fis,fis.available());

	int i = pst.executeUpdate();
	System.out.println("1");
	if(i!=0){
	System.out.println("image has been inserted");
	}
	else{
	System.out.println("image is not inserted");
	}

	}
	catch(Exception ex){
	out.println("error :"+ex);
	}
	finally {
	rs.close();
	pst.close();
	con.close();
	}
	
}
%>