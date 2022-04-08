import java.sql.*;
import java.util.*;
class  Example
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC123","IPC123");
System.out.println("ESTABLISHED");
Statement sct=con.createStatement();

ResultSet rs=sct.executeQuery("select * from student");
while(rs.next())
{
System.out.println(rs.getInt(1)+""+rs.getString(1));


}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
