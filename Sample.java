import java.sql.*;
import java.util.*;
class Sample
{
 public static void main(String args[])
 {
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   System.out.println("Loaded");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC123","IPC123");
   System.out.println("ESTABLISHED");
   Scanner s=new Scanner(System.in);
   System.out.println("enter your employee id");
   int empno=s.nextInt();
   Statement sct=con.createStatement();
   String sql="select *from emp;
   ResultSet rs=sct.executeQuery(sql);
   boolean result=false;
   while(rs.next())
   {
     if(empno==rs.getInt(1))
     {
      System.out.println("You are valid user");
      System.out.println("Hello"+rs.getString(2));
      result=true;
      break;
     }
   }
   if(result==false)
   {
     System.out.println("Invalid User");
   }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}