import java.sql.*;

public class connect {
    public static void main (String args[]){
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Nakul13@#");
            System.out.println("connected");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from employees");
            while(rs.next()){
                System.out.println("id="+rs.getString(1)+" name="+rs.getString(2));

            }
            
        }
        catch(SQLException s)
    }
}
